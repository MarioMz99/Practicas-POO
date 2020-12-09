import java.util.Scanner;

public class Veterinario {
    String name;
    String review;
    double salary;
    
    public Veterinario(String name, double salary, String review) {
        this.name = name;
        this.salary = salary;
        this.review = review;
    }

    public String getName(){
        return name;
    }

    public String getReview(){
        return review;
    }

    public double getSalary(){
        return salary;
    }

    public static void dr_Vet(){
        Veterinario dr = new Veterinario("Juan Guzman", 6450.36, "Buen Dr.\nTrata bien a los animales");

        System.out.println("\n\tInfo del veterinario");
        System.out.println("Dr. "+dr.getName());
        System.out.println("Salario semanal: "+dr.getSalary());
        System.out.println("Reviews de internet: "+dr.getReview()+"... >");
    }

    public static void DocV(Zoo miAnimal[], String nombre){
        Scanner sc = new Scanner(System.in);
        int opc;
        
        do{
            menu();
            opc = sc.nextInt();

            switch(opc){
                case 1:
                    dr_Vet();
                    break;

                case 2:
                    for(int i=0; i<miAnimal.length; i++){
                        if(miAnimal[i].getName().equals(nombre.toUpperCase()))
                            miAnimal[i].setVaccinated(true);
                    }
                    System.out.println("Todas las vacunas aplicadas a "+nombre);
                    sc.nextLine();
                    break;

                case 3:
                    for(int i=0; i<miAnimal.length; i++){
                        if(miAnimal[i].getName().equals(nombre.toUpperCase()))
                            miAnimal[i].setLimpio("Limpio");
                    }
                    System.out.println(nombre + " ha sido bañado y ahora esta limpio y huele a limon");
                    break;

                case 4:
                    sc.nextLine();
                    System.out.println("Regresando a casa con "+nombre);
                    sc.nextLine();
                    break;

                default:
                    sc.nextLine();
                    System.out.println("Error, Opcion no encontrada o no disponible");
                    sc.nextLine();
                    break;
            }


        }while(opc!=4);

    }

    public static void menu(){
        System.out.println("\n\tVeterinario");
        System.out.println("1) Datos del Dr.");
        System.out.println("2) Aplicar Vacunas");
        System.out.println("3) Bañar a la mascota");
        System.out.println("4) No hacer nada");
        System.out.print("Elige una opcion: ");
    }

    
}

