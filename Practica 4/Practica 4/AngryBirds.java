
public class AngryBirds extends pajaro{
    String Peso;//Se crea un atributo unico para un ave en especifico

    public AngryBirds(String nombre, String poder, String color, String especie,String Peso,int nivPoder){
        super(nombre,poder,color,especie,nivPoder);
        this.Peso = Peso;
    }

    public void setPeso(String Peso){
        this.Peso = Peso;
    }

    public String getpeso(){
        return Peso;
    }
    

}