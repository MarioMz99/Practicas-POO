public abstract class Empleados implements Interfaz{
    String Name;
    int ID;
    int Horas;
    double Salario;
    double Ventas;

    public Empleados(String Name, int ID, int Horas, double Salario,double Ventas) {
        this.Name = Name;
        this.ID = ID;
        this.Horas = Horas;
        this.Salario = Salario;
        this.Ventas = Ventas;
    }
    
    public void name(){}
    public void id(){}
    public void horas(){}
    public void salario(){}
    public void ventas(){}

    protected abstract void generaEmpleadoFijo(Empleados P0[],int N);
    protected abstract void ingresaNombre(Empleados P0[],int N);
    protected abstract void ingresaID(Empleados P0[],int N);
    protected abstract void ingresaHoras(Empleados P0[],int N);
    protected abstract void ingresaSalario(Empleados P0[],int N);
    protected abstract void ingresaVentas(Empleados P0[],int N);

}
