package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<Animal>();
		
//		Pig pig = new Pig();
//		Chicken chicken = new Chicken();
//		Cow cow = new Cow();
//		Sheep sheep = new Sheep();
//		Chicken chicken2 = new Chicken();
//		Cow cowtoo = new Cow();
		
		farm.add(new Pig());
		farm.add(new Chicken());
		farm.add(new Cow());
		farm.add(new Sheep());
		farm.add(new Chicken());
		farm.add(new Cow());
		
		for (int i = 0; i < farm.size(); i++) {
			farm.get(i).makeNoise();
			farm.get(i).eat();
		}
	}
}
