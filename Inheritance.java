package javacs;
import java.util.Scanner;
class Employee{
	String name;
	int age;
	long phonenumber;
	String address;
	float salary;
	Employee(String name1,int age1,long phonenumber1,String address1,float salary1)
	{
		name=name1;
		age=age1;
		phonenumber=phonenumber1;
		address=address1;
		salary=salary1;
	}
	void printEmployee()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age)	;
		System.out.println("Phone number: "+phonenumber);
		System.out.println("Address: "+address);
	}
	void printSalary() {
		System.out.println("Salary: "+salary);
		}
	
}
class Officer extends Employee{
	String specialization;
	Officer(String name1,int age1,long phonenumber1,String address1,float salary1,String specialization1)
	{
		super(name1,age1,phonenumber1,address1,salary1);
		specialization=specialization1;
		
	}
	void printSpecialization()
	{
		System.out.println("Specialization= "+specialization);	
	}
}
class Manager extends Employee{
	String department;
	Manager(String name1,int age1,long phonenumber1,String address1,float salary1,String department1){
		super(name1,age1,phonenumber1,address1,salary1);
		department=department1;
		
	}
	void printDepartment() {
		System.out.println("Department= "+department);
	}
}
public class Inheritance {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int age;
	String name,address,specialization,department;
	float salary;
	long phonenumber;
	System.out.println("Enter the details of the officer");
	System.out.println("Enter Name: ");
	name=sc.next();
	System.out.println("Enter Age: ");
	age=sc.nextInt();
	System.out.println("Enter Phone number: ");
	phonenumber=sc.nextLong();
	System.out.println("Enter Address:");
	address=sc.next();
	System.out.println("Enter Salary");
	salary=sc.nextFloat();
	System.out.println("Enter Specialization: ");
	specialization=sc.next();
	 
	Officer o=new Officer(name,age,phonenumber,address,salary,specialization);

	System.out.println("Enter details of Manager:");
	System.out.println("Enter Name:");
	name=sc.next();
	System.out.println("Enter Age:");
	age=sc.nextInt();
	System.out.println("Enter Phone number:");
	
	phonenumber=sc.nextLong();
	System.out.println("Enter Address:");
	address=sc.next();
	System.out.println("Enter Salary:");
	salary=sc.nextFloat();
	System.out.println("Enter the Department ");
	department=sc.next();

	Manager m=new Manager(name,age,phonenumber,address,salary,department);

	System.out.println("DETAILS OF OFFICER");
	o.printEmployee();
	o.printSalary();
	o.printSpecialization();

	System.out.println("DETAILS OF MANAGER");
	m.printEmployee();
	m.printSalary();
	m.printDepartment();
	}
}
