import java.util.*;

import sun.java2d.loops.DrawGlyphListAA.General;

public class Pract5 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int opc;
        
        do{
            opc = Cuenta.menuBanco();
            switch(opc){
                case 1:
                    break;

                case 2:
                    Cuenta.general();
                    break;

                case 3:
                    System.out.println("Saliendo del programa");
                    System.out.print("Presiona ENTER para continuar...");
                    sc.nextLine();
                    break;

                default:
                    System.out.println("Error Vuelve a intentarlo");
                    System.out.print("Presiona ENTER para continuar...");
                    sc.nextLine();
                    break;
            }
        }while(opc != 3);
       

        sc.close();
    }
}
