import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.FileWriter;
import java.sql.Connection ;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.sql.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class recrawl extends Thread implements Runnable {
    private Thread thread;
    private Map<String, Double> url_hash;
    private Map<String, String> url_doc;
    private ArrayList<String> urls;
    private int id;
    private int no_threads;

    public recrawl(Map<String, Double> url_hash, Map<String, String> url_doc, ArrayList<String> urls, int id, int no_threads) {
        this.url_hash = url_hash;
        this.url_doc = url_doc;
        this.urls = urls;
        this.id = id;
        this.no_threads = no_threads;
        thread = new Thread(this);
        thread.start();
    }

    public void run() {
        int amount=(urls.size() / no_threads);
        int start = id * amount;
        int end = (amount) * (id + 1);
        for (int i = start; i < end; i++) {
            String link = urls.get(i);
            String path = url_doc.get(link);
            Document d=request(link);
            if(d!=null){
                String S= d.text();
                double x=0;
                int j=0;
                for(int k=0; k<S.length(); k++){
                    double temp=(double) S.charAt(k);
                    x+= temp*(k+5);
                    j++;
                    if(j==50)
                        break;
                }
                if(x!=url_hash.get(link)){
                    File f=new File(path);
                    if(f.delete()){
                        File myObj = new File(path);
                        try {
                            if (myObj.createNewFile()) {
                                System.out.println("File created: " + myObj.getName());
                            } else {
                                System.out.println("File already exists.");
                            }
                        } catch (Exception e) {
                            // throw new RuntimeException(e);
                            System.out.println(e);

                        }
                        FileWriter myWriter = null;
                        try {
                            myWriter = new FileWriter(myObj.getAbsolutePath());
                        } catch (Exception e) {
                            //throw new RuntimeException(e);
                            System.out.println(e);
                        }
                        try {
                            myWriter.write(d.toString());
                        } catch (Exception e) {
                            //throw new RuntimeException(e);
                            System.out.println(e);
                        }
                        try {
                            myWriter.close();
                        } catch (Exception e) {
                            //throw new RuntimeException(e);
                            System.out.println(e);
                        }
                        System.out.println(myObj.getAbsolutePath());
                    }
                }
            }


        }
    }

    private Document request(String url) {
        try {

            org.jsoup.Connection con = Jsoup.connect(url);
            Document doc = con.get();
//            if(Dbvisitedlinks.contains(url))
//            {
//                return null;
//            }
            if (con.response().statusCode() == 200) {

                return doc;
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }
}

public class mainn {

    static boolean ReCrawl(Connection con) {
        boolean re ;
        System.out.println("Choose 1 or 2");
        System.out.println("1- To Recrawl your existing links \n2- Start crawel ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num == 1) {
            re=true;
            System.out.println("Enter the number of threads you neaded to recrawl");
            in = new Scanner(System.in);
            num = in.nextInt();
            Map<String, Double> url_hash = new HashMap<>();
            Map<String, String> url_doc = new HashMap<>();
            ArrayList<String> urls = new ArrayList<>();
            PreparedStatement ps = null;                                                                                              //
            ResultSet rs = null;                                                                                                       //
            try {
                String sql = "SELECT DOC,LINK,KEY FROM Crawler";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    String doc = rs.getString("DOC");
                    //Path fileName = Path.of(doc);
                    String link = rs.getString("LINK");
                    String key = rs.getString("KEY");
                    urls.add(link);
                    url_hash.put(link, Double.parseDouble(key));
//                    Document d=null;
//                    try {
//                         d= Jsoup.parse(Files.readString(fileName));
//                    } catch (IOException e) {
//                        //throw new RuntimeException(e);
//                        System.out.println(e);
//                    }
                    url_doc.put(link, doc);
                }
            } catch (SQLException ex) {
                //throw new RuntimeException(ex);
                System.out.println(ex);
            }
            ArrayList<recrawl> bots = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                bots.add(new recrawl(url_hash, url_doc, urls, i, num));
            }
        } else {
            re=false;
            File directory = new File("C:\\Users\\medoa\\Desktop\\javaprojectapt\\DOCS");
            try {
                FileUtils.cleanDirectory(directory);
            } catch (IOException e) {
                // throw new RuntimeException(e);
                System.out.println(e);
            }
            PreparedStatement ps = null;                                                                                              //
            ResultSet rs = null;                                                                                                       //
            try {
                String sql = "DELETE FROM Crawler";
                ps = con.prepareStatement(sql);
                ps.executeUpdate();
            }catch (SQLException ex) {
                //throw new RuntimeException(ex);
                System.out.println(ex);
            }
            try {
                String sql = "DELETE FROM Link_Link";
                ps = con.prepareStatement(sql);
                ps.executeUpdate();
            }catch (SQLException ex) {
                //throw new RuntimeException(ex);
                System.out.println(ex);
            }

        }


        return re;
    }

    public static void main(String[] args){




        // Thread.setDaemon(true);
        Connection con = null;
        Connection con33 = null;

        try {
            Class.forName("org.sqlite.JDBC");
            Connection con2;
            con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\medoa\\Desktop\\javaprojectapt\\New Text Document (2).db");
            con33 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\medoa\\Desktop\\javaprojectapt\\storeddatabase\\New Text Document (2).db");
            System.out.println("sucess");
        } catch (Exception e) {

            System.out.println("faild" + e);
        }


        boolean re=ReCrawl(con);
        if(!re) {
            ArrayList<String> visitedlinks = new ArrayList<>();
            ArrayList<Double> keys = new ArrayList<>();
            ArrayList<String> Urls = new ArrayList<String>();
            Map<String, ArrayList<String>> mp = new HashMap<>();
            Map<String, String> link_path = new HashMap<>();


            try {
                File myObj = new File("seeds.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    Urls.add(data);
                    System.out.println(data);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

//        Urls.add("http://www.geeksforgeeks.org");
//        Urls.add("https://stackoverflow.com");
//        Urls.add("http://google.com");
//        Urls.add("https://www.laliga.com/en-GB");
//        Urls.add("https://www.tutorialspoint.com/tutorialslibrary.htm");
//        Urls.add("https://www.uefa.com/");
//        Urls.add("https://www.ligue1.com/");
//        Urls.add("https://www.javatpoint.com/");
//        Urls.add("https://www.w3schools.com/");
//        Urls.add("https://www.realmadrid.com/");
//        Urls.add("https://www.fcbarcelona.com/en/");
//        Urls.add("https://www.spacex.com/");
//        Urls.add("https://www.amazon.com/");
//        Urls.add("https://www.tesla.com/");
//        Urls.add("https://www.uefa.com/");

            ArrayList<String> Dbvistedlinks = new ArrayList<>();
            Connection con77 = null;
            try {
                Class.forName("org.sqlite.JDBC");
                Connection con2;
                con77 = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\medoa\\Desktop\\javaprojectapt\\New Text Document (2).db");
                System.out.println("sucess");
            } catch (Exception e) {
                System.out.println("faild" + e);
            }
            PreparedStatement ps1 = null;
            ResultSet rs1 = null;
            try {
                String sql55 = "SELECT LINK FROM Crawler";
                ps1 = con77.prepareStatement(sql55);
                rs1 = ps1.executeQuery();
                System.out.println("ALL USERS\n");
                while (rs1.next()) {
                    String url = rs1.getString("LINK");
                    Dbvistedlinks.add(url);
                }
            } catch (SQLException e) {
                // throw new RuntimeException(e);
            }
            ////// Read num of thread from the user///////////
            int num;

            // Input the integer
            System.out.println("Enter the integer number of threads: ");

            // Create Scanner object
            Scanner s = new Scanner(System.in);

            // Read the next integer from the screen
            num = s.nextInt();

            // Display the integer
            System.out.println("Entered integer is: "
                    + num);

            int n = num;
            ArrayList<crawler> bots = new ArrayList<>();

            //  int num_of_thread=5;
            //    int i=0;
            // ArrayList<Thread> th=new ArrayList<Thread>();
     /*   while (num_of_thread!=0)
        {
            if(Urls.get(i) !="")
            {
                Thread t=new crawler(Urls.get(i),i,visitedlinks,keys,con,Dbvistedlinks);
                t.start();
                //th.get(i).start();
                num_of_thread--;
            }

        }
        for (Thread t:th)
        {
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }


*/


            for (int i = 0; i < n; i++) {
                bots.add(new crawler(Urls.get(i), i, visitedlinks, keys, con, Dbvistedlinks, mp, link_path));
            }
            System.out.println("finish crawling ,\n starting inserting in data base");
//        while (true)
//        {
//
//            if(visitedlinks.size()>=5000)
//                break;
//        }
////        for(int i=0; i<n; i++){
////            try {
////                bots.get(i).getThread().join();
////            } catch (InterruptedException e) {
////                throw new RuntimeException(e);
////            }
////        }
////
//        System.out.println("finish crawling ,\n starting inserting in data base");
//        Connection finalCon = con;
//        new Thread(){
//    @Override
//    public void run() {
//       // super.run();
//        PreparedStatement pst = null;                                                                                              //
//        ResultSet rs = null;//
//
//        for(Map.Entry<String,ArrayList<String>> map: mp.entrySet()){
//            for(String str:map.getValue()){
//                String sql = "INSERT INTO Link_Link(FROM_LINK,TO_LINK) VALUES ( '" + map.getKey() + "','" + str + "')";
//                try {                                                                                                                      //
//                    pst = finalCon.prepareStatement(sql);                                                                                     //
//                } catch (
//                        Exception e) {                                                                                                //
//                    // throw new RuntimeException(e);
//                    System.out.println(e);
//                }                                                                                                                         //
//                try {                                                                                                                     //
//                    pst.executeUpdate();                                                                                                  //
//                } catch (
//                        Exception e) {                                                                                                //
//                    //throw new RuntimeException(e);
//                    System.out.println(e);
//                }
//            }
//        }
//                                   //
//        //String sql = "INSERT INTO Indexer(WORD,DOCS,NTF,HEADERS,DISC,TITLE) VALUES ('helloworld','hiworld',10,20,'meme','hehe')";//
//
//
//    }
//}.start();
//        Connection finalCon3 = con33;
//        new Thread(){
//            @Override
//            public void run() {
//                //super.run();
//
//                for (int i = 0; i < visitedlinks.size(); i++) {
//                    PreparedStatement pst = null;
//                    ResultSet rs = null;
//                    String link=visitedlinks.get(i);
//                    String sql = "INSERT INTO Crawler(DOC,LINK,KEY) VALUES ( '" + link_path.get(link) + "','" + link + "'," + keys.get(i) + ")";
//                    //String sql = "INSERT INTO Indexer(WORD,DOCS,NTF,HEADERS,DISC,TITLE) VALUES ('helloworld','hiworld',10,20,'meme','hehe')";
//                    try {
//                        pst = finalCon.prepareStatement(sql);
//                    } catch (Exception e) {
//                        //throw new RuntimeException(e);
//                        System.out.println(e);
//                    }
//                    try {
//                        pst.executeUpdate();
//                    } catch (Exception e) {
//                        //throw new RuntimeException(e);
//                        System.out.println(e);
//                    }
//
//
//                }
//            }
//        }.start();
            System.out.println("hiiiiiiii ");
            Thread t = Thread.currentThread();

            int count = Thread.activeCount();

        }
    }
}
