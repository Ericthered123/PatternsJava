package adapter;

public class PngAnalyzer implements Analyzer {

    public PngAnalyzer() {}
    
    public void analyze(Photo photo){
        if (photo.getFormat().equals(".png")) {
            System.out.println("Analyzing PNG: " + photo.getFilePath() + photo.getFormat());
        }
        else{
            System.out.println("Need format conversion");
        }
    }

}
