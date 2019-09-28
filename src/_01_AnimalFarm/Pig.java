package _01_AnimalFarm;

public class Pig extends Animal {

	@Override
	public void makeNoise() {
		System.out.println("*Oink*");
	}

	@Override
	public void eat() {
		System.out.println("*throws food*");
	}

}
