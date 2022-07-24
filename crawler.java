import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
//import exception and collection classes
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.sql.*;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.io.File;
import java.io.FileWriter;


public class crawler extends Thread implements Runnable {
    static int counter=0;
    private static final int MAX_DEPTH=50;
    private Thread thread;
    private String first_link;
    private ArrayList<String> visitedlinks ; //2D array for uniqueness
    private ArrayList<String> Dbvisitedlinks ; // check for interruption
    private int ID;
    private ArrayList<Double> keys;

    private Map<String,ArrayList<String>> mp;
    private Map<String,String> link_path = new HashMap<>();

    java.sql.Connection con2;

    synchronized String create_write(Document doc)  {
        String txt = doc.toString();
//        File myObj = new File("C:\\Users\\medoa\\Desktop\\javaprojectapt\\DOCS\\"+visitedlinks.size()+".txt");
        File myObj = new File("C:\\Users\\medoa\\Desktop\\javaprojectapt\\DOCS\\"+counter+".txt");
        counter++;
        try {
            if (myObj.createNewFile()) {
               // System.out.println("File created: " + myObj.getName());
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

            System.out.println(e);
        }
        try {
            myWriter.write(txt);
        } catch (Exception e) {

            System.out.println(e);
        }
        try {
            myWriter.close();
        } catch (Exception e) {

            System.out.println(e);
        }
        System.out.println(myObj.getAbsolutePath());
        return myObj.getAbsolutePath();
    }

    public crawler(String link, int num ,ArrayList<String> visitedUrls, ArrayList<Double> keys, java.sql.Connection con2,ArrayList<String>dblinks,Map<String,ArrayList<String>> mp, Map<String,String> link_path ){
        this.keys=keys;
        visitedlinks=visitedUrls;
        this.link_path=link_path;
        this.mp=mp;
        System.out.print("iam crawler"+num);
        first_link=link;
        ID=num;
        this.con2=con2;
        this.Dbvisitedlinks=dblinks;
       thread=new Thread(this);
       thread.start();

    }
    public void run(){
        crawl(1,first_link,"host");
    }
    void setlinstatus(String url,int x)
    {
        PreparedStatement pst = null;
        ResultSet rs = null;
//        String sql = "UPDATE links SET visited =" + x +"WHERE link =" +"'"+ url + "" ;
//        //String sql = "INSERT INTO Indexer(WORD,DOCS,NTF,HEADERS,DISC,TITLE) VALUES ('helloworld','hiworld',10,20,'meme','hehe')";
        String sql = "UPDATE links SET visited =? WHERE link =?" ;

        try {
            pst = con2.prepareStatement(sql);
            pst.setInt(1,x);
            pst.setString(2,url);
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println(e);
        }
        try {
            pst.executeUpdate();
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println(e);
        }


    }
    synchronized String insert_in_list(Document doc, String url, double x, ArrayList<Double> keys, ArrayList<String> visitedlinks){
        String path;
        keys.add(x);
        visitedlinks.add(url);
        try {
            path = create_write(doc);
        } catch (Exception e) {
            System.out.println(e);

            return"";
        }
        link_path.put(url,path);
        // iam not testing this yet seravh for the third editing ---
        insert_in_db(path,url,x);
        return path;
    }

    private void crawl(int level, String url, String parent){

        if(/*level<=MAX_DEPTH||*/!(visitedlinks.size()>=5000)) {
            if (level <= MAX_DEPTH)
            {        Document doc = request(url,parent); // url+robots.txt
//            Document doc1 = null;
//            boolean bb = false;
//            try {
//                URL ds = new URL(url);
//                String strHost = ds.getHost();
//
//                String strRobot = "http://" + strHost + "/robots.txt";
//                System.out.println(strRobot);
//                doc1 = Jsoup.connect(strRobot).get();
//            } catch (IOException e) {
//                //throw new RuntimeException(e);
//                bb = true;
//                System.out.println("error");
//
//            }
//            if (bb) {
//                System.out.println("fvnjvn");
//            }
                if(doc!=null) {
                  //  inserttodatabase(url, 0);
//                    for (Element link : doc.select("a[href]")) {
//                        String next_link = link.absUrl("href");
//                        inserttodatabase(url, 0);
//                    }
                }
            boolean f = true;
            boolean k=false;
            if (doc != null) {
                for (Element link : doc.select("a[href]")) {
                    String next_link = link.absUrl("href");
                    //if (doc1 != null) {
                       // f = checkifcontaindiallows(doc1, next_link);
                        try {
                            URL u=new URL(next_link);
                          //  f = robotSafe(u);
                            k=true;
                        } catch (MalformedURLException e) {
                            //throw new RuntimeException(e);
                            f=true;
                        }

                   // }
                    if (visitedlinks.contains(next_link) == false  ) {
                        //inserttodatabase(next_link, 0);
                        crawl(level++, next_link,url);
                       // System.out.println(next_link);
                        //setlinstatus(url,1);

                    }
                    else{

                        insertLink_Link( parent,url);
                    }

                }

            }
        }
        }
    }
    private Document request(String url,String parent){
        if(!finrobotstxt.robtostxtcheck5(url))
        {
            System.out.println("found dissallow at :"+url);
            return null;
        }

        try {

            org.jsoup.Connection con = Jsoup.connect(url);
            Document doc = con.get();
//            if(Dbvisitedlinks.contains(url))
//            {
//                return null;
//            }
            if (con.response().statusCode() == 200||true) {
                System.out.println();
                String title = doc.title();
               // System.out.println(title);
                String s = doc.text();
                Double x;
                //if(s!=null) {
                x = Hash(s);
                if (keys.contains(x) == true) {

                    int ix=keys.indexOf(x);
                    String ss=visitedlinks.get(ix);
                    if(ss !=parent)
                    insertLink_Link(parent, ss);
                    return null;
                }
//                synchronized (keys) {
//                    keys.add(x);
//                }

                String path=insert_in_list(doc,url,x,keys,visitedlinks);
//                if(visitedlinks.contains(url)){
//                    insertLink_Link( parent,url);
//                }
                //}
//                synchronized (visitedlinks) {
//                    visitedlinks.add(url);
//                }

                insertLink_Link( parent,url);
                ////// here the third editing i am never testing this yet ----
                //insert_in_db(path,url,x);
                /////////////////////////////////
                return doc;
            }
            return null;
        }
        catch (Exception e){
            return null;
        }


    }
    public Thread getThread(){
        return thread;
    }
    public double Hash(String S){
        double x=0;
        int j=0;
        for(int i=0; i<S.length(); i++){
            double temp=(double) S.charAt(i);
            x+= temp*(i+5);
            j++;
            if(j==50)
                break;
        }
        return x;
    }


    synchronized void insert_in_db(String path,String url, double x){
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "INSERT INTO Crawler(DOC,LINK,KEY) VALUES ( '"+path+"','" + url + "'," + x + ")";
        //String sql = "INSERT INTO Indexer(WORD,DOCS,NTF,HEADERS,DISC,TITLE) VALUES ('helloworld','hiworld',10,20,'meme','hehe')";
        try {
            pst = con2.prepareStatement(sql);
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println(e);
        }
        try {
            pst.executeUpdate();
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println(e);
        }

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    synchronized void insertLink_Link(String from, String to){////////////////////////////////////////////////////////////////////////


        if(mp.containsKey(from)==false){
            mp.put(from,new ArrayList<>());
            mp.get(from).add(to);
        }
        else{
            if(mp.get(from).contains(to)) {
                return;
            }
            mp.get(from).add(to);
        }
        PreparedStatement pst = null;                                                                                              //
        ResultSet rs = null;                                                                                                       //
        String sql = "INSERT INTO Link_Link(FROM_LINK,TO_LINK) VALUES ( '" + from + "','" + to + "')";                             //
        //String sql = "INSERT INTO Indexer(WORD,DOCS,NTF,HEADERS,DISC,TITLE) VALUES ('helloworld','hiworld',10,20,'meme','hehe')";//
        try {                                                                                                                      //
            pst = con2.prepareStatement(sql);                                                                                     //
        } catch (
                Exception e) {                                                                                                //
           // throw new RuntimeException(e);
            System.out.println(e);
        }                                                                                                                         //
        try {                                                                                                                     //
            pst.executeUpdate();                                                                                                  //
        } catch (
                Exception e) {                                                                                                //
            //throw new RuntimeException(e);
            System.out.println(e);
        }

    }                                                                                                                              //
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


}
