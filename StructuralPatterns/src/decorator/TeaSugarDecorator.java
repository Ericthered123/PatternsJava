package decorator;

public class TeaSugarDecorator extends TeaDecorator {

    public TeaSugarDecorator(Tea tea) {
        super(tea);
    }

    @Override
    public double cost() {
        return 0.5 + tea.cost();
    }

    @Override
    public String getDescription() {
        return tea.getDescription() +  " with sugar";
    }
}
