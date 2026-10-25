package srp;

public class VATCalculator {
	
	public float calculate(Bill bill) {
		return bill.billAmount * 0.16f;
	}

}
