package Zoologico;

public class Principal {

	public static void main(String[] args) {
		Vehiculo miVehiculo[] = new Vehiculo[2];
		
		miVehiculo[0] = new Vehiculo("GH67", "BMW", "A8");
		miVehiculo[1] = new VehiculoTuismo("ZE23", "Nissan", "Tzuru", 4);
	
		for(Vehiculo vehiculos: miVehiculo) {
			vehiculos.mostrarDatos();
			System.out.print("\n");
		}
	}

}
