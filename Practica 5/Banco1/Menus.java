import java.util.*;

public class Menus {
    static Scanner sc = new Scanner(System.in);

    public static int Principal() {
        int opc;
        System.out.println("\n\tMenu");
        System.out.println("1) Ingresar usuario nuevo");
        System.out.println("2) Ingresar usuario existente");
        System.out.println("3) Salir del programa");
        System.out.print("Selecciona una opcion: ");
        opc = sc.nextInt();

        return opc;
    }

    public static int menuUsuario(){
        int opc;
        System.out.println("\n\tMenu de Usuarios");
        System.out.println("1) Depositar saldo a la cuenta");
        System.out.println("2) Retirar dinero de la cuenta");
        System.out.println("3) Consultar saldo de la cuenta");
        System.out.println("4) Salir al menu anterior");
        System.out.print("Ingresa la opcion: ");
        opc = sc.nextInt();

        return opc;
    }

}
