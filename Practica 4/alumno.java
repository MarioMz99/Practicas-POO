import jdk.internal.jshell.tool.resources.l10n;
public class alumno extends persona{
	int matricula;
	
	public alumno(String nombre, String correo,int matricula){
		super(nombre, correo);
		this.matricula = matricula;
	}
	
	public void setMatricula(int matricula){
		this.matricula = matricula;
	}
	
	public int getMatricula(){
		return matricula;
	}
}