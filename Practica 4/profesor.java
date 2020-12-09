import jdk.internal.jshell.tool.resources.l10n;
public class profesor extends persona{
	int numeroEmpleado;
	
	public profesor(String nombre, String correo,int numeroEmpleado){
		super(nombre, correo);
		this.numeroEmpleado = numeroEmpleado;
		//super.respirar();
	}
	
	public void setNumero(int numeroEmpleado){
		this.numeroEmpleado = numeroEmpleado;
	}
	
	public int getNumero(){
		return numeroEmpleado;
	}



}