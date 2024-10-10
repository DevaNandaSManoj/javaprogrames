package javacs;
import java.io.*;
public class FileException {
	 public static void main(String[] args) {
		 try {
		 FileInputStream fin = new FileInputStream("File1.txt");
		 FileOutputStream fout = new  FileOutputStream("File.txt");
		 int i;
		 while((i=fin.read())!=-1) {
			 fout.write(i);
		 }
		 fin.close();
		 fout.close();
		 System.out.println("Successfully wrote to the specific file");
	 }
		 catch(IOException e) {
			 System.out.println("An error occured");
			 e.printStackTrace();
		 }
 }
}
