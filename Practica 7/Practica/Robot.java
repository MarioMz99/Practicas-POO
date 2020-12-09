public abstract class Robot implements Interfaz{
	String name;
    int battery;
    int id;
    int action;

    public Robot(String name, int battery, int id, int action){
        this.name = name;
        this.battery = battery;
        this.id = id;
        this.action = action;
    }

    public void battery(){}
    public void name(){}
    public void id(){}
    public void lastAction(){}

    protected abstract boolean cutMeat();
    protected abstract boolean cutVeggies();
    protected abstract boolean cookFood();
    protected abstract boolean prepare();
    protected abstract boolean serveFood();
    protected abstract void error();
}
