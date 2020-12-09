import java.util.*;

public class ingresoDatos {
	public static void main(String args[]){
	Scanner entrada = new Scanner(System.in);
		int dato;
		String nombre;
		float flotante;
	
		System.out.print("\nIngrese su nombre y apellido: ");
		nombre = entrada.nextLine();
		
		System.out.print("Ingresa tu promedio: ");
		flotante = entrada.nextFloat();
	
		System.out.print("Inrgese su edad: ");
		dato = entrada.nextInt();
		
		System.out.println("\nNOMBRE: \t" + nombre);
		System.out.println("EDAD: \t\t" + dato);
		System.out.println("PROMEDIO: \t" + flotante);
		
		entrada.close();
	}
}
