package javacs;
import java.util.*;
import java.io.*;
import java.io.FileWriter;
import java.io.File;
public class FileR{
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			
			File obj = new File("Register1.txt");
		    if (obj.createNewFile()) {
			System.out.println("Register1.txt created \n");}
		    else {
		    	System.out.println("Already exist");
		    }
			
			FileWriter fout = new FileWriter ("Register1.txt");
			System.out.println("Enter KEAM rank number: ");
			int n = sc.nextInt();
			fout.write(n+ "\n");
			fout.close();
			System.out.println("Data added");
			
		FileReader fin = new FileReader("Register1.txt");
		BufferedReader br = new BufferedReader(fin);
		String line;
		
		System.out.println("\n Content of Register1.txt is: ");
		while((line = br.readLine())!= null) {
			System.out.println(line);
		}
		br.close();
		}
		catch(IOException e) {
			System.out.println("Exception occured: " +e.getMessage());
		}
	}
	

}
