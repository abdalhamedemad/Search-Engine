

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Scanner;

public class finrobotstxt {
    public  static boolean robtostxtcheck5(String urll){


        StringBuilder s51 = new StringBuilder();
        String targeturl=urll;
        String path = null;

        try {

            URL url = new URL(urll);
            path=url.getPath();
            String strHost = url.getHost();
           // System.out.println(url.getPath());
            String strRobot = "https://" + strHost + "/robots.txt";
            URL url2 = new URL(strRobot);
          //  System.out.println(strRobot);
            URLConnection urlcon = url2.openConnection();
            InputStream stream = urlcon.getInputStream();
            int i;

            while ((i = stream.read()) != -1) {
               // System.out.print((char) i);
                s51.append((char) i);

            }
        } catch (Exception e) {
            System.out.println(e);
            return true;
        }
        //String[] str5=doc.text().split("[\s]");
        String gg = s51.toString();
        String [] str5=gg.split("\n");
        int i=-1;
        boolean b=false;
        ArrayList<String> s11=new ArrayList();
        for (String s: str5)
        {
           // System.out.println(s);
            //System.out.println("ww");

        }
        for (String s : str5)
        {
            i++;
          //  System.out.println(s);
            String line = str5[i].trim();
            if (line.toLowerCase().startsWith("user-agent")&&!b)
            {
                int start = line.indexOf(":") + 1;
                int end   = line.length();
                String st=line.substring(start, end).trim();
                for (int i1=0;i1<st.length();i1++)
                {
                    if(st.indexOf(i)=='*')
                    {
                        b=true;
                       // continue;
                    }
                    if(i==2)
                    {break;}

                }
                if (b)
                {continue;}
//                if(st.indexOf(1)=='*'||st.indexOf(2)=='*'||st.indexOf(0)=='*')
//                {
//                    b=true;
//                    //   break;
//                    continue;
//                }
            }

//            System.out.println(str5[i+1]);
            if(b){
                if(line.startsWith("User-agent"))
                {
                    break;

                }
                if (line.startsWith("Disallow")) {



                    int start = line.indexOf(":") + 1;
                    int end   = line.length();
                    s11.add(line.substring(start, end).trim());
                //    System.out.println(line.substring(start, end).trim());




                }

            }
        }

     //   System.out.println("ffffff");


        for (String s111 : s11) {
            //  System.out.println(s111.length());
            //if(next_url.contains(s111))
            //  return false;

            if(s111.charAt(0)=='/'&&s111.length()==1)
            {
                System.out.println(s111);
                return false;
            }
            if(s111.length()<= path.length())
            {
               // System.out.println(s111);
                String pathCompare = path.substring(0, s111.length());
                if (pathCompare.equals(s111)) {
                     System.out.println(s111);
                    return false;
                }
            }
         //   System.out.println(s111);
            //    System.out.println(s111.length());
        }
        return true;
        //  return false;

    }

    //public static void main(String[] args) {
     //   System.out.println("hello");
       // String urll="https://www.google.com.eg/m/finance";
       // boolean b =robtostxtcheck5(urll);
       // System.out.println(b);
   // }

}


