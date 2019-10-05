package _02_Cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	
	}

	@Override
	double getAnnualTaxes() {
		double totalAmount = (0.5*growthRate)*growthRate*population;
		return totalAmount;
	}
	
}
