import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.nio.file.Files;
import java.nio.file.Path;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class multiindexing implements Runnable{
    ArrayList<String>DocumentPath;
    private Thread thread;
    int threadstart;
    int threadend;
    ArrayList<String>urls;
    java.sql.Connection con;
    multiindexing(ArrayList<String>DocumentPath,ArrayList<String>urls,String threadnum,int numofthreads,java.sql.Connection con2){ // thread num from 0-> n-1

        System.out.println("hello iam thread num : "+threadnum);
        this.DocumentPath=DocumentPath;
        this.con=con2;
        this.urls=urls;
        Thread th=new Thread(this);
        th.setName(threadnum);
        int x=Integer.parseInt(threadnum);
        threadstart=x*(DocumentPath.size()/numofthreads);
        threadend=threadstart+(DocumentPath.size()/numofthreads);
        th.start();
    }
   synchronized void insertIntoDataBase( ArrayList<db> DB)
    {
        int x=0;
        for (db obj : DB) {
            if(x==0) {
                Thread ss = Thread.currentThread();
                System.out.println("my name is :" + ss.getName() + "url is : " + obj.getUrl());
                x++;
            }
                PreparedStatement pst = null;
                ResultSet rs = null;
                obj.setHntf( obj.getNTF()+obj.getHead());
                String sql = "INSERT INTO Indexer(WORD,DOCS,NTF,HEADERS,DISC,TITLE,HNTF) VALUES ('"+obj.getWord()+"','"+obj.getUrl()+"',"+obj.getNTF()+","+obj.getHead()+",'"+obj.getDisc()+"','"+obj.getTitle()+ "',"+obj.getHntf()+")";
                //String sql = "INSERT INTO Indexer(WORD,DOCS,NTF,HEADERS,DISC,TITLE) VALUES ('helloworld','hiworld',10,20,'meme','hehe')";
                try {
                    pst = con.prepareStatement(sql);
                    pst.executeUpdate();
                } catch (Exception e) {
                   // System.out.println(e);
                    //throw new RuntimeException(e);
                }

            }


    }
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
    @Override
    public void run() {
        for (int ii=threadstart;ii<threadend;ii++)
        {

            String url=urls.get(ii);
            String docpath=DocumentPath.get(ii);
            // Khaled read document and store in doc

            Path fileName = Path.of(docpath);


            Document doc= null;
            try {
                doc = Jsoup.parse(Files.readString(fileName));
            } catch (Exception e) {
                //throw new RuntimeException(e);
                System.out.println(e);
            }


            Map<String, ArrayList<String>> data = new HashMap<String, ArrayList<String>>();

            data.put(new String("data"), new ArrayList<>());
            data.get("data").add("hi");
            System.out.println(data.get("data").get(0));
            if (data.get("data") == null)
                System.out.println("empty");
            else
                System.out.println("there is element");

            for (Map.Entry<String, ArrayList<String>> me : data.entrySet()) {
                // Printing keys
                System.out.print(me.getKey() + ":");
                for (int i = 0; i < me.getValue().size(); i++) {
                    System.out.println(me.getValue().get(i));
                }
            }

//        String word= new String();
//        word.toLowerCase();
            ArrayList<Pair> headers = new ArrayList<>();
            String[] title = doc.title().split("[, ?.@!#/&]+");
            ArrayList<String> title_str = new ArrayList<>(Arrays.asList(title));
            ArrayList<String> title_fcontent = null;
            try {
                title_fcontent = Stemming.stemming(Stemming.remove_Stp_Words(title_str));
            } catch (Exception e) {
                // throw new RuntimeException(e);
            }
            for (String st : title_fcontent) {
                headers.add(new Pair(st, 7));
            }

            Elements h1 = doc.select("h1");
            for (Element htag : h1) {
                String[] Head = htag.text().split("[, ?.@!#/&]+");
                ArrayList<String> str = new ArrayList<>(Arrays.asList(Head));
                ArrayList<String> fcontent = null;
                try {
                    fcontent = Stemming.stemming(Stemming.remove_Stp_Words(str));
                } catch (Exception e) {
                    System.out.println(e);
                    //throw new RuntimeException(e);
                }
                for (String st : fcontent) {
                    boolean flag = false;
                    for (Pair p1 : headers) {
                        flag = p1.getStr().contains(st);
                        if (flag)
                            break;
                    }
                    if (flag)
                        continue;
                    headers.add(new Pair(st, 6));
                }

            }

            Elements h2 = doc.select("h2");
            for (Element htag : h2) {
                String[] Head = htag.text().split("[, ?.@!#/&]+");
                ArrayList<String> str = new ArrayList<>(Arrays.asList(Head));
                ArrayList<String> fcontent = null;
                try {
                    fcontent = Stemming.stemming(Stemming.remove_Stp_Words(str));
                } catch (Exception e) {
                    System.out.println(e);
                    //throw new RuntimeException(e);
                }

                for (String st : fcontent) {
                    boolean flag = false;
                    for (Pair p1 : headers) {
                        flag = p1.getStr().contains(st);
                        if (flag)
                            break;
                    }
                    if (flag)
                        continue;
                    headers.add(new Pair(st, 5));
                }
            }

            Elements h3 = doc.select("h3");
            for (Element htag : h3) {
                String[] Head = htag.text().split("[, ?.@!#/&]+");
                ArrayList<String> str = new ArrayList<>(Arrays.asList(Head));
                ArrayList<String> fcontent = null;
                try {
                    fcontent = Stemming.stemming(Stemming.remove_Stp_Words(str));
                } catch (Exception e) {
                    System.out.println(e);
                    //throw new RuntimeException(e);
                }
                for (String st : fcontent) {
                    boolean flag = false;
                    for (Pair p1 : headers) {
                        flag = p1.getStr().contains(st);
                        if (flag)
                            break;
                    }
                    if (flag)
                        continue;
                    headers.add(new Pair(st, 4));
                }
            }

            Elements h4 = doc.select("h4");
            for (Element htag : h4) {
                String[] Head = htag.text().split("[, ?.@!#/&]+");
                ArrayList<String> str = new ArrayList<>(Arrays.asList(Head));
                ArrayList<String> fcontent = null;
                try {
                    fcontent = Stemming.stemming(Stemming.remove_Stp_Words(str));
                } catch (Exception e) {
                    System.out.println(e);
                    // throw new RuntimeException(e);
                }
                for (String st : fcontent) {
                    boolean flag = false;
                    for (Pair p1 : headers) {
                        flag = p1.getStr().contains(st);
                        if (flag)
                            break;
                    }
                    if (flag)
                        continue;
                    headers.add(new Pair(st, 3));
                }
            }


            Elements h5 = doc.select("h5");
            for (Element htag : h5) {
                String[] Head = htag.text().split("[, ?.@!#/&]+");
                ArrayList<String> str = new ArrayList<>(Arrays.asList(Head));
                ArrayList<String> fcontent = null;
                try {
                    fcontent = Stemming.stemming(Stemming.remove_Stp_Words(str));
                } catch (Exception e) {
                    System.out.println(e);
                    //throw new RuntimeException(e);
                }
                for (String st : fcontent) {
                    boolean flag = false;
                    for (Pair p1 : headers) {
                        flag = p1.getStr().contains(st);
                        if (flag)
                            break;
                    }
                    if (flag)
                        continue;
                    headers.add(new Pair(st, 2));
                }
            }


            Elements h6 = doc.select("h6");
            for (Element htag : h6) {
                //System.out.println(htag.text());
                //data.put(htag.text(),new ArrayList<>());
                //data.get(htag.text()).add(url);
                //data.get(htag.text()).contains("h6");
                String[] Head = htag.text().split("[, ?.@!#/&]+");
                ArrayList<String> str = new ArrayList<>(Arrays.asList(Head));
                ArrayList<String> fcontent = null;
                try {
                    fcontent = Stemming.stemming(Stemming.remove_Stp_Words(str));
                } catch (Exception e) {
                    System.out.println(e);
                    // throw new RuntimeException(e);
                }
                for (String st : fcontent) {
                    boolean flag = false;
                    for (Pair p1 : headers) {
                        flag = p1.getStr().contains(st);
                        if (flag)
                            break;
                    }
                    if (flag)
                        continue;
                    headers.add(new Pair(st, 1));
                }
            }


            String s = doc.text();

            ////////////abdal-hamed added this new
           // s=s.replaceAll("[a-zA-Z0-9]"," ");
            //s=s.replaceAll("[\\n\\t]"," ");

            ////////////////////////////////////////////////
            String[] content = s.split("[, ?.@!#/&;:-]+"); //"[, ?.@]+"
            ArrayList<String> str = new ArrayList<>(Arrays.asList(content));

            ArrayList<String> fcontent = null;
            try {
                fcontent = Stemming.stemming(Stemming.remove_Stp_Words(str));
            } catch (Exception e) {
                System.out.println(e);
                //   throw new RuntimeException(e);
            }
            ArrayList<db> DB = new ArrayList<>();
            float len = fcontent.size();
            for (String word: fcontent) {
                //System.out.println(word);
            }
            int wordindex=0;
            for (String word : fcontent) {
                if(word==null)
                    continue;
                String temp = word;
                int count = freq(fcontent, word);
                StringBuilder disc=new StringBuilder("");
                if(wordindex<=15&&str.size()>=30)
                {
//                    for (int i=0;i<30;i++)
//                    {
//                        if(str.get(i)==null)
//                            continue;
//                        disc.append(str.get(i)+" ");
//                    }
                }
                else if(wordindex<=15&&str.size()<30)
                {
//                    for (int i=0;i<str.size();i++)
//                    {
//                        if(str.get(i)==null)
//                            continue;
//                        disc.append(str.get(i)+" ");
//                    }
                }
                else if(wordindex>15&&str.size()>=wordindex+15)
                {
//                    for (int i=wordindex-15;i<wordindex+15;i++)
//                    {
//                        if(str.get(i)==null)
//                            continue;
//                        disc.append(str.get(i)+" ");
//                    }
                }
                else if(wordindex>15&&str.size()<wordindex+15&&str.size()>30)
                {
//                    for (int i=wordindex-30;i<wordindex;i++)
//                    {
//                        if(str.get(i)==null)
//                            continue;
//                        disc.append(str.get(i)+" ");
//                    }
                }
                else if(wordindex>15&&str.size()<wordindex+15&&str.size()<30)
                {
//                    for (int i=wordindex-str.size();i<wordindex;i++)
//                    {
//                        if(str.get(i)==null)
//                            continue;
//                        disc.append(str.get(i)+" ");
//                    }
                }
                //disc="";
//                DB.add(new db(word, url, (float) (count / len), 0, disc.toString(), doc.title()));
                DB.add(new db(word, url, (float) (count / len), 0,"", doc.title()));

                wordindex++;
            }
            for (Pair p1 : headers) {
                for (db obj : DB) {
                    if (p1.getStr().contains(obj.getWord())) {
                        obj.setHead(p1.getNum());
                    }
                }
            }

            insertIntoDataBase(DB);

//
//            for (db obj : DB) {
//
//
//                PreparedStatement pst = null;
//                ResultSet rs = null;
//                obj.setHntf( obj.getNTF()+obj.getHead());
//                String sql = "INSERT INTO Indexer(WORD,DOCS,NTF,HEADERS,DISC,TITLE,HNTF) VALUES ('"+obj.getWord()+"','"+obj.getUrl()+"',"+obj.getNTF()+","+obj.getHead()+",'"+obj.getDisc()+"','"+obj.getTitle()+ "',"+obj.getHntf()+")";
//                //String sql = "INSERT INTO Indexer(WORD,DOCS,NTF,HEADERS,DISC,TITLE) VALUES ('helloworld','hiworld',10,20,'meme','hehe')";
//                try {
//                    pst = con.prepareStatement(sql);
//                    pst.executeUpdate();
//                } catch (Exception e) {
//                    System.out.println(e);
//                    //throw new RuntimeException(e);
//                }
//
//            }




        }



    }
}
