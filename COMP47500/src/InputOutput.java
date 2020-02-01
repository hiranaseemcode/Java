import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class InputOutput {

	public static void main(String[] args) throws IOException { //this "throws" handles IOexception
 		
		try {
			
			File file = new File("test1.txt"); //create new file called test1.txt
			file.createNewFile();
			PrintWriter pr = new PrintWriter("test1.txt"); //write to new file
			pr.print("hi");
			pr.close();
			
			FileReader reader = new FileReader("test1.txt"); //print contents of new file
			Scanner sc = new Scanner(reader);
			while(sc.hasNext()) {
				System.out.print(sc.next());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
