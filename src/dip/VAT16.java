package dip;

public class VAT16 implements IVATCalculator {
	
	public float calculate(Bill bill) {
		return bill.billAmount * 0.16f;
	}

}
