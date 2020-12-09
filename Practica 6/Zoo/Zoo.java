public class Zoo {
    private String name;
    private String tipo;
    private int edad;
    private boolean vacuna;
    private String limpio;

    public Zoo(String name, String tipo, int edad, boolean vacuna, String limpio) {
        this.name = name;
        this.tipo = tipo;
        this.edad = edad;
        this.vacuna = vacuna;
        this.limpio = limpio;
    }

    public void setLimpio(String limpio) {
		this.limpio = limpio;
	}

    public String getLimpio() {
		return limpio;
	}

	public void setVaccinated(boolean vacuna) {
        this.vacuna = vacuna;
    }

    public boolean getVaccinated() {
        return vacuna;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void mostrarAnimal() {
        System.out.println("No hay animal");
    }

}
