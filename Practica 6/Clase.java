import java.util.Scanner;

public class Clase {
    public static void main(String[] args) {
	
	Animal someAnimal =  new Dog();
	
	
	Animal anAnimal =  new Animal();
	Dog aDog =  new Dog();
	Animal anotherAnimal = new Dog();
	//Dog doggie =  new Animal();     //Error
	//Cat another =  newDog (); 		//Error 
	

	Animal [] animalArray = new Animal [3];
	animalArray[0] = new Animal("Grant", 14);
	animalArray[1] = new Dog("Pedro", "Salchica", 12);
	animalArray[2] = new Cat("Bola de pelos", "No se", 2);
	
	
	for(Animal a: animalArray){
		a.eat();
    }
	
	for(Animal a: animalArray){
		a.eat();
		
		if (a instanceof Dog){
			((Dog) a ).bark();
		}
    }
	}	
	
}
