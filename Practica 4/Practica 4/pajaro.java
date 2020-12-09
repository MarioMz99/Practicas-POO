import java.util.*;

public class pajaro{
    
    String name;
    int nivPoder;
    String poder;
    String color;
    String especie;

    public pajaro(String name,String poder,String color, String especie,int nivPder){
        this.name = name;
        this.poder = poder;
        this.color = color;
        this.especie = especie;
        this.nivPoder = nivPder;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setLvl(int nivPoder){
        this.nivPoder = nivPoder;
    }

    public int getLvl(){
        return nivPoder;
    }

    public void setPower(String poder){
        this.poder = poder;
    }

    public String getPower(){
        return poder;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setSpecies(String especie){
        this.especie = especie;
    }

    public String getSpecies(){
        return especie;
    }
}