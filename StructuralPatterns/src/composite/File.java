package composite;

import java.util.Objects;

public class File implements FileSystem{
    private double size;
    private String name;

    public File(){}

    public File(String name,double size){
        this.name=name;
        this.size=size;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof File file)) return false;
        return Double.compare(getSize(), file.getSize()) == 0 && Objects.equals(getName(), file.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSize(), getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }



    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double size(){
        return getSize();
    }

    @Override
    public String toString() {
        return "File{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }
}
