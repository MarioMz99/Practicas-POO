import java.util.*;
import java.io.*;

public class Ejercicio1{
    public static void main(String args[]){
        int[] integerArray1 = {1,20,3,44,5,60,7,88,9,100};

        System.out.println(integerArray1[5]);

        int[] arregloCeros = new int []{0,0,0,0,0};

        System.out.println(Arrays.toString(arregloCeros));

        Random dice = new Random();
        int[] nuevoArreglo = new int [5];

        for(int i=0; i<nuevoArreglo.length; i++){
            nuevoArreglo[i] = dice.nextInt(11);
        }
        System.out.println(Arrays.toString(nuevoArreglo));
    }
}