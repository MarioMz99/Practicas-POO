import java.util.*;

public class generaRFC {
    static char rfc[] = new char [13];

    public static String generarRFC(Persona per){
        Random rnd = new Random();
        String generadaRFC;
        rfc[0] = per.getLn1().charAt(0);
        rfc[1] = per.getLn1().charAt(1);
        rfc[2] = per.getLn2().charAt(0);
        rfc[3] = per.getName().charAt(0);
        rfc[4] = per.getAnio().charAt(0);
        rfc[5] = per.getAnio().charAt(1);
        rfc[6] = per.getMes().charAt(0);
        rfc[7] = per.getMes().charAt(1);
        rfc[8] = per.getDay().charAt(0);
        rfc[9] = per.getDay().charAt(1);

        //Se generan num aleatorios y se les agrega una 'a' para que de como resultado una letra aleatoria
        rfc[10] = (char) (rnd.nextInt(26) + 'a');
        rfc[11] = String.valueOf(rnd.nextInt(10)).charAt(0);
        rfc[12] = (char) (rnd.nextInt(26) + 'a');
        

        generadaRFC = String.valueOf(rfc);
        return generadaRFC;
    }
    
    public static void imprimeRFC(String RFC){
        System.out.println("\nSu RFC es:  "+RFC.toUpperCase());
    }
}
