import java.util.*;

public class FijoxHora extends Empleados {

    public static final double S_Base = 1255.25;
    public static final double comision = 0.15; 
    static Scanner sc = new Scanner(System.in);

    public FijoxHora(String Name, int ID, int Horas, double Salario, double Ventas) {
        super(Name, ID, Horas, Salario, Ventas);
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
    protected void ingresaVentas(Empleados[] P0, int N) {
        System.out.print("\nIngresa la cantidad en $ total de vetas: ");
        ventas(sc.nextDouble());
    }

    @Override
    protected void ingresaSalario(Empleados[] P0, int N) {
        double sFinal;
        sFinal = P0[N].Ventas *comision;
        System.out.println("Salario Base: "+S_Base + " + " + "Comisiones: "+ sFinal+"\n");
        sFinal += S_Base;
        System.out.println("Nomina: "+sFinal+"\n");
        salario(sFinal);
    }

}
