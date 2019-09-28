package _01_AnimalFarm;

public class Sheep extends Animal{

	@Override
	public void makeNoise() {
		System.out.println("*Meh*");
	}

	@Override
	public void eat() {
		System.out.println("*throws hay*");
	}
	

}
