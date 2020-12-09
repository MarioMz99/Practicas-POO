public class Dog extends Animal{
	String breed;

	public Dog(String name, String breed, int age){
		super(name,age);
		this.breed = breed;
    }
	
	public void bark(){
		System.out.println(name + ":Woof");
	}

	@Override
    public void eat (){
		System.out.println(name + "is eating Pedigree");
	}
}