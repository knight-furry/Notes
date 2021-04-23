// 2D Jagged Array

import java.util.Scanner;

class Array
{
	public static void main(String args[])
	{
		int index1, index2;
		Scanner sc = new Scanner(System.in);
		
		int A[][] = {{1},{2, 3},{4, 5, 6}};
		
		int B[][];
		
		B = new int[3][];
		
		B[0] = new int[3];
		B[1] = new int[2];
		B[2] = new int[1];
		
		// Displaying values from Jagged array which is already initialised
		System.out.println("2D-Array A : ");
		for(index1 = 0 ; index1 < A.length ; index1++)
		{
			for(index2 = 0 ; index2 < A[index1].length ; index2++)
			{
				System.out.print(A[index1][index2] + " "	);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		
		// Entering values into an Jagged Array through keyboard
		System.out.println("Please, Enter the elements you want to enter in the 2D Array : ");
		for(index1 = 0 ; index1 < B.length ; index1++)
		{
			for(index2 = 0 ; index2 < B[index1].length ; index2++)
			{
				B[index1][index2] = Integer.parseInt(sc.nextLine());
			}
		}
		
		// Displaying values from Jagged array
		System.out.println("2D-Array B : ");
		for(index1 = 0 ; index1 < B.length ; index1++)
		{
			for(index2 = 0 ; index2 < B[index1].length ; index2++)
			{
				System.out.print(B[index1][index2] + " "	);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
	}
}