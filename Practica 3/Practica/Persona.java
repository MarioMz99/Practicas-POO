//import jdk.internal.jshell.tool.resources.l10n;

public class Persona {
    String nombre,apellido1,apellido2,Estado;
    String Dia,Mes,Anio;
    char Sexo;

    public Persona(String nombre, String apellido1, String apellido2,String D, String M, String A, char Sexo, String Estado){
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        Dia = D;
        Mes = M;
        Anio = A;
        this.Sexo = Sexo;
        this.Estado = Estado;
        
    }


    public void setName(String nombre){
        this.nombre = nombre;
    }

    public String getName(){
        return nombre;
    }

    public void setLn1(String ln1){
        apellido1 = ln1;
    }

    public String getLn1(){
        return apellido1;
    }

    public void setLn2(String ln2){
        apellido2 = ln2;
    }

    public String getLn2(){
        return apellido2;
    }

    public void setDay(String D){
        Dia = D;
    }

    public String getDay(){
        return Dia;
    }

    public void setMes(String M){
        Mes = M;
    }

    public String getMes(){
        return Mes;
    }

    public void setAnio(String A){
        Anio = A;
    }

    public String getAnio(){
        return Anio;
    }

    public void setSexo(char Sexo){
        this.Sexo = Sexo;
    }

    public char getSexo(){
        return Sexo;
    }

    public void setEstado(String Estado){
        this.Estado = Estado;
    }

    public String getEstado(){
        return Estado;
    } 
}
