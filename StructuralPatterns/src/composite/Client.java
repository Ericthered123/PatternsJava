package composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        //An abstract class FileSystem could also be used
        FileSystem f1 = new File("Foto.png", 100);
        FileSystem f2 = new File("Foto2.png", 300);
        FileSystem f3 = new File("Foto3.png", 600);
        List<FileSystem> list1 = new ArrayList<FileSystem>();
        list1.add(f1);
        list1.add(f2);
        list1.add(f3);
        FileSystem d1 = new Directory(list1, "Photos");

        System.out.println(d1.size());
        System.out.println(f1.size());
    }
}
