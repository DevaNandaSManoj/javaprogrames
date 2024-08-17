package oops;
import java.util.Scanner;
public class matrix {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no of rows of first matrix,r1: ");
    int r1 = sc.nextInt();
    System.out.println("Enter the no of coloumns of first matrix,c1: ");
    int c1 = sc.nextInt();
    System.out.println("Enter the no of rows of second matrix,r2: ");
    int r2 = sc.nextInt();
    System.out.println("Enter the no of coloumns of second matrix,c2: ");
    int c2 = sc.nextInt();
    if(c1!=r2) {
    	System.out.println("Matrix multiplication is not possible");	
    	return;
    }
    int A[][]=new int[r1][c1];
    int B[][]=new int[r2][c2];
    int C[][]=new int[r1][c2];
    System.out.println("Enter the elements of matrix A: ");
    for(int i=0;i<r1;i++) {
    	for(int j=0;j<c1;j++) {
    		System.out.println("A["+i+"]["+j+"]");
    		A[i][j]=sc.nextInt();
    	}
    }
    System.out.println("Enter the elements of matrix B: ");
    for(int i=0;i<r2;i++) {
    	for(int j=0;j<c2;j++) {
    		System.out.println("B["+i+"]["+j+"]");
    		B[i][j]=sc.nextInt();
    		}
    	}
    for(int i=0;i<r1;i++) {
    	for(int j=0;j<c2;j++) {
    		C[i][j]=0;
    		for(int k=0;k<c1;k++) {
    			C[i][j]=C[i][j]+A[i][k]*B[k][j];
    		}
    	}
    }
    System.out.println("Matrix A: ");
    for(int i=0;i<r1;i++) {
    	for(int j=0;j<c1;j++) {
    		System.out.print(A[i][j]+"\t");
    	}
    	System.out.println();
    	}
    System.out.println("Matrix B: ");
    for(int i=0;i<r2;i++) {
    	for(int j=0;j<c2;j++) {
    		System.out.print(B[i][j]+"\t");
    	}
    	System.out.println();
    	}
    System.out.println("Multiplied matrix C: ");
    for(int i=0;i<r1;i++) {
    	for(int j=0;j<c2;j++) {
    		System.out.print(C[i][j]+"\t");
    	}
    	System.out.println();
    	}
    		
}
}
