import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Clase3Ejem2 {
    public static void main(String[] args) {

        String animal1 = "Elefante";
        String animal2 = "Leon";
        String animal3 = "Leon";

        System.out.println("El primer animal y el segundo: "+ (animal1.equals(animal2)? "si ":"no ")+ "son igualesn");
        
        System.out.println("El segundo animal y el tercero: "+ (animal2.equals(animal3)? "si ":"no ")+ "son iguales");
        
        if(animal2.equals(animal3)){
            System.out.println("Ambas cadenas son iguales");
        }
        else{
            System.out.println("No son iguales");
        }

        System.out.println("La tercera letra de " + animal1 + " es la \""+animal1.charAt(2)+"\"");

        System.out.println("El numero de letras de \""+animal2+"\" es "+animal2.length());
    }
}