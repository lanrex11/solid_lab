package srp;

public class DeductionCalculator {

    public float calculate(Bill bill) {
        if (bill.billAmount > 50000) {
            return (bill.billAmount * bill.deductionPercentage + 5) / 100;
        } else {
            return (bill.billAmount * bill.deductionPercentage) / 100;
        }
    }
}