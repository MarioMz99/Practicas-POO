import java.util.*;

public class generaCURP {
    static char curp[] = new char [18];
    static String generadaCurp="000000000000000000";

    public static String generarCurp(Persona per){
        String estado;
        Random rnd = new Random();
        curp = generadaCurp.toCharArray();

        curp[0] = per.getLn1().charAt(0);
        curp[1] = per.getLn1().charAt(1);
        curp[2] = per.getLn2().charAt(0);
        curp[3] = per.getName().charAt(0);
        curp[4] = per.getAnio().charAt(0);
        curp[5] = per.getAnio().charAt(1);
        curp[6] = per.getMes().charAt(0);
        curp[7] = per.getMes().charAt(1);
        curp[8] = per.getDay().charAt(0);
        curp[9] = per.getDay().charAt(1); 
        curp[10] = per.getSexo();

        estado = per.getEstado().toUpperCase();
        for(int i=0; i<34; i++){ //Busca la entidad por medio del nombre en mayusculas
            if (estado.equals(ENTIDAD_FEDERATIVA[i]) ){
                curp[11] = ENTIDAD_FEDERATIVA_VALOR[i].charAt(0);
                curp[12] = ENTIDAD_FEDERATIVA_VALOR[i].charAt(1);
            }
        }
         
        int i=1;
        do{
            curp[13] = per.getLn1().charAt(i);
            i++;
        }while(curp[13] == 'a'|| curp[13] == 'e'||curp[13] == 'i'||curp[13] == 'o'||curp[13] == 'u');
        i=1;
        do{
            curp[14] = per.getLn2().charAt(i);
            i++;
        }while(curp[14] == 'a'|| curp[14] == 'e'||curp[14] == 'i'||curp[14] == 'o'||curp[14] == 'u');
        i=1;
        do{
            curp[15] = per.getName().charAt(i);
            i++;
        }while(curp[15] == 'a'|| curp[15] == 'e'||curp[15] == 'i'||curp[15] == 'o'||curp[15] == 'u');

       curp[16] = String.valueOf(rnd.nextInt(10)).charAt(0);
       curp[17] = String.valueOf(rnd.nextInt(10)).charAt(0);

        generadaCurp = String.valueOf(curp);
        
        return generadaCurp;
    }

    public static void imprimeCurp(String Curp){
        System.out.println("\nLa curp es: " + Curp.toUpperCase());
    }

    public static String[] ENTIDAD_FEDERATIVA = {"AGUASCALIENTES",
                                                 "BAJA CALIFORNIA",
                                                 "BAJA CALIFORNIA SUR",
                                                 "CAMPECHE",
                                                 "COAHUILA",
                                                 "COLIMA",
                                                 "CHIAPAS",
                                                 "CHIHUAHUA",
                                                 "DISTRITO FEDERAL",
                                                 "DURANGO",
                                                 "GUANAJUATO",
                                                 "GUERRERO",
                                                 "HIDALGO",
                                                 "JALISCO",
                                                 "MEXICO",
                                                 "MICHOACAN",
                                                 "MORELOS",
                                                 "NAYARIT",
                                                 "NUEVO LEON",
                                                 "OAXACA",
                                                 "PUEBLA",
                                                 "QUERETARO",
                                                 "QUINTANA ROO",
                                                 "SAN LUIS POTOSI",
                                                 "SINALOA",
                                                 "SONORA",
                                                 "TABASCO",
                                                 "TAMAULIPAS",
                                                 "TLAXCALA",
                                                 "VERACRUZ",
                                                 "YUCATAN",
                                                 "ZACATECAS",
                                                 "SERV. EXTERIOR MEXICANO",
                                                 "NACIDO EN EL EXTRANJERO"};

    public static String[] ENTIDAD_FEDERATIVA_VALOR = {"AS",
                                                       "BC",
                                                       "BS",
                                                       "CC",
                                                       "CL",
                                                       "CM",
                                                       "CS",
                                                       "CH",
                                                       "DF",
                                                       "DG",
                                                       "GT",
                                                       "GR",
                                                       "HG",
                                                       "JC",
                                                       "MC",
                                                       "MN",
                                                       "MS",
                                                       "NT",
                                                       "NL",
                                                       "OC",
                                                       "PL",
                                                       "QT",
                                                       "QR",
                                                       "SP",
                                                       "SL",
                                                       "SR",
                                                       "TC",
                                                       "TS",
                                                       "TL",
                                                       "VZ",
                                                       "YN",
                                                       "ZS",
                                                       "SM",
                                                       "NE"};
                                                 

}
