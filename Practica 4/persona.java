import jdk.internal.jshell.tool.resources.l10n;
public class persona{

	String nombre;
	String correo;
	
	public persona(String nombre, String correo){
		this.nombre = nombre;
		this.correo = correo;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setCorreo(String correo){
		this.correo = correo;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String getCorreo(){
		return correo;
	}

	public String respirar(){
		return "respira";
	}
}class Persona {
    
}
