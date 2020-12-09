import java.util.Scanner;

public class AccionRobot {
    static int ref=0;
    static Scanner sc = new Scanner(System.in);

    public static void robotStatistics(Robot bot[],int a){
        String [] acciones = new String [5];
        acciones[0] = "No andaba haciendo nada";
        acciones[1] = "Estuvo en la cocina cortando";
        acciones[2] = "Estuvo cocinando el ultimo platillo";
        acciones[3] = "Estuvo sirviendo los platos en las mesas";
        acciones[4] = "Estuvo recargando bateria en el centro de carga";
        
        System.out.println("\nModelo: " + bot[a].name);
        System.out.println("Bateria: " + bot[a].battery + "%");
        System.out.println("ID: " + bot[a].id);
        System.out.println("Ultima accion: " + acciones[bot[a].action]);

    }

    public static void ingredientes(Robot bot[]){
        int a = 0;

        do{
        
        menuRobots();
        a = sc.nextInt() - 1;
        sc.nextLine();

        if(a > 3 && a < 0){
            System.out.println("Error, vuelve a intentarlo\n");
        }

    }while(a > 3 && a < 0);

        robotStatistics(bot, a);

        if(bot[a].cutMeat()){
            System.out.println("Carne Lista a una velocidad de ");//Agregar la velocidad del robot
        }
        else{
            System.out.println("La carne no esta bien picada pero pasa");
        }

        if(bot[a].cutVeggies()){
            System.out.println("Vegetales listos para cocinar");
            ref++; 
        }
        else{
            System.out.println("No se ve tan bien pero nadie lo va a notar");
        }
        
    
        bot[a].action = 1; // 1 es el id de Ingredientes para la ultima accion que realizo el robot
        bot[a].battery -= 10;
    }

    public static void cocinar(Robot bot[]){
        int a = 0;

        do{
        
        menuRobots2();
        a = sc.nextInt() - 1;
        sc.nextLine();

        if(a > 3 && a < 0){
            System.out.println("Error, vuelve a intentarlo\n");
        }

    }while(a > 3 && a < 0);

        robotStatistics(bot, a);

        if(bot[a].cookFood()){
            System.out.println("Esto sabe muy bien!!");
        }
        else{
            System.out.println("Si nadie lo nota todo saldra bien");
        }

        if(bot[a].prepare()){
            System.out.println("Listo, todo en el plato se ve muy bien");
            ref++;
        }
        else{
            System.out.println("Solo lo tire al piso una vez, todo bien");
        }

        bot[a].action = 2;
        bot[a].battery -= 10;
    }
  
    public static void servir(Robot bot[]){
        int a = 0;

        do{
        
        menuRobots3();
        a = sc.nextInt() - 1;
        sc.nextLine();

        if(a > 3 && a < 0){
            System.out.println("Error, vuelve a intentarlo\n");
        }

    }while(a > 3 && a < 0);

        robotStatistics(bot, a);

        if(bot[a].serveFood()){
            System.out.println("La comida fue entregada con exito");
            ref++;
        }
        else{
            System.out.println("La proxima quiza si lo hare bien");
        }

        bot[a].action = 3;
        bot[a].battery -= 10;
    }

    public static void rateFood(Robot bot[]){
        if(ref == 0){
            System.out.println("\nNingun robot hizo lo que le programe hacer...");
           bot[0].error();
           bot[1].error();
           bot[2].error();
        }
        if(ref == 1){
            System.out.println("\nAl menos el cliente nos puso 3 estrellas");
        }
        if(ref == 2){
            System.out.println("\nLas encuestas dicen que le pongamos mas ganas, animo si se puede!!");
        }
        if(ref == 3){
            System.out.println("¡Hurra! El plato estaba delicioso");
        }

        ref = 0;
    }

    public static void menuRobots(){
        System.out.println("Robots - INGREDIENTES");
        System.out.println("1) Utilizar al Robot: Cortador");
        System.out.println("2) Utilizar al Robot: Cocinero");
        System.out.println("3) Utilizar al Robot: Mesero");
        System.out.print("Selecciona una opcion: ");
    }

    public static void menuRobots2(){
        System.out.println("\nRobots - COCINAR");
        System.out.println("1) Utilizar al Robot: Cortador");
        System.out.println("2) Utilizar al Robot: Cocinero");
        System.out.println("3) Utilizar al Robot: Mesero");
        System.out.print("Selecciona una opcion: ");
    }

    public static void menuRobots3(){
        System.out.println("\nRobots - SERVIR");
        System.out.println("1) Utilizar al Robot: Cortador");
        System.out.println("2) Utilizar al Robot: Cocinero");
        System.out.println("3) Utilizar al Robot: Mesero");
        System.out.print("Selecciona una opcion: ");
    }
}
