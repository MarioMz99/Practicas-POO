import java.util.*;

public class Pract8 {
    static int A = 10;    //No. Maximo de empleados
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        char opc;

        Empleados []P0 = new Empleados[A];
        int N = 0;//Es el numero de empleados actual

    do{
        menuPrincipal();
        opc = sc.nextLine().charAt(0);
        switch(opc){
            case '1':
                P0[N] = new EmpleadoFijo(" ", 0, 0, 0, 0);
                Personal.Empleado(P0, N);
                N++;
                break;

            case '2':
                P0[N] = new EmpleadoxHoras(" ", 0, 0, 0, 0);
                Personal.Empleado(P0, N);
                N++;
                break;

            case '3':
                P0[N] = new EmpleadoxComision(" ", 0, 0, 0, 0);
                Personal.Vendedor(P0, N);
                N++;
                break;

            case '4':
                P0[N] = new FijoxHora(" ", 0, 0, 0, 0);
                Personal.Vendedor(P0, N);
                N++;
                break;

            case '5':
                if(N == 0)
                    System.out.println("Ningun Empleado contratado");
                else
                    Personal.mostrar(P0,N);
                break;

            case '6':
                System.out.println("\nSaliendo del programa...");
                break;

            default:
                System.out.println("Error, Opcion no encontrada, intentelo nuevamente \n");
                break;
        }
        
    }while(opc != '6');





        sc.close();
    }

    public static void menuPrincipal(){
        System.out.println("\tMENU PRINCIPAL");
        System.out.println("1) INGRESAR EMPLEADOS ASALARIADOS");
        System.out.println("2) INGRESAR EMPLEADOS POR HORAS");
        System.out.println("3) INGRESAR EMPLEADOS POR COMISION");
        System.out.println("4) INGRESAR EMPLEADOS ASALARIADOS POR COMISION");
        System.out.println("5) MOSTRAR NOMINA DE TODOS LOS EMPLEADOS");
        System.out.println("6) SALIR DEL PROGRAMA");
        System.out.print("SELECCIONA UN OPCION: ");
    }

}
