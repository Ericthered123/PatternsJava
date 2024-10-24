package adapter;

public class JpgAdapter implements Analyzer  {

    private JpgPhoto adaptee;
    private PngAnalyzer analyzer;
    public JpgAdapter(JpgPhoto adaptee) {
        this.adaptee = adaptee;
        this.analyzer = new PngAnalyzer();
    }

    public void analyze(Photo photo) throws IllegalArgumentException {
        if(! (photo instanceof JpgPhoto)){
            throw new IllegalArgumentException("Not a .JPG");
        }
        System.out.println("Converting from Jpg to Png : ");
        PngPhoto png = new PngPhoto(photo.getFilePath());
        analyzer.analyze(png);

    }


}
