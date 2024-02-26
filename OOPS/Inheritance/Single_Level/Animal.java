class Animal
{
	String colour,age;
	int weight;
	int height;
	void setData(String colour,String age, int weight, int height)
	{
		this.age = age;
		this.colour  = colour;
		this.weight = weight;
		this.height = height;
	}
	public void getAnimal()
	{
		System.out.println("colour :"+colour+"\nAge :"+age+"\nWeight :"+weight+"\nHeight :"+height);
	}
	
}
class Dog extends Animal
{
	String breed;
	public void setData(String colour,String age, int weight, int height, String breed)
	{
		this.setData(colour, age, weight, height);
		this.breed  = breed;
		
	}
	public void getDog()
	{
	  System.out.println("Dog of breed :"+breed);
	}
	
}
class Test
{
	public static void main(String args [])
	{
		Dog ob = new Dog();
		ob.setData("black", "10", 35, 60, "Husky");
		ob.getDog();
		ob.getAnimal();
	}
}