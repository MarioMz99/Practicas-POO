

public class Personal {

    public static void mostrar(Empleados [] P0,int N){
        for(int i=0; i<N; i++){
            System.out.println("\tEmpleado");
            System.out.println("Nombre: "+P0[i].Name);
            System.out.println("ID: "+P0[i].ID);
            System.out.println("Horas: "+P0[i].Horas);
            if(P0[i].Ventas != 0)
                System.out.println("Ventas: "+P0[i].Ventas);
            System.out.println("Nomina: "+P0[i].Salario + "\n");
        }
    }
    
    public static void Empleado(Empleados [] P0, int N){
        P0[N].ingresaNombre(P0, N);
        P0[N].ingresaID(P0, N);
        P0[N].ingresaHoras(P0, N);
        P0[N].ingresaSalario(P0, N);
    }

    public static void Vendedor(Empleados [] P0, int N){
        P0[N].ingresaNombre(P0, N);
        P0[N].ingresaID(P0, N);
        P0[N].ingresaHoras(P0, N);
        P0[N].ingresaVentas(P0, N);
        P0[N].ingresaSalario(P0, N);
    }

}
