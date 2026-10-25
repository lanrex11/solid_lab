package dip;

public class DeductionCalculatorHigh implements IDeductionCalculator{

    public float calculate(Bill bill)  {
            return (bill.billAmount * bill.deductionPercentage + 5) / 100;
    }
}