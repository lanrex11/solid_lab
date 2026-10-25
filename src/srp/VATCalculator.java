package srp;

public class VATCalculator {
	
	public float calculate(Bill bill) {
		return bill.code.compareTo("0") == 0 ? 0 :  bill.billAmount * 0.18f;
	}

}
