package prototype;

public class Cell implements CellPrototype{  //You can also just implement Cloneable

    private String name;

    public Cell(){}

    public Cell(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public Cell clone(){
        return new Cell(this.name);
    }//There could be a CloneNotSupportedException in more complex scenarios

    @Override
    public String toString() {
        return "Cell{" +
                "name='" + name + '\'' +
                '}';
    }
}
