

import java.io.IOException;


import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Main {
    /*if the input id string
     * string html ="html page "<html>""
     * Document doc = jsoup.parse("html");
     *
     *if the input is file
     *Try{
     *File file = new("index.html")
     *document doc = jsoup.parse(file,"utf-8");
     * }
     * catch{
     *
     * }
     *
     *
     *
     * */



    public static void main(String[] args) throws IOException {
        //url input.

        Document doc = Jsoup.connect("http://google.com").get();
        String title = doc.title();
        System.out.println(title);

        Elements links = doc.select("a[href]");
        for (Element link : links) {
            System.out.println("\nlink:" + link.attr("href"));
            System.out.println("text:" + link.text());
        }
    }
}