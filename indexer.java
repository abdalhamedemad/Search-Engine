
import org.tartarus.snowball.ext.PorterStemmer;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
//import org.jsoup.Connection;

import java.sql.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
//import javafx.util.Pair;

public class indexer {

       static int freq(ArrayList<String> s,String str){
            int count =0;
            int i=-1;
            for (String word:s) {
                i++;

                if(word!=null&&word.contains(str)){
                    count++;
                    s.set(i,null);
                }
            }
            return count;

        }



    public static void main(String[] args) {
//        String str = "1212";
//        int num = Integer.parseInt(str);
//        System.out.println(num);
//        String st = Integer.toString(num);


       // List<String> stopwords = Files.readAllLines(Paths.get("C:\\Users\\medoa\\Desktop\\javaprojectapt\\stopwors.txt"));
///
        Connection con = null;
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con2;
            con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\medoa\\Desktop\\javaprojectapt\\New Text Document (2).db");
            System.out.println("sucess");
        } catch (Exception e) {
            System.out.println("faild" + e);
        }
        PreparedStatement ps1 = null;
        ResultSet rs1 = null;

            String sql55 = "SELECT LINK,DOC FROM Crawler";
        try {
            ps1 = con.prepareStatement(sql55);
        } catch (SQLException e) {
            //throw new RuntimeException(e);
        }
        try {
            rs1 = ps1.executeQuery();
        } catch (SQLException e) {
           // throw new RuntimeException(e);
        }
        ///////////////////////////////////////////////////
        ArrayList<String> DocumentPath =new ArrayList<>();
        ArrayList<String>urls=new ArrayList<>();
       while (true) {
           try {
               if (!rs1.next()) break;
           } catch (SQLException e) {
               // throw new RuntimeException(e);
           }
           String url = null;
           String path=null;
           try {
               url = rs1.getString("LINK");
               path = rs1.getString("DOC");
               DocumentPath.add(path);
               urls.add(url);
           } catch (SQLException e) {
               //throw new RuntimeException(e);
               System.out.println(e);
           }
       }
       int n=25; //// num of threads
       for (int i=0;i<n;i++) {
           new multiindexing(DocumentPath, urls,Integer.toString(i) , n, con);
       }



        ///////////////////////////////////////////////////
        System.out.println("ALL USERS\n");
//            while(true) {
//                try {
//                    if (!rs1.next()) break;
//                } catch (SQLException e) {
//                   // throw new RuntimeException(e);
//                }
//                String url = null;
//                try {
//                    url = rs1.getString("LINK");
//                } catch (SQLException e) {
//                    //throw new RuntimeException(e);
//                }
//
//                // System.out.println(firstName+"\n");
//
//
//
//       // String url = "https://geeksforgeeks.org";
//        //Document doc = Jsoup.connect("https://www.wikipedia.org").get();
//        //Document doc = Jsoup.connect("https://www.google.com").get();
//                Document doc = null;
//                try {
//                    doc = Jsoup.connect(url).get();
//                } catch (IOException e) {
//                    System.out.println(e);
//                    continue;
//
//                   // throw new RuntimeException(e);
//                }
//               // System.out.println(doc.text());
//
//
//        Map<String, ArrayList<String>> data = new HashMap<String, ArrayList<String>>();
//
//        data.put(new String("data"), new ArrayList<>());
//        data.get("data").add("hi");
//        System.out.println(data.get("data").get(0));
//        if (data.get("data") == null)
//            System.out.println("empty");
//        else
//            System.out.println("there is element");
//
//        for (Map.Entry<String, ArrayList<String>> me : data.entrySet()) {
//            // Printing keys
//            System.out.print(me.getKey() + ":");
//            for (int i = 0; i < me.getValue().size(); i++) {
//                System.out.println(me.getValue().get(i));
//            }
//        }
//
////        String word= new String();
////        word.toLowerCase();
//        ArrayList<Pair> headers = new ArrayList<>();
//        String[] title = doc.title().split("[, ?.@!#/&]+");
//        ArrayList<String> title_str = new ArrayList<>(Arrays.asList(title));
//                ArrayList<String> title_fcontent = null;
//                try {
//                    title_fcontent = Stemming.stemming(Stemming.remove_Stp_Words(title_str));
//                } catch (IOException e) {
//                   // throw new RuntimeException(e);
//                }
//                for (String st : title_fcontent) {
//            headers.add(new Pair(st, 7));
//        }
//
//        Elements h1 = doc.select("h1");
//        for (Element htag : h1) {
//            String[] Head = htag.text().split("[, ?.@!#/&]+");
//            ArrayList<String> str = new ArrayList<>(Arrays.asList(Head));
//            ArrayList<String> fcontent = null;
//            try {
//                fcontent = Stemming.stemming(Stemming.remove_Stp_Words(str));
//            } catch (IOException e) {
//                //throw new RuntimeException(e);
//            }
//            for (String st : fcontent) {
//                boolean flag = false;
//                for (Pair p1 : headers) {
//                    if (flag = p1.getStr().contains(st))
//                        break;
//                }
//                if (flag)
//                    continue;
//                headers.add(new Pair(st, 6));
//            }
//
//        }
//
//        Elements h2 = doc.select("h2");
//        for (Element htag : h2) {
//            String[] Head = htag.text().split("[, ?.@!#/&]+");
//            ArrayList<String> str = new ArrayList<>(Arrays.asList(Head));
//            ArrayList<String> fcontent = null;
//            try {
//                fcontent = Stemming.stemming(Stemming.remove_Stp_Words(str));
//            } catch (IOException e) {
//                //throw new RuntimeException(e);
//            }
//
//            for (String st : fcontent) {
//                boolean flag = false;
//                for (Pair p1 : headers) {
//                    if (flag = p1.getStr().contains(st))
//                        break;
//                }
//                if (flag)
//                    continue;
//                headers.add(new Pair(st, 5));
//            }
//        }
//
//        Elements h3 = doc.select("h3");
//        for (Element htag : h3) {
//            String[] Head = htag.text().split("[, ?.@!#/&]+");
//            ArrayList<String> str = new ArrayList<>(Arrays.asList(Head));
//            ArrayList<String> fcontent = null;
//            try {
//                fcontent = Stemming.stemming(Stemming.remove_Stp_Words(str));
//            } catch (IOException e) {
//                //throw new RuntimeException(e);
//            }
//            for (String st : fcontent) {
//                boolean flag = false;
//                for (Pair p1 : headers) {
//                    if (flag = p1.getStr().contains(st))
//                        break;
//                }
//                if (flag)
//                    continue;
//                headers.add(new Pair(st, 4));
//            }
//        }
//
//        Elements h4 = doc.select("h4");
//        for (Element htag : h4) {
//            String[] Head = htag.text().split("[, ?.@!#/&]+");
//            ArrayList<String> str = new ArrayList<>(Arrays.asList(Head));
//            ArrayList<String> fcontent = null;
//            try {
//                fcontent = Stemming.stemming(Stemming.remove_Stp_Words(str));
//            } catch (IOException e) {
//               // throw new RuntimeException(e);
//            }
//            for (String st : fcontent) {
//                boolean flag = false;
//                for (Pair p1 : headers) {
//                    if (flag = p1.getStr().contains(st))
//                        break;
//                }
//                if (flag)
//                    continue;
//                headers.add(new Pair(st, 3));
//            }
//        }
//
//
//        Elements h5 = doc.select("h5");
//        for (Element htag : h5) {
//            String[] Head = htag.text().split("[, ?.@!#/&]+");
//            ArrayList<String> str = new ArrayList<>(Arrays.asList(Head));
//            ArrayList<String> fcontent = null;
//            try {
//                fcontent = Stemming.stemming(Stemming.remove_Stp_Words(str));
//            } catch (IOException e) {
//                //throw new RuntimeException(e);
//            }
//            for (String st : fcontent) {
//                boolean flag = false;
//                for (Pair p1 : headers) {
//                    if (flag = p1.getStr().contains(st))
//                        break;
//                }
//                if (flag)
//                    continue;
//                headers.add(new Pair(st, 2));
//            }
//        }
//
//
//        Elements h6 = doc.select("h6");
//        for (Element htag : h6) {
//            //System.out.println(htag.text());
//            //data.put(htag.text(),new ArrayList<>());
//            //data.get(htag.text()).add(url);
//            //data.get(htag.text()).contains("h6");
//            String[] Head = htag.text().split("[, ?.@!#/&]+");
//            ArrayList<String> str = new ArrayList<>(Arrays.asList(Head));
//            ArrayList<String> fcontent = null;
//            try {
//                fcontent = Stemming.stemming(Stemming.remove_Stp_Words(str));
//            } catch (IOException e) {
//               // throw new RuntimeException(e);
//            }
//            for (String st : fcontent) {
//                boolean flag = false;
//                for (Pair p1 : headers) {
//                    if (flag = p1.getStr().contains(st))
//                        break;
//                }
//                if (flag)
//                    continue;
//                headers.add(new Pair(st, 1));
//            }
//        }
//
//
//        String s = doc.text();
//        String[] content = s.split("[, ?.@!#/&;:-]+"); //"[, ?.@]+"
//        ArrayList<String> str = new ArrayList<>(Arrays.asList(content));
//
//                ArrayList<String> fcontent = null;
//                try {
//                    fcontent = Stemming.stemming(Stemming.remove_Stp_Words(str));
//                } catch (IOException e) {
//                 //   throw new RuntimeException(e);
//                }
//                ArrayList<db> DB = new ArrayList<>();
//        float len = fcontent.size();
//        for (String word: fcontent) {
//            System.out.println(word);
//        }
//                int wordindex=0;
//                for (String word : fcontent) {
//                    if(word==null)
//                        continue;
//                    String temp = word;
//                    int count = freq(fcontent, word);
//                    StringBuilder disc=new StringBuilder("");
//                    if(wordindex<=15&&str.size()>=30)
//                    {
//                        for (int i=0;i<30;i++)
//                        {
//                            if(str.get(i)==null)
//                                continue;
//                            disc.append(str.get(i)+" ");
//                        }
//                    }
//                    else if(wordindex<=15&&str.size()<30)
//                    {
//                        for (int i=0;i<str.size();i++)
//                        {
//                            if(str.get(i)==null)
//                                continue;
//                            disc.append(str.get(i)+" ");
//                        }
//                    }
//                    else if(wordindex>15&&str.size()>=wordindex+15)
//                    {
//                        for (int i=wordindex-15;i<wordindex+15;i++)
//                        {
//                            if(str.get(i)==null)
//                                continue;
//                            disc.append(str.get(i)+" ");
//                        }
//                    }
//                    else if(wordindex>15&&str.size()<wordindex+15&&str.size()>30)
//                    {
//                        for (int i=wordindex-30;i<wordindex;i++)
//                        {
//                            if(str.get(i)==null)
//                                continue;
//                            disc.append(str.get(i)+" ");
//                        }
//                    }
//                    else if(wordindex>15&&str.size()<wordindex+15&&str.size()<30)
//                    {
//                        for (int i=wordindex-str.size();i<wordindex;i++)
//                        {
//                            if(str.get(i)==null)
//                                continue;
//                            disc.append(str.get(i)+" ");
//                        }
//                    }
//                    DB.add(new db(word, url, (float) (count / len), 0, disc.toString(), doc.title()));
//                    wordindex++;
//                }
//        for (Pair p1 : headers) {
//            for (db obj : DB) {
//                if (p1.getStr().contains(obj.getWord())) {
//                    obj.setHead(p1.getNum());
//                }
//            }
//        }
//
//
//        for (db obj : DB) {
//
//
//        PreparedStatement pst = null;
//        ResultSet rs = null;
//        obj.setHntf( obj.getNTF()+obj.getHead());
//        String sql = "INSERT INTO Indexer(WORD,DOCS,NTF,HEADERS,DISC,TITLE,HNTF) VALUES ('"+obj.getWord()+"','"+obj.getUrl()+"',"+obj.getNTF()+","+obj.getHead()+",'"+obj.getDisc()+"','"+obj.getTitle()+ "',"+obj.getHntf()+")";
//       //String sql = "INSERT INTO Indexer(WORD,DOCS,NTF,HEADERS,DISC,TITLE) VALUES ('helloworld','hiworld',10,20,'meme','hehe')";
//            try {
//                pst = con.prepareStatement(sql);
//                pst.executeUpdate();
//            } catch (SQLException e) {
//
//                //throw new RuntimeException(e);
//            }
//
//        }
//            }

        /////////////////////////////////////////////////////////////////////////////////////////


//        System.out.println(fcontent.size());
//        for (String word: fcontent) {
//        System.out.println(word);
//        }
        //String[] fcontent=new String[content.length];
//        ArrayList<String> fcontent = new ArrayList<>();
//        for(String word : content) {
//            if(!stopwords.contains(word)) {
//               fcontent.add(word);
//            }
//        }
//        PorterStemmer stemmer = new PorterStemmer();
//        for (String word:fcontent) {
//            word.toLowerCase();
//            System.out.println(word);
//            stemmer.setCurrent(word);
//            stemmer.stem();
//            String result = stemmer.getCurrent();
//            System.out.println(result);
//        }

    }
}
