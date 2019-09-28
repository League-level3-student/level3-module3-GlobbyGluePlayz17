package _01_AnimalFarm;

public class Cow extends Animal {

	@Override
	public void makeNoise() {
		System.out.println("*Moo*");
	}

	@Override
	public void eat() {
		System.out.println("*throws grass*");
	}
	
}
