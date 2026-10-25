package dip;

public class DeductionCalculatorLow implements IDeductionCalculator{

	public float calculate(Bill bill)  {
		return (bill.billAmount * bill.deductionPercentage) / 100;
	}
}