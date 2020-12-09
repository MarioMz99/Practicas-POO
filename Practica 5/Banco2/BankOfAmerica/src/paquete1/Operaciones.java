package paquete1;
import java.util.*;

public class Operaciones {

	public static int generaCuentaAle(){
        int Cuenta;
        Random rd = new Random();

        Cuenta = rd.nextInt();
        
        return Math.abs(Cuenta);
    }
}
