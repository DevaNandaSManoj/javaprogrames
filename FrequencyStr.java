package javacs;
import java.util.Scanner;
public class FrequencyStr {
	 public static void main(String[]args)
	 {
		 Scanner av=new Scanner(System.in);
		 System.out.println("Enter The String To Check The Frequency Of Given character");
		 String str=av.nextLine();
		 int len= str.length();
		 System.out.println("Enter the character to be check");
		 char ch=av.nextLine().charAt(0);
		 int count=0;
		 for(int i=0;i<len;i++) {
			 if(str.charAt(i)==ch) {
				 count++;
			 }
		 }
		 System.out.println("The occarance of character"+ch+ "=" +count);
	 }
	}


