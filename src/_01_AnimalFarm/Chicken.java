package _01_AnimalFarm;

public class Chicken extends Animal {

	@Override
	public void makeNoise() {
		System.out.println("*Cluck*");
	}

	@Override
	public void eat() {
		System.out.println("*throws seeds*");
	}
	

}
