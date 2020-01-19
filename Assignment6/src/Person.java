import java.util.Objects;

public class Person implements Human {
	
	private String name;
	private int age;


	public Person(String name, int age) {
		if(age <=0) {
			throw new IllegalArgumentException("failure");
		}
		if(name == " " || name == "") {
			throw new IllegalArgumentException("failure");
		}
		this.setName(name);
		this.age = age;
	}

	@Override
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;		
	}

	public String toString() {
		return "Person:["+getName()+", "+age+"]";
	}
	
//	public boolean equals(Object o) {
//		if(o instanceof Person) {
//			if((((Person) o).getName() == getName()) && (((Person) o).age == age)) {
//				return true;
//			}
//		}
//		return false;
//	}
	
	
	public int compareTo(Human h) {//It is used to compare the current object with the specified object
		if(age < h.getAge()) {
			return -1;
		}else if(age > h.getAge()) {
			return 1;
		}
		return 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	public static void main(String[] args) {
		try {
			  Human h = new Person(" ", 22);
			  System.out.println(h);
			} catch (IllegalArgumentException ex) {
			  System.out.println("failure");
			}
	}


	
}
