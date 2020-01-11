public class Payroll {
	
	public static double OVERTIME_RATE = 1.5;
	public static int REGULAR_WEEK = 40;
	public static int LEVEL_ONE_PAY = 15;
	public static int LEVEL_TWO_PAY = 25;
	public static int LEVEL_THREE_PAY = 40;
	
	enum PayLevel {ONE, TWO, THREE};
	
	public static double calculatePay(int noHoursWorked, PayLevel p) {
		//first check if noHoursWorked is <= 80
		if(noHoursWorked >= 1 && noHoursWorked <= 80) {
			if(noHoursWorked >= 1 && noHoursWorked <= REGULAR_WEEK) {
				switch(p) {
				case ONE:
					return noHoursWorked * LEVEL_ONE_PAY;
				case TWO:
					return noHoursWorked * LEVEL_TWO_PAY;
				case THREE:
					return noHoursWorked * LEVEL_THREE_PAY;
				default: throw new IllegalArgumentException("Hours are not correct!");
				}
			}
			else 
			{
				int overtimeHours = noHoursWorked - REGULAR_WEEK; //the hours worked overtime
				double hoursWorked;
				double overTimeHoursWorked;
				switch(p) {
				case ONE:
					hoursWorked = REGULAR_WEEK * LEVEL_ONE_PAY;
					overTimeHoursWorked = overtimeHours * LEVEL_ONE_PAY;
					return hoursWorked + overTimeHoursWorked * OVERTIME_RATE;
				case TWO:
					hoursWorked = REGULAR_WEEK * LEVEL_TWO_PAY;
					overTimeHoursWorked = overtimeHours * LEVEL_TWO_PAY;
					return hoursWorked + overTimeHoursWorked * OVERTIME_RATE;
				case THREE:
					hoursWorked = REGULAR_WEEK * LEVEL_THREE_PAY;
					overTimeHoursWorked = overtimeHours * LEVEL_THREE_PAY;
					return hoursWorked + overTimeHoursWorked * OVERTIME_RATE;
				default: throw new IllegalArgumentException("Hours are not correct!");
				}
			}
		}
		else {
			throw new IllegalArgumentException("Hours are not correct!");
		}
		
		
	}

	public static void main(String[] args) {
		try {
			   System.out.println(Payroll.calculatePay(100, Payroll.PayLevel.TWO));
			} catch (IllegalArgumentException ex) {
			   System.out.println("failure");
			}
	}

}
