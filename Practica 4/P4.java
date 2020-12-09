import java.util.Scanner;
import java.util.*;
import jdk.internal.jshell.tool.resources.l10n;
public class P4{
	public static void main(String[] args) {
		String name, mail;
		int mat, num;
		
		Scanner sc = new Scanner(System.in);
		
		alumno a1 = new alumno("","",0);
		profesor p1 = new profesor("","",0);

		profesor arregloProfes [] = new profesor[3];
		for(int i=0; i<arregloProfes.length; i++){
            arregloProfes[i]=new profesor("","",0);
        }
		
		System.out.println("---ALUMNO---");
		System.out.println("Nombre: ");
		name = sc.nextLine();
		a1.setNombre(name);

		System.out.println("Correo: ");
		mail = sc.nextLine();
		a1.setCorreo(mail);
		
		System.out.println("Matricula: ");
		mat = sc.nextInt();
		a1.setMatricula(mat);

        Random dice = new Random();

		for(int i=0; i<arregloProfes.length; i++){
			arregloProfes[i].setNombre("Profesor " + i+1); 
			arregloProfes[i].setCorreo("profesor." + i+1 + "@uabc.edu.mx");
			arregloProfes[i].setNumero(dice.nextInt(300));
		}

		p1.setNombre("Claudia");
		p1.setCorreo("claudia.tona"+ "@uabc.edu.mx");
		p1.setNumero(4567);
		
		System.out.println( "\n--ALUMNO---" + 
							"\nNombre: " + a1.getNombre() + 
							"\nCorreo: " + a1.getCorreo() + 
							"\nMatricula: " + a1.getMatricula());
		System.out.println( "\n--PROFESORES---" + 
							"\nNombre: " + p1.getNombre() + 
							"\nCorreo: " + p1.getCorreo() + 
							"\nNo Empleado: " + p1.getNumero() +
							"\n" + p1.respirar());	

		for(int i=0; i<arregloProfes.length; i++){
			System.out.println( "\nNombre: " + arregloProfes[i].getNombre() + 
								"\nCorreo: " + arregloProfes[i].getCorreo() + 
								"\nNo Empleado: " + arregloProfes[i].getNumero() +
								"\nProfesor " + i+1 + " " + arregloProfes[i].respirar());	
		}					

		sc.close();
	}
}