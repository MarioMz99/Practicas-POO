import java.util.*;


public class Student{
    String nombre,materia,estado;
    int id;
    float calif;

    public Student(String nombre, int id, String materia,float calif, String estado){
        this.nombre = nombre;
        this.id = id;
        this.materia = materia;
        this.calif = calif;
        this.estado = estado;
    }

    public void setName(String nombre){
        this.nombre = nombre;
    }

    public String getName(){
        return nombre;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setSubject(String materia){
        this.materia = materia;
    }

    public String getsubject(){
        return materia;
    }

    public void setCalif(float calif){
        this.calif = calif;
    }

    public float getCalif(){
        return calif;
    }

    public void setStatus(String estado){
        this.estado = estado;
    }

    public String getStatus(){
        return estado;
    }
}
