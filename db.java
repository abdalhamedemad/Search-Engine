public class db {
    public String Word;
    public String url;
    public float NTF;
    public int head;
    public float hntf;
    public String disc;
    public String title;

    public int df;



    public db(String word, String url, float NTF, int head, String disc, String title) {
        Word = word;
        this.url = url;
        this.NTF = NTF;
        this.head = head;
        this.disc = disc;
        this.title = title;

    }

    public db(String word, String url, float NTF, int head, String disc, String title, int df) {
        Word = word;
        this.url = url;
        this.NTF = NTF;
        this.head = head;
        this.disc = disc;
        this.title = title;
        this.df = df;
    }

    public String getWord() {
        return Word;
    }

    public void setWord(String word) {
        Word = word;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public float getNTF() {
        return NTF;
    }

    public void setNTF(float NTF) {
        this.NTF = NTF;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getHntf() {
        return hntf;
    }

    public void setHntf(float hntf) {
        this.hntf = hntf;
    }
}
