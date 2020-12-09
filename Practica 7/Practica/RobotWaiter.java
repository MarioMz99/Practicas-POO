
public class RobotWaiter extends Robot{

    public RobotWaiter(String name, int battery, int id, int action) {
        super(name, battery, id, action);
    }

    
    public void name(String name) {
        this.name = name;
    }

    
    public void battery(int battery) {
        this.battery = battery;
    }

    
    public void id(int id) {
        this.id = id;
    }

    
    public void lastAction(int num) {
        this.action = num;
    }
    
    @Override
    protected boolean cutMeat(){
        System.out.println("\nSolo aplaste la carne y asi la deje.");

        return false;
    }

    @Override
    protected boolean cutVeggies(){
        System.out.println("\nParece que los pique con un martillo");

        return false;
    }

    @Override
    protected boolean cookFood() {
        System.out.println("\nSe le pone sal o azucar?");
        return false;
    }

    @Override
    protected boolean prepare() {
        System.out.println("\nNo se donde poner este steak");
        return false;
    }

    @Override
    protected boolean serveFood() {
        System.out.println("\nSoy el mejor, hasta saque 100 dlls de propina");

        return true;
    }

    @Override
    protected void error() {
        System.out.print("\nRobot Mesero: Le dejare el trabajo a los demas y solo servire la comida");
    }

}