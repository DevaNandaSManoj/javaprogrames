package javacs;
import java.util.Scanner;
public class StringPalin {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to check given string is palindrome or not");
		String str=sc.nextLine();
		int flag=0;
		int len=str.length();
		for(int i=0;i<len/2;i++)
		{if(str.charAt(i)!=str.charAt(len-i-1))
        {flag=1;
         break;}
        }
		if (flag==0) 
			System.out.println("String is palindrome");
		
		else 
			System.out.println("String is not palindrome");
		    
			
	}
	
}
