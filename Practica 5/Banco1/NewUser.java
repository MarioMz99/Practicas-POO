import java.util.*;

public class NewUser {

    public static void generaUser(General [] BK, int a){
        Scanner sc = new Scanner(System.in);
        String nombre;
        
        
        System.out.println("\tNuevo Usuario");
        System.out.println("Ingrese nombre del propietario de la cuenta: ");
        nombre = sc.nextLine();

        BK[a] = new General(nombre.toUpperCase(), Operaciones.generaPinAle(), Operaciones.generaCuentaAle(), 0);

    }

    public static void mostrarDatos(General [] BK, int a){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNombre de propietario: "+BK[a].getName());
        System.out.println("Numero de cuenta: "+BK[a].getNoCuenta());
        System.out.println("Pin: "+BK[a].getPin());
        System.out.println("Saldo en la cuenta: "+BK[a].getMoney()+"$");
    }

    
    
}
