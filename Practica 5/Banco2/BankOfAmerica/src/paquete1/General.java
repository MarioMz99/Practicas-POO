package paquete1;

public class General {
	String nombre;
	int Pin;
	int noCuenta;
	float Money;
	
	public General(String nombre, int Pin, int noCuenta, float Money) {
		this.nombre = nombre;
		this.Pin = Pin;
		this.noCuenta = noCuenta;
		this.Money = Money;
	}
	
	public void setName(String nombre) {
		this.nombre = nombre;
	}
	
	public String getName() {
		return nombre;
	}
	
	public void setPin(int Pin) {
		this.Pin = Pin;
	}
	
	public int getPin() {
		return Pin;
	}
	
	public void setCuenta(int noCuenta) {
		this.noCuenta = noCuenta;
	}
	
	public int getCuenta() {
		return noCuenta;
	}
	
	public void setMoney(float Money) {
		this.Money = Money;
	}
	
	public float getMoney() {
		return Money;
	}

}
