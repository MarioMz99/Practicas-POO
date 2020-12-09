public class RobotChef extends Robot{

    public RobotChef(String name, int battery, int id, int action) {
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
        System.out.println("\nLa carne fue cortada demasiado fina.");

        return false;
    }

    @Override
    protected boolean cutVeggies(){
        System.out.println("\nSe cortaron los vegetales sin probblemas pero se me olvido cortar tomate");

        return false;
    }

    @Override
    protected boolean cookFood() {
        System.out.println("\nNadie puede cocinar mejor que yo");
        return true;
    }

    @Override
    protected boolean prepare() {
        System.out.println("\nNingun humano me puede superar");
        return true;
    }

    @Override
    protected boolean serveFood() {
        System.out.println("\nMe trato mal el cliente asi que le puse la comida sobre su cabeza :)");

        return false;
    }

    @Override
    protected void error() {
        System.out.print("\nRobot Chef: No vuelvo a cortar o servir los platos");
    }
    
}
