public class Cat extends Animal{

	String breed;

	public Cat(String name, String breed, int age){
		super(name,age);
		this.breed = breed;
    }

	@Override
    public void eat (){
		System.out.println(name + "is eating Whiskas");
	}
}