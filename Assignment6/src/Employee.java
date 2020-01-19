import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Employee extends Person{
	
	private String employer;

	private int salary;
	
	public Employee(String name, int age, String employer, int salary) {
		super(name, age);
		this.employer = employer;
		this.salary = salary;
	}

	public Employee(String name, int age, String employer) {
		super(name, age);
		this.employer = employer;
		}

	public int getSalary() {
		return salary;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getEmployer() {
		return employer;
	}
	
	public String toString() {
		return "Employee:["+getName()+", "+getAge()+"]["+employer+", "+salary+"]";
	}
	
	public boolean equals(Object o) {
	if(o instanceof Employee) {
			if(((Employee) o).getName() == getName() && ((Employee) o).getAge() == getAge() && ((Employee) o).employer == employer && ((Employee) o).salary == salary){
				return true;
			}
		}
		else {
			if(((Person) o).getName() == getName() && ((Person) o).getAge() == getAge()){
				return true;
			}
		}
		return false;
	}
	@Override
	public int compareTo(Human h) {//It is used to compare the current object with the specified object
		if(getAge() < h.getAge()) {
			return -1;
		}else if(getAge() == h.getAge()) {
			if(salary < ((Employee) h).getSalary()) {
				return -1;
			}else if(salary > ((Employee) h).getSalary()) {
				return 1;
			}
			else {
				return 0;
			}
		}
		return 1;
	}

//	public static void main(String[] args) { 
//		Employee h = new Employee("Jamie", 22, "EY", 80000);
//		Employee i = new Employee("Joyce", 23, "KPMG", 90000);
//		System.out.println(h.getSalary() + " " + h.getEmployer());
//		System.out.println(i.getSalary() + " " + i.getEmployer());
//
//	}
	 

}
