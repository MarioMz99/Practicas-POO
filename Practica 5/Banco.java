public class Banco {

    private String name;
    private int PIN;
    private double Dinero;
    private int NumCuenta;

    public Banco(String name,int NumCuenta, int PIN, double Dinero) {
        this.name = name;
        this.PIN = PIN;
        this.Dinero = Dinero;
        this.NumCuenta = NumCuenta;
    }

    public int getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.NumCuenta = numCuenta;
    }

    public double getDinero() {
        return Dinero;
    }

    public void setDinero(double Dinero) {
        this.Dinero = Dinero;
    }

    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
