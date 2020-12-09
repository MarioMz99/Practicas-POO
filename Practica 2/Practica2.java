//Practica 2
//Necesita archivos Student.java y Menu.java
import java.util.*;
import java.io.IOException; //para limpiar pantalla


public class Practica2{
    static int a = 10; //ariable estatica para poder agregar mas alumnos despues
    public static void main(String [] args)throws IOException, InterruptedException{
        String Estado[] = {"Aprobado","Reprobado"};
        Scanner sc = new Scanner(System.in); 
        Student [] alum =  new Student[a];
        int opc,cont=5;//El contador indica el numero en el que comienza 

        { //Ingreso de alumnos predefinidos
        alum[0] = new Student("Edgar",1,"POO",59,Estado[1]);
        alum[1] = new Student("Gabriel", 2,"POO", 70, Estado[0]);
        alum[2] = new Student("Erick", 3, "POO", 90, Estado[0]);
        alum[3] = new Student("Jazmin", 4, "POO", 40, Estado[1]);
        alum[4] = new Student("Pedro", 5, "POO", 72, Estado[0]);
        }
        
        do{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();//Limpia la pantalla cuando ingresa al menu
            Menu.Capturar();
            opc = sc.nextInt();
            switch(opc){
                case 1:
                    
                    alum[cont] = new Student("",0,"",0,Estado[0]);//Crea un nuevo estudiante con el valor que sigue
                    Menu.ingresarNombre(cont,alum,Estado);
                    cont++; //Aumenta cada que se ingresa un nuevo estudiante 
                    
                    break;

                case 2:
                    sc.nextLine();
                    Menu.show(cont, alum);
                    break;

                case 0:
                    sc.nextLine();
                    System.out.print("\nSaliendo del programa\nPresione ENTER para continuar");
                    sc.nextLine();
                    break;

                default:
                    System.out.print("Ingresa una opcion correcta");
                    sc.nextLine();
                    break;
            }
            
        }while(opc != 0);
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();//Limpia la pantalla cuando acaba el programa
        sc.close();
    }
}
