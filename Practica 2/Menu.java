import java.util.*;

class Menu{
    static Scanner sc = new Scanner(System.in);
    
    public static void Capturar(){
        
        System.out.println("\nMenu");
        System.out.println("1) Ingresar los datos del alumno");
        System.out.println("2) Mostar Alumnos y calificaciones");
        System.out.println("0) Salir");
        System.out.print("Ingrese una opcion: ");
    }

    public static void ingresarNombre(int a, Student alum[],String Estado[]){
        String palabra;
        float calif;
        
        System.out.print("\nIngresa el nombre del estudiante #"+(a+1)+": ");
        palabra = sc.nextLine();
        alum[a].setName(palabra); 
        
        System.out.print("\nEl ID del alumno es: #"+(a+1));
        alum[a].setId((a+1));
        
        System.out.print("\n\nIngresa la materia: ");
        palabra = sc.nextLine();
        alum[a].setSubject(palabra);

        System.out.print("\nIngresa la calificacion del alumno: ");
        calif = sc.nextFloat();
        alum[a].setCalif(calif);

        if( calif >= 60)
            alum[a].setStatus(Estado[0]);
        
        else
            alum[a].setStatus(Estado[1]);
        
        System.out.println("Estado del alumno: "+alum[a].getStatus());

        sc.nextLine();
        System.out.print("\nPresiona ENTER para continuar...");
        sc.nextLine();
    }

    public static void show(int a, Student alum[]){
        System.out.println();
        for(int i=0; i<a; i++){
            System.out.println("Nombre: " + alum[i].getName());
            System.out.println("ID del alumno: #" + alum[i].getId());
            System.out.println("Materia: "+alum[i].getsubject());
            System.out.println("Calificacion: " + alum[i].getCalif());
            System.out.println("Estado: "+alum[i].getStatus());
            System.out.println();
        }
        System.out.println();
        System.out.print("\nPresiona ENTER para continuar...");
        sc.nextLine();

    }

}