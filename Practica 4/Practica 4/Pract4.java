import java.util.*;

public class Pract4{
    static int b = 4; //Numeros de pajaros 
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int opc;

        AngryBirds P1 [] = new AngryBirds[b];
        
        for(int i=0; i<P1.length; i++)
            P1[i] = new AngryBirds("-", "-", "-", "-", "-", 0);

        System.out.println("Conocer atributos de personaje en Angry Birds");
        System.out.print("\t1) RED");
        System.out.print("\n\t2) CHUCK");
        System.out.print("\n\t3) TERENCE");
        System.out.print("\n\t4) BOMB");
        System.out.print("\nIngresa el numero del personaje: ");
        opc = sc.nextInt();
        
        switch(opc){
            case 1:
                P1[0].setName("RED");
                P1[0].setColor("ROJO");
                P1[0].setLvl(0);
                P1[0].setPower("NINGUNO");
                P1[0].setSpecies("CARDENAL");
                break;

            case 2:
                P1[1].setName("CHUCK");
                P1[1].setColor("AMARILLO");
                P1[1].setLvl(3);
                P1[1].setPower("VELOCIDAD");
                P1[1].setSpecies("CANARIO");
                break;

            case 3:
                P1[2].setName("TERENCE");
                P1[2].setColor("ROJO");
                P1[2].setLvl(5);
                P1[2].setPower("SU PESO");
                P1[2].setSpecies("CARDENAL");
                P1[2].setPeso("PESO EXTRA, MUY GORDO");
                break;

            case 4:
                P1[3].setName("BOMB");
                P1[3].setColor("NEGRO");
                P1[3].setLvl(7);
                P1[3].setPower("EXPLOTAR");
                P1[3].setSpecies("CUERVO");
                break;
            
            default:
                System.out.println("NOMBRE INCORRECTO, INTENTE NUEVAMENTE....");
                    break;
        }

        if(opc>=0 && opc<=b){
            opc = opc-1;
        System.out.println("\nNombre: "+P1[opc].getName());
        System.out.println("Color: "+P1[opc].getColor());
        System.out.println("Poder: "+P1[opc].getPower());
        System.out.println("Nivel de pwr: "+P1[opc].getLvl());
        System.out.println("Especie: "+P1[opc].getSpecies());
        
        if(P1[opc].getName().equals("TERENCE")){
            System.out.println("ESPECIAL: "+P1[opc].getpeso());
        }
        
    }


        sc.close();
    }

}

