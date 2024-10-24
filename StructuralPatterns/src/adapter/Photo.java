package adapter;

public abstract class Photo {

    private String filepath;
    private String format;
    public Photo(){

    }
    public Photo(String filepath,String format){
        this.filepath = filepath;
        this.format = format;
    }

    public String getFilePath() {
        return filepath;
    }

    public String getFormat() {
        return format;
    }

}
