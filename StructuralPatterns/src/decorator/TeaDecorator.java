package decorator;

public abstract class TeaDecorator implements Tea {
    protected Tea tea;

    public TeaDecorator(Tea tea) {
        this.tea = tea;
    }

    @Override
    public double cost() {
        return tea.cost();
    }

    @Override
    public String getDescription() {
        return tea.getDescription();
    }
}
