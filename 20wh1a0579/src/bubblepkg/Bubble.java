package bubblepkg;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Bubble {
	public static ArrayList <Integer> array = new ArrayList <Integer>();
	public static int size;
	
	static void main(String[] args) {
		readArr();
		bubSort();

	}
	public static void readArr()
	{
		Scanner keyScan = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		size = keyScan.nextInt();
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < size; i++)
		{
			array.add(keyScan.nextInt());
		}
		
	}
	public static void bubSort()
	{
		int interchanges = 0;
		int swaps = 1;
		for (int i = 0; i < size - 1; i++)
		{
			swaps = 0;
			for (int j = 0; j < size - 1; j++)
			{
				if (array.get(i) < array.get(j))
				{
					int temp = array.get(i);
					array.set(i, array.get(j));
					array.set(j, temp);
					interchanges ++;
					swaps = 1;
				}
				
			}
			if (swaps == 0)
				break;
		
		}
		System.out.println(array.toString());
		System.out.println(interchanges);
	}

}
