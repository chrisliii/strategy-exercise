package ca.mcgill.ecse321.designpatterns.strategy;

public class RandomDiscount implements Discount {
	private double percent;
	
	public RandomDiscount() {
		this.percent = 1 + (int)(Math.random() * (50-1+1));
	}
	
	@Override
	public double compute(double fullPrice) {
		return fullPrice * (1-this.percent/100);
	}
}