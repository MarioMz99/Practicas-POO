import java.util.*;

public class User{

    public static void usuarios(General [] BK, int a){
        int opc=0,pin,lugar=0;
        Scanner sc = new Scanner(System.in);
        String nombre;

        System.out.println("Ingresa Nombre de usuario: ");
        nombre = sc.nextLine();
        System.out.println("Ingresa el PIN de acceso: ");
        pin = sc.nextInt();

        for(int i=0; i<a+1; i++){
            if(nombre.toUpperCase().equals(BK[i].getName()) && pin == BK[i].getPin()){
                opc = Menus.menuUsuario();
                lugar = i;
                break;
            }
            else
                opc = 4;
        }
        
        do{
            switch(opc){
                case 1:
                    Operaciones.deposito(BK,lugar);
                    break;

                case 2:
                    Operaciones.retiro(BK, lugar);
                    break;

                case 3: 
                    NewUser.mostrarDatos(BK, lugar);
                    break;

                case 4: 
                    System.out.println("\nRegresando al menu anterior...\n");
                    sc.nextLine();
                    break;

                default:
                    System.out.println("\nError, accion no disponible...");
                    break;
            }

            if(opc != 4)
                opc = Menus.menuUsuario();
        }while(opc != 4);

    }

    public static void cuentasPreD(General [] BK) {
		BK[0] = new General("EDGAR LANDA", 1445, Operaciones.generaCuentaAle(), (float) 1.4);
		BK[1] = new General("PEDRO SUAREZ", 1245, Operaciones.generaCuentaAle(), (float) 205.50);
        BK[2] = new General("LESLIE QUEVEDO", 2023, Operaciones.generaCuentaAle(), (float) 596.33);
        BK[3] = new General("CARLOS ESTRADA", 2658, Operaciones.generaCuentaAle(), (float) 201);
        BK[4] = new General("MARIANA HERNADEZ", 1020, Operaciones.generaCuentaAle(), (float) 49.97);
	}
}

