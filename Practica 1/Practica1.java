import java.util.*;//Se necesita para utilizar Scanner

public class Practica1 {
    static final int a = 10; //Se crea como base 10 strings para almacenar a los alumnos
    public static void main(String[] args){
        int opc,alum=0;
        float [] calif = new float [a];//Si usa la variable para decidir el maximo de alumnos permitidos
        String [] nombres = new String[a];
        Scanner sc = new Scanner(System.in);
        do{
            Menu.Opciones();
            opc = sc.nextInt();
            System.out.println();
            switch (opc) {
                case 1:
                    nombres[alum] = Menu.Captura(alum);//Se Captura el nombre del alumno con un numero basado en las veces que se han capturado anteriormente
                    calif[alum] = Menu.Calificaciones(alum);//La calificacion es flotante 
                    alum++; //Aumenta 1 cada que se captura un alumno
                    break;
                
                case 2:
                    Menu.imprimeCalif(calif,alum,nombres);
                    break;

                case 3:
                    Menu.califBaja(alum,calif,nombres);
                    break;

                case 4:
                    Menu.califAlta(alum, calif, nombres);
                    break;

                case 5:
                    sc.nextLine();//Evita que se capture el \n despues de seleccionar la opcion
                    System.out.println("Saliendo del programa....\nPresione ENTER para continuar");
                    sc.nextLine();
                    break;
            
                default:
                    System.out.println("Error, Introduzca un numero valido");//Si se ingresa una opcion diferente a las establecidas sale este error
                    break;
            }
            
        }while(opc != 5);//Se repetira lo anterior hasta que presione salir
       sc.close();
    }   
}


class Menu{
    static Scanner scan = new Scanner(System.in);
    public static void Opciones(){
        System.out.print("\nMenu\n");
        System.out.print("1) Captura nombre y calficacion del alumno\n");
        System.out.print("2) Imprime Calificaciones y promedio de calificaciones\n");
        System.out.print("3) Imprimir calificaciones y calificacion mas baja\n");
        System.out.print("4) Imprimir calificaciones y calificacion mas alta\n");
        System.out.print("5) Salir\n");
        System.out.print("Selecciona una opcion: ");
    }

    public static String Captura(int numA){
        String nombres;
        if(numA != 0)
            scan.nextLine(); //Evita que se capture el \n despues del primer alumno
        System.out.print("Ingresa el nombre del alumno #"+(numA+1)+" : ");
        nombres = scan.nextLine();
        return nombres;
    }

    public static float Calificaciones(int numA){//Captura las calificaciones
        float calif;
        System.out.print("Calificacion final de alumno #"+(numA+1)+" : ");
        calif = scan.nextFloat();
        return calif;
    }

    public static void Imprime(int num, float calif[], String nombres[]){//Solo imprime las calificaciones en orden
        for(int i = 0; i<num; i++){
            System.out.println("La calificacion del alumno #"+(i+1)+" "+ nombres[i]+" es: " + calif[i]);
        }
    }

    public static void imprimeCalif(float calif[], int num, String nombres[]){//Hace la suma y promedio de las calificaiones
        float suma=0;

        Imprime(num, calif,nombres);//Se manda a llamar la funcion solo para imprimir nombres y calif
        for(int i = 0; i<num; i++){
            suma = suma + calif[i]; //suma todas las calif que ya se han capturado
        }
        suma = suma / num;//Saca el promedio entre todas las calif y el num de veces que se han capturado
        System.out.println("\nEl Promedio de todas las calificaciones es: "+suma);
        
    }

    public static void califBaja(int num, float calif[], String nombres[]){
        float menor;
        Imprime(num, calif, nombres);
        menor = calif[0];//Para poder comparar se le asigna el primer valor a la varianle

        for(int i =0; i< num; i++){
            if(calif[i] < menor){
                menor = calif[i];//Solo si la calif es menor se le asignara ese valor a la variable
            }
        }

        System.out.println("\nLa calificaion menor es de: " + menor);
    }

    public static void califAlta(int num, float calif[], String nombres[]){
        float alta;
        Imprime(num, calif, nombres);
        alta = calif[0];//Para poder comparar se le asigna el primer valor a la varianle

        for(int i =0; i< num; i++){
            if(calif[i] > alta){//Se compara la primera posicion con las demas y cambia si es mas grande
                alta = calif[i];//Se le asigna la calificacion mas alta a esta variable
            }
        }

        System.out.println("\nLa calificaion mas alta es de: " + alta);
    }

}