package decorator;

public class TeaMilkDecorator extends TeaDecorator {

    public TeaMilkDecorator(Tea tea) {
        super(tea);
    }

    @Override
    public double cost() {
        return tea.cost()+ 0.50;
    }

    @Override
    public String getDescription() {
        return tea.getDescription() + " with milk";
    }
}
