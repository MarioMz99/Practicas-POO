import java.util.*;

public class EmpleadoxHoras extends Empleados{

    public static final double Xhoras = 120.25;//Pago por hora de trabajo
    public static final double extraHoras = 57.12;//Pago por hora extra

    static Scanner sc = new Scanner(System.in);

    public EmpleadoxHoras(String Name, int ID, int Horas, double Salario, double Ventas) {
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
    protected void ingresaSalario(Empleados[] P0, int N) {
        double sFinal = 0;

        if(P0[N].Horas <= 40){
            sFinal = P0[N].Horas * Xhoras;
            System.out.println("Nomina de la semana: " + sFinal + "\n");
        }

        else{
            sFinal = (40 * Xhoras + (P0[N].Horas-40)*extraHoras);
            System.out.println("Nomina de la semana con horas extra: "+ sFinal + "\n");
        
        }

        salario(sFinal);
        sc.nextLine();
    }
    
}
