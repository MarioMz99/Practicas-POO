import java.util.Scanner;

public class prat7 {
    public static void main(String args[]){
        char opc;
        Scanner sc = new Scanner(System.in);      
        Robot bot[] = new Robot[3];

        bot[0] = new RobotCutMeat("X96 Cutting", 100, 90001, 0);
        bot[1] = new RobotChef("3P21 Cooking", 100, 90002, 0);
        bot[2] = new RobotWaiter("7M001 Waiter", 100, 90003, 0);
        
        do{
            menuPrincipal();
            opc = sc.nextLine().charAt(0);
        switch(opc){
            case '1':
                System.out.println("\n/Handmade Ramen Noodles\\");
                AccionRobot.ingredientes(bot);
                AccionRobot.cocinar(bot);
                AccionRobot.servir(bot);
                break;
            case '2':
                System.out.println("\n/Homemade Baked Chocolate Cake\\");
                AccionRobot.ingredientes(bot);
                AccionRobot.cocinar(bot);
                AccionRobot.servir(bot);
                break;
            case '3':
                System.out.println("\n/Boil Stew Chicken\\");
                AccionRobot.ingredientes(bot);
                AccionRobot.cocinar(bot);
                AccionRobot.servir(bot);
                break;
            case '4':
                System.out.println("\nSaliendo del restaurante...");
                break;
            default: 
                System.out.println("\nLo sentimos, esa opcion no esta disponible");
                break;
        }
        
        if(opc != 4)
            AccionRobot.rateFood(bot);
        
        chargeRobot(bot);
    }while(opc != '4');

        sc.close();
    }

    public static void chargeRobot(Robot bot[]){
        for(int i = 0; i<3; i++){
            if(bot[i].battery <= 0){
                bot[i].battery = 100;
                bot[i].action = 4; //Id de carga para la ultima accion
            }
        }
    }

    public static void menuPrincipal(){
        System.out.println("\n\tMenu - Food");
        System.out.println("1) Handmade Ramen Noodles");
        System.out.println("2) Homemade Baked Chocolate Cake");
        System.out.println("3) Chicken Stew");
        System.out.println("4) Salir del restaurante");
        System.out.print("Seleccione una opcion: ");
    }
}
