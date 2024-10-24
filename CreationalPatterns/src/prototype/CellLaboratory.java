package prototype;

public class CellLaboratory {
    public static void main(String []args){
        Cell primeCell = new Cell("Eric");
        Cell subCell = primeCell.clone();
        Cell subCell2 = primeCell.clone();

        System.out.println(primeCell.toString()+"  " +subCell.toString() + "  " +  subCell2.toString());


    }

}
