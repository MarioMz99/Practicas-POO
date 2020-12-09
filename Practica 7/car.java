public class car extends vehiculoT{
    String model;

    public car (String model){
        this.model = model;
    }

    @Override
    public void start(){
    System.out.println("Is running");
    }

}
