package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory implements FileSystem{

    private List<FileSystem> files;
    private String name;
    public Directory(String name) {
        files = new ArrayList<FileSystem>();
        this.name = name;
    }
    public Directory(List<FileSystem> files, String name) {
        this.files = files;
        this.name = name;
    }


    public List<FileSystem> getFiles() {
        return files;
    }

    public void addElement(FileSystem element) {
        files.add(element);
    }
    @Override
    public double size(){
        double aux = 0;
        //for (FileSystem file : files) {
          //  aux += file.size();
        //}
        //return aux;
        Iterator <FileSystem> iterator = files.iterator();
        while (iterator.hasNext()) {
            FileSystem fileSystem = iterator.next();
            aux += fileSystem.size();

        }
        return aux;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
