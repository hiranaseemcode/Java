

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Manager extends Employee{



	ArrayList<Employee> team = new ArrayList<Employee>();

	private int salary;



	public Manager(String name, int age, String employer, int salary) {
		super(name, age, employer, salary);
		this.salary = salary;
	}

	public void addEmployee(Employee e) {
		this.team.add(e);
	}
	@Override
	public int getSalary() {
		int totalsalary=0;
		for (Employee emp : team) {
			totalsalary+= emp.getSalary();
		}
		return Math.round(totalsalary/team.size() + this.salary);
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public ArrayList<Employee> getTeam() {
		return this.team;
		
	}
	
	public int compareTo(Manager m) {
		if( super.compareTo(m) == 0) {
			
		}
		if(team.size() < m.team.size()) {
			return 1;
		}else if(team.size() == m.team.size()) {
			return 0;
		}else {
			return -1;
		}
//		return 1;
//		
		
		//return 1;
	}

	public String toString() {
		return "Manager:["+getName()+", "+getAge()+"]["+getEmployer()+", "+getSalary()+"][Team: "+getTeam().size()+"]";
	}
	
	/*
	 * public boolean equals(Object o) { if(o instanceof Employee) { if(((Employee)
	 * o).getName() == getName() && ((Employee) o).getAge() == getAge() &&
	 * ((Employee) o).getEmployer() == getEmployer() && ((Employee) o).getSalary()
	 * == salary){ return true; } }else if(o instanceof Manager) { if(((Manager)
	 * o).getName() == getName() && ((Manager) o).getAge() == getAge() && ((Manager)
	 * o).getEmployer() == getEmployer() && ((Manager) o).salary == salary){ return
	 * true; } } else { if(((Person) o).getName() == getName() && ((Person)
	 * o).getAge() == getAge()){ return true; } } return false; }
	 */

	
	  @Override public int hashCode() { final int prime = 31; int result =
	  super.hashCode(); result = prime * result + Objects.hash(salary, team);
	  return result; }
	  
	  @Override public boolean equals(Object obj) { if (this == obj) { return true;
	  } if (!super.equals(obj)) { return false; } if (!(obj instanceof Manager)) {
	  return false; } Manager other = (Manager) obj; return salary == other.salary
	  && Objects.equals(team, other.team); }
	 

	public static void main(String[] args) {
		Manager m1 = new Manager("Matthew", 41, "UCD", 50000);
		Manager m2 = new Manager("Marvin", 50, "UCD", 60000);
		Employee e1 = new Employee("Edward", 24, "UCD", 35000);
		Employee e2 = new Employee("Elliott", 31, "UCD", 48000);
		Employee e3 = new Employee("Ernesto", 28, "UCD", 38000);
		Employee e4 = new Employee("Emily", 34, "UCD", 42000);
		m1.addEmployee(e1);
		m1.addEmployee(e2);
		m2.addEmployee(e3);
		m2.addEmployee(m1);
		m1.addEmployee(e4);	
		System.out.println(m1.compareTo(m2) + " " + m2.compareTo(m1) + " " + m1.compareTo(m1));
		System.out.println(m1.equals(m2) + " " + m2.equals(m1) + " " + m1.equals(m1));
		System.out.println(m1.compareTo(e1) + " " + m1.compareTo(e2) + " " + e1.compareTo(m1) + " " + e2.compareTo(m1));
		System.out.println(m1.equals(e1) + " " + m1.equals(e2) + " " + e1.equals(m1) + " " + e2. equals(m1));
		Employee e5 = new Employee(m1.getName(), m1.getAge(), m1.getEmployer(), m1.getSalary());
		System.out.println(e5.compareTo(m1) + " " + m1.compareTo(e5));
		System.out.println(e5.equals(m1) + " " + m1.equals(e5));
		
		
	}

}
