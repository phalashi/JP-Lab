package shapes;
import java.io.*;
import java.util.Scanner;

public class Rectangle extends Shape {
	public static int breadth, height;
	public static Scanner keyScan = new Scanner(System.in);
	public static int area;
	Rectangle()
	{
		System.out.print("Enter the breadth of the circle: ");
		breadth = keyScan.nextInt();
		System.out.print("Enter the height of the circle: ");
		breadth = keyScan.nextInt();
	}
	public static void main(String[] args) {
		printArea();

	}
	void printArea()
	{
		area = height * breadth;
		System.out.print("The area is " + area);
	}
	


}
