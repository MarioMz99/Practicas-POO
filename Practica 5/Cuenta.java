import sun.jvm.hotspot.tools.SysPropsDumper;

import java.util.*;

class Cuenta {
    
    static Scanner sc = new Scanner(System.in);
    static int opc;
    static int maxAc = 10;//Cuentas maximas en el banco
    static Banco[] BK = new Banco[maxAc];// Arreglo de cuentas del banco
      
    public static void general(){
        ingresaDatos();
    }

    public static int ingresaDatos(){
        String name;
        int PIN;

        sc.nextLine();
        System.out.println("Ingresa Nombre de usuario: ");
        name = sc.nextLine();
        System.out.println("Ingresa PIN de acceso: ");
        PIN =  sc.nextInt();

        System.out.println("Desea Continuar? 1 - SI, 0 - NO");
        opc = sc.nextInt();

        if(opc == 0){
            opc = 3;
        }

        DefAccount();

        for(int i = 0; i<BK.length; i++){
            if(PIN == BK[i].getPIN() && name.toUpperCase().equals( BK[i].getName()) ){
                opc = menuCuenta(i);
                break;
            }
            else
                opc = 3;
        }

        return opc;
    }

    public static int menuCuenta(int a){
        System.out.println("Usuario: "+BK[a].getName());
        System.out.println("Saldo disponible: "+BK[a].getDinero()+"$\n");
        System.out.println("1) Depositar Dinero a la cuenta");
        System.out.println("2) Retirar dinero de la cuenta");
        System.out.println("3) Regresar al menu anterior");
        System.out.print("Ingresa seleccion: ");
        opc = sc.nextLine();

        return opc;
    }

    private static void operacionSuma(int a){
        float deposit,donativo=0;
        char resp;
        System.out.println("Ingresa cantidad a Depositar: ");
        deposit = sc.nextFloat();
        System.out.println("Desea donar al programa Becalos? [s/n]");
        resp = sc.nextLine().charAt(0);
        if(resp == 's' || resp == 'S'){
            System.out.println("Ingresa cantidad a donar: ");
            donativo = sc.nextFloat();
        }

        BK[a].setDinero( BK[a].getDinero() + deposit - donativo);
    }
     

    public static int menuBanco() {

        System.out.println("\tMenu");
        System.out.println("1) Crear nueva cuenta");
        System.out.println("2) Ingresar a cuenta ya existente");
        System.out.println("3) Salir");
        System.out.print("Seleccione una opcion: ");
        opc = sc.nextInt();

        return opc;
    }

    /*
     * public static void menuNewUser(Banco User){
     * 
     * System.out.println(""); }
     */

    private static void DefAccount() {// Se crean cuentas predefinidad para solo poner user y PIN
        int numCuenta = 10000;
        Random r1 = new Random();

        numCuenta = Math.abs(r1.nextInt());
        BK[0] = new Banco("EDGAR LANDA",numCuenta, 1445, 1.40);

        numCuenta = Math.abs(r1.nextInt());
        BK[1] = new Banco("MARIANA HERNANDEZ",numCuenta, 1245, 456.25);

        numCuenta = Math.abs(r1.nextInt());
        BK[2] = new Banco("SAUL GONZALEZ",numCuenta, 5241, 1985.21);

        numCuenta = Math.abs(r1.nextInt());
        BK[3] = new Banco("LESLIE QUEVEDO",numCuenta, 6398, 825.12);

        numCuenta = Math.abs(r1.nextInt());
        BK[4] = new Banco("PEDRO SUAREZ",numCuenta, 8596, 0.25);

    }
}
