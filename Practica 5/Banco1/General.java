public class General {
    private String Name;
    private int Pin;
    private int NoCuenta;
    private float Money;

    public General(String Name, int Pin, int NoCuenta, float Money) {
        this.Name = Name;
        this.Pin = Pin;
        this.NoCuenta = NoCuenta;
        this.Money = Money;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getPin() {
        return Pin;
    }

    public void setPin(int Pin) {
        this.Pin = Pin;
    }

    public int getNoCuenta() {
        return NoCuenta;
    }

    public void setNoCuenta(int NoCuenta) {
        this.NoCuenta = NoCuenta;
    }

    public float getMoney() {
        return Money;
    }

    public void setMoney(float Money) {
        this.Money = Money;
    }

    
}
