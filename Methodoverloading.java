 package javacs;
import java.util.Scanner;
class method{
	public double area(float base,float height) {
		return 0.5*base*height;
	}
	public  double area(int length,int breadth) {
		return length*breadth; 
	}
	public double area(float radius) {
		return 3.14*radius*radius ;
	}
	public class MethodOverloading{
	public static void main(String[] args) {
		method obj=new method();
		 Scanner sc=new Scanner(System.in);
            System.out.println("Enter the base of the triangle: ");
            float base=sc.nextFloat();
            System.out.println("Enter the height of the triangle: ");
            float  height=sc.nextFloat();
            System.out.println("Area of the triangle: ");
            System.out.println(obj.area(base,height));
            System.out.println("Enter the length of the rectangle: ");
            int length=sc.nextInt();
            System.out.println("Enter the breadth of the  rectangle: ");
            int breadth =sc.nextInt();
            System.out.println("Area of the  rectangle: ");
            System.out.println(obj.area(length,breadth));
            System.out.println("Enter the radius of circle: ");
            float radius=sc.nextInt();
            System.out.println("Area of the circle: ");
            System.out.println(obj.area(radius));
            	}
	}
}
