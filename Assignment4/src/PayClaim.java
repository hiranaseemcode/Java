	public class PayClaim {
	public int noHoursWorked;
	Payroll.PayLevel payLevel;
	public double calculatedPay;
	
	public int getNoHoursWorked() {
		return noHoursWorked;
	}

	public Payroll.PayLevel getPayLevel() {
		return payLevel;
	}

	public double getCalculatedPay() {
		return calculatedPay;
	}

	public void calculatePay() {
		this.calculatedPay = Payroll.calculatePay(noHoursWorked, payLevel);
	}
	
	public void setCalculatedPay(double calculatedPay) {
		if(calculatedPay > 0) {
			this.calculatedPay = calculatedPay;
		}else {
			throw new IllegalArgumentException ("calculatedPay has to be greater than 0!");
		}
	}

	public PayClaim(int noHoursWorked, Payroll.PayLevel payLevel) {
		if(noHoursWorked >= 1 && noHoursWorked <= 80) {
			this.noHoursWorked = noHoursWorked;
		}
		else {
			throw new IllegalArgumentException ("noHoursWorked limit exceeded!");
		}
		this.payLevel = payLevel;
	}
	
	public String toString() {
		if(calculatedPay == 0) {
			if(noHoursWorked == 1) {
				return "PayClaim for " +noHoursWorked+  " hour, at PayLevel " +payLevel;
			}
			else
			{
				return "PayClaim for " +noHoursWorked+  " hours, at PayLevel " +payLevel;
			}
		}
		else {
			if(noHoursWorked == 1) {
				return "PayClaim for " +noHoursWorked+  " hour, at PayLevel " +payLevel+ ", which gives " + calculatedPay;
			}
			else
			{
				return "PayClaim for " +noHoursWorked+  " hours, at PayLevel " +payLevel+ ", which gives " + calculatedPay;
			}
		}
		
	}
	
	public static void main(String[] args) {
		Payroll.OVERTIME_RATE = 1.25;
		Payroll.REGULAR_WEEK = 55;
		Payroll.LEVEL_TWO_PAY = 40;
		PayClaim p = new PayClaim(70, Payroll.PayLevel.TWO);
		p.calculatePay();
		System.out.println(p);
	}

}
