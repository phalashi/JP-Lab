package shapes;

import java.io.*;
import java.util.Scanner;

public class Triangle extends Shape {
	public static int breadth, height;
	public static Scanner keyScan = new Scanner(System.in);
	public static double area;
	Triangle()
	{
		/*System.out.print("Enter the breadth of the circle: ");
		breadth = keyScan.nextInt();
		System.out.print("Enter the height of the circle: ");
		breadth = keyScan.nextInt();*/
		breadth = 4;
		height = 2;
	}
	public static void main(String[] args) {
		printArea();

	}
	public static void printArea()
	{
		area = height * breadth / 2;
		System.out.print("The area is " + area);
	}

}
