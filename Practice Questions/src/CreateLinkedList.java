import java.util.LinkedList;

public class CreateLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> officers = new LinkedList<String>();
		officers.add("Blake");
		officers.add("Burns");
		officers.add("Pierce");
		officers.add("McIntyre");
		officers.add("Holt");
		
		for(String officer : officers) {
			//System.out.println(officer);
		}
		
		//to add at a specific position in the list, specify the index
		officers.add(2,"Peralta");
		
		for(String officer : officers) {
			System.out.println(officer);
		}

	}

}
