package shapes;

import java.io.*;
import java.util.Scanner;

public class Circle extends Shape {
	public static int radius;
	public static Scanner keyScan = new Scanner(System.in);
	public static double area;
	Circle()
	{
		System.out.print("Enter the radius of the circle: ");
		radius = keyScan.nextInt();
	}
	public  void main(String[] args) {
		printArea();

	}
	public  void printArea()
	{
		area = 3.14 * radius * radius;
		System.out.print("The area is " + area);
	}

}
