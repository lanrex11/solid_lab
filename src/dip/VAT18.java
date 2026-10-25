package dip;

public class VAT18 implements IVATCalculator {
	
	public float calculate(Bill bill) {
		return bill.billAmount * 0.18f;
	}

}
