import java.util.*;

public class Operaciones {
    public static int generaCuentaAle(){
        int Cuenta;
        Random rd = new Random();

        Cuenta = rd.nextInt();
        
        return Math.abs(Cuenta);
    }

    public static int generaPinAle(){
        int pin;

        Random rd = new Random();

        pin = rd.nextInt(9000) + 1001;

        return pin;
    }

    public static void deposito(General [] BK, int a){
        float dinero,donativo=0;
        char resp;
        Scanner sc = new Scanner(System.in);

        System.out.println("Deposito a la cuenta");
        System.out.println("Quieres donar para el Teleton? [s/n]: ");
        resp = sc.nextLine().charAt(0);
        if(resp == 's' || resp == 'S'){
            System.out.println("Cuanto desea donar al Teleton: ");
            donativo = sc.nextFloat();
        }
        System.out.println("Cuando dinero desea depositar a su cuenta: ");
        dinero = sc.nextFloat();
        
        if(BK[a].getMoney() + dinero - donativo)>0)
            BK[a].setMoney( BK[a].getMoney() -(dinero + donativo));

        else{
            System.out.println("\nError, Saldo insuficiente... ");
            sc.nextLine();
        }

    }

    public static void retiro(General [] BK,int a){
        float dinero,donativo=0;
        char resp;
        Scanner sc = new Scanner(System.in);

        System.out.println("Retiro de la cuenta");
        System.out.println("Quieres donar para el Teleton? [s/n]: ");
        resp = sc.nextLine().charAt(0);
        if(resp == 's' || resp == 'S'){
            System.out.println("Cuanto desea donar al Teleton: ");
            donativo = sc.nextFloat();
        }
        System.out.println("Cuando dinero desea retirar de su cuenta: ");
        dinero = sc.nextFloat();
        
        if(BK[a].getMoney() -(dinero + donativo)>0)
            BK[a].setMoney( BK[a].getMoney() -(dinero + donativo));

        else{
            System.out.println("\nError, Saldo insuficiente... ");
            sc.nextLine();
        }
    }
}
