package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double totalAmount = growthRate*population;
		return 1.5*totalAmount;
	}

}
