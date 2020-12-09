import java.util.*;
import java.io.IOException; //para limpiar pantalla

public class Practica3 {
    public static void main(String [] args)throws IOException, InterruptedException{
        int opc=0; 
        String curp=" ",rfc = " ";
        Persona per;

        
        
        do{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            opc  = Menu.Opciones(opc);
        switch(opc){
            case 1: 
                per = new Persona("-", "-", "-","-","-","-",'-',"-");//Inicializamos los valores
                Menu.datos(per);//Despues de capturar datos se realiza la generacion de curp y rfc
                curp = generaCURP.generarCurp(per); // Se evitan cambios en los valores aleatorios
                rfc = generaRFC.generarRFC(per);
                break;

            case 2:
                generaCURP.imprimeCurp(curp);
                Menu.salida();
                break;

            case 3:
                generaRFC.imprimeRFC(rfc);
                Menu.salida();
                break;

            case 4:
                generaCURP.imprimeCurp(curp);
                generaRFC.imprimeRFC(rfc);
                Menu.salida();
                break;

            case 5:
                System.out.println("\nSaliendo del prgrama...");
                Menu.salida();
                break;
            
            default:
                System.out.println("Error, vuelve a intentarlo");
                break;
        }
    
        }while(opc != 5);
    }
    
}

class Menu {
    static Scanner sc = new Scanner(System.in);

    public static int Opciones(int opc){
        System.out.println("\tMenu");
        System.out.println("1) Ingresar los datos");
        System.out.println("2) Mostrar CURP");
        System.out.println("3) Mostrar RFC");
        System.out.println("4) Mostrar CURP y RFC");
        System.out.println("5) Salir del programa");
        System.out.print("Selecciona una opcion: ");
        opc = sc.nextInt();
        return opc;
    }

    public static void datos(Persona per){//Guardamos todos los valores en la variable per del ripo persona
        String palabra;
        char sexo;
        String fecha;

        sc.nextLine();
        System.out.print("\nIngresa tu primer nombre: ");
        palabra = sc.nextLine();
        per.setName(palabra);

        System.out.print("\nIngresa tu apellido paterno: ");
        palabra = sc.nextLine();
        per.setLn1(palabra);

        System.out.print("\nIngresa tu apellido materno: ");
        palabra = sc.nextLine();
        per.setLn2(palabra);

        System.out.print("\nIngresa tu fecha de nacimiento");
        System.out.print("\nDia [DD]: ");
        fecha = sc.nextLine();
        per.setDay(fecha);

        System.out.print("\nMes [MM]: ");
        fecha = sc.nextLine();
        per.setMes(fecha);

        System.out.print("\nAño [AA]: ");
        fecha = sc.nextLine();
        per.setAnio(fecha);

        System.out.print("\nEntidad federativa de nacimiento: ");
        palabra = sc.nextLine();
        per.setEstado(palabra);

        System.out.print("\nSexo [H / M]: ");
        sexo = sc.next().charAt(0);
        per.setSexo(sexo);

        Menu.salida();
    }

    public static void salida(){
        sc.nextLine();
        System.out.print("Presione ENTER para continuar....");
        sc.nextLine();
    }
}
