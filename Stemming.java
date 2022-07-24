import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.tartarus.snowball.ext.PorterStemmer;

public class Stemming {
    static ArrayList<String> stemming(ArrayList<String> str){
        PorterStemmer stemmer = new PorterStemmer();
        ArrayList<String> list =new ArrayList<>();
        for (String word:str) {
            word.toLowerCase();
            //System.out.println(word);
            stemmer.setCurrent(word);
            stemmer.stem();
            String result = stemmer.getCurrent();
            //System.out.println(result);
            list.add(result);
        }
        return list;
    }

    static ArrayList<String> remove_Stp_Words(ArrayList<String> str) throws IOException {
        List<String> stopwords = Files.readAllLines(Paths.get("stopwors.txt"));
        ArrayList<String> fcontent = new ArrayList<>();
        for(String word : str) {
            if(!stopwords.contains(word.toLowerCase())) {
                fcontent.add(word.toLowerCase());
            }
        }
        return fcontent;
    }
}
