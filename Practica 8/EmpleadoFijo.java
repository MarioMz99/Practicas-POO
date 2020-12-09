import java.util.*;

public class EmpleadoFijo extends Empleados{

    public static final double S_Base = 1255.25;
    static Scanner sc = new Scanner(System.in);

    public EmpleadoFijo(String Name, int ID, int Horas, double Salario, double Ventas) {
        super(Name, ID, Horas, Salario,Ventas);
    }

    public void name(String Name){
        this.Name = Name;
    }

    public void id(int ID){
        this.ID = ID;
    }

    public void horas(int Horas){
        this.Horas = Horas;
    }

    public void salario(double Salario){
        this.Salario = Salario;
    }

    public void ventas(double Ventas){
        this.Ventas = Ventas;
    }

    @Override
    protected void ingresaNombre(Empleados[] P0, int N) {
        System.out.print("\nNombre: ");
        name(sc.nextLine().toUpperCase());
    }

    @Override
    protected void ingresaID(Empleados[] P0, int N) {
        System.out.print("\nID: ");
        id(sc.nextInt());
    }

    @Override
    protected void ingresaHoras(Empleados[] P0, int N) {
        System.out.print("\nHoras trabajadas: ");
        horas(sc.nextInt());
    }

    @Override
    protected void ingresaSalario(Empleados[] P0, int N) {
        System.out.println("Nomina de la semana: "+S_Base);
        
        System.out.println("Felicidades, este mes se les dara 10% mas, total: "+(S_Base*1.1) + "\n");
        salario(S_Base*1.1);//1.1 es el 10% extra del mes
        sc.nextLine();
    }

    

}
