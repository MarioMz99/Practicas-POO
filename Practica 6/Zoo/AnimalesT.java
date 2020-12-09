import java.util.*;

public class AnimalesT extends Zoo{
    

	public AnimalesT(String name, String tipo, int edad, boolean vacuna, String limpio) {
		super(name, tipo, edad, vacuna,limpio);
    }
    
    @Override
    public void mostrarAnimal() {
        System.out.println("\nNombre: " +getName());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Edad: "+ getEdad());
        
        if(getVaccinated())
        System.out.println("Vacunas: Si");
        else
        System.out.println("Vacunas: No");

        System.out.println("El animal está: " + getLimpio());
    }


    public static void crearAnimal(Zoo miAnimal[]){
        for(int i=0; i<miAnimal.length; i++){
            miAnimal[i] = new AnimalesT("-", "-", 0, false, "-");
        }

        miAnimal[0] = new AnimalesT("ANTARES", "RATON", 2, false, "limpio");
        miAnimal[1] = new AnimalesT("PANCHO", "PERICO", 3, true, "sucio");

        
    }

    public static void nuevoAnimal(Zoo miAnimal[], int a){
        Scanner sc = new Scanner(System.in);

        System.out.println("\t-Agregar nuevo animal a la lista\n");
        System.out.print("Nombre: ");
        miAnimal[a].setName(sc.nextLine().toUpperCase());

        System.out.print("Tipo: ");
        miAnimal[a].setTipo(sc.nextLine().toUpperCase());

        System.out.print("El "+miAnimal[a].getTipo() + " ha sido vacunado? [s/n]: ");
        if(sc.nextLine().charAt(0) == 's')
        miAnimal[a].setVaccinated(true);
        else
        miAnimal[a].setVaccinated(false);

        System.out.print("El "+miAnimal[a].getTipo()+" esta limpio o sucio? ");
        miAnimal[a].setLimpio(sc.nextLine());

        System.out.print("Edad: ");
        miAnimal[a].setEdad(sc.nextInt());
        
    }

    public static void eliminarAnimal(Zoo miAnimal[], String nombre){
        for(int i=0; i<miAnimal.length; i++){
            if(miAnimal[i].getName().equals(nombre.toUpperCase()))
                miAnimal[i] = new AnimalesT("-", "-", 0, false, "-");
        }
    }
    
}
