package adapter;

public class App {
    public static void main(String[] args) {
        Photo p1 = new PngPhoto("User/Photos/morning");
        Photo p2 = new JpgPhoto("User/Photos/evening");
        Analyzer a = new PngAnalyzer();

        a.analyze(p1);
        a.analyze(p2);

        Analyzer ja = new JpgAdapter((JpgPhoto)p2);
        ja.analyze(p2);

    }
}
