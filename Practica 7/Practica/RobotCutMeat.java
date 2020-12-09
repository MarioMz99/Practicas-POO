public class RobotCutMeat extends Robot{

    
    public RobotCutMeat(String name, int battery, int id, int action) {
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
        System.out.println("\nLa carne ha sido cortada en 8.2 seg.");

        return true;
    }

    @Override
    protected boolean cutVeggies(){
        System.out.println("\nSe cortaron los vegetales sin probblemas");

        return true;
    }

    @Override
    protected boolean cookFood() {
        System.out.println("\nComo se agarra una cuchara cuando solo tienes cuchillos por manos?");
        return false;
    }

    @Override
    protected boolean prepare() {
        System.out.println("\nNo se que hacer con esto...");
        return false;
    }

    @Override
    protected boolean serveFood() {
        System.out.println("\nSi tire el plato sobre el cliente... me van a despedir o reprogramar?");

        return false;
    }

    @Override
    protected void error() {
        System.out.print("Robot Cortador: Lo siento quiza deba aprender a cocinar y servir");
    }

}
