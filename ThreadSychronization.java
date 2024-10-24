package javacs;
import java.util.*;
class Table{
	void printTable(int n) {
		synchronized(this) {
			for(int i=1;i<15;i++) {
				System.out.println(n+"*"+i+"="+(n*i));
				try {
					 Thread.sleep(400);
				}
				catch(Throwable e){
					System.out.println(e);
				}
				
			}
		}
	}
}
class MyThread1 extends Thread{
	Table t;
	int n;
	MyThread1(Table t){
		this.t=t;
	}
	public void run() {
		t.printTable(n);
	}
}
class MyThread2 extends Thread{
	Table t;
	int n;
	MyThread2(Table t){
		this.t=t;
	}
	public void run() {
		t.printTable(n);
	}
}

public class ThreadSychronization {
   public static void main(String[]args) {
	   Table t = new Table();
	   Scanner sc=new Scanner(System.in);
	   MyThread1 th1=new MyThread1(t);
	   MyThread2 th2=new MyThread2(t);
	   System.out.println("Enter the table you want to run by Thread1: ");
	     th1.n=sc.nextInt();
	     System.out.println("Enter the table you want to run by Thread2: ");
	     th2.n=sc.nextInt();
	     th1.start();
	     th2.start();
   }
}
