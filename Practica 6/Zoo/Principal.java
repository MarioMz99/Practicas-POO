import java.util.*;

public class Principal{

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc,cont=2;//Cont para llevar control del maximo de animales
        String nombre;

        Zoo miAnimal[] = new AnimalesT[10];//10 animales maximo
        AnimalesT.crearAnimal(miAnimal);

        do{
        menu();
        opc  = sc.nextInt();

        switch(opc){
            case 1://1) Mostrar Animales
                for(Zoo a: miAnimal){
                    if(a.getName().equals("-"))
                    System.out.print("");
                    else
                    a.mostrarAnimal();      
                }
                break;
            
            case 2://2) Agregar animal a la lista
                cont++;
                AnimalesT.nuevoAnimal(miAnimal, cont);
                break;

            case 3://2) Eliminar un animal
                for(Zoo a: miAnimal){
                    if(a.getName().equals("-"))
                    System.out.print("");
                    else
                    a.mostrarAnimal();      
                }
                sc.nextLine();
                System.out.print("\nNombre de animal a borrar: ");
                nombre = sc.nextLine();
                AnimalesT.eliminarAnimal(miAnimal, nombre);
                break;

            case 4://4) Llevar al veterinario
                sc.nextLine();
                System.out.print("\nNombre de animal para llevar al veterinario: ");
                nombre = sc.nextLine().toUpperCase();
                Veterinario.DocV(miAnimal,nombre);
                break;

            case 5://5) Salir del programa
                sc.nextLine();
                System.out.println("\nSaliendo del programa");
                System.out.print("Presione ENTER para continuar....");
                sc.nextLine();
                break;

            default:
                sc.nextLine();
                System.out.println("Error, opcion no encontrada...");
                System.out.print("Presione ENTER para continuar....");
                sc.nextLine();
                break;
        }
    }while(opc != 5);

    sc.close();
		
    }
    
    public static void menu(){
        System.out.println("\n\tMenu");
        System.out.println("1) Mostrar Animales");
        System.out.println("2) Agregar animal a la lista");
        System.out.println("3) Eliminar un animal");
        System.out.println("4) Llevar al veterinario");
        System.out.println("5) Salir del programa");
        System.out.print("Selecciona una opcion: ");
    }

}
