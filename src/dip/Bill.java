package dip;

import java.util.Date;

public class Bill {
	public String code;
	public Date billDate;
	public float billAmount;
	public float VAT;
	public float billDeduction;
	public float billTotal;
	public int deductionPercentage;
	
	
	// Fakturaren totala kalkulatzen duen metodoa.
	public void totalCalc() {
		
		// Dedukzioa kalkulatu
		IDeductionCalculator dCalc = new DeductionCalculatorHigh();
		billDeduction = dCalc.calculate(this);
		
		// VAT kalkulatzen dugu
		IVATCalculator vCalc = new VAT0();
		VAT =  vCalc.calculate(this);
		
		// Totala kalkulatzen dugu
		billTotal = (billAmount - billDeduction) + VAT;
	}
}