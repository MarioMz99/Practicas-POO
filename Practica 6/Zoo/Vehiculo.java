public class Vehiculo {
	private String matricula;
	private String marca;
	private String modelo;
	
	public Vehiculo(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public String getMarca(){
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void mostrarDatos() {
		System.out.println("Matricula: "+getMatricula());
		System.out.println("Marca: "+getMarca());
		System.out.println("Modelo: "+getModelo());
	}
}
