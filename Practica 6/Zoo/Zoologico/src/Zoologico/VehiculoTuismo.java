package Zoologico;

public class VehiculoTuismo extends Vehiculo{
	private int nPuertas;
	public VehiculoTuismo(String matricula, String marca, String modelo, int nPuertas) {
		super(matricula, marca, modelo);
		this.nPuertas = nPuertas;
	}
	
	public int getnPuertas() {
		return nPuertas;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("Matricula: "+getMatricula());
		System.out.println("Marca: "+getMarca());
		System.out.println("Modelo: "+getModelo());
		System.out.println("Puertas: "+getnPuertas());
	}

}
