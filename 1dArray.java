// 1 Dimentional Arrays

import java.util.Scanner;

class Array
{
	public static void main(String args[])
	{
		int index;
		Scanner sc = new Scanner(System.in);
		
		// Array Declarations
		int[] A;
		int []B;
		int C[];
		
		// Array Definitions
		A = new int[0];
		B = new int[5];
		
		// Array Declaration + Definition + Initialisation
		int D[] = {100, 200, 300, 400, 500};
		
		// Array Declaration + Definition
		int E[] = new int[5];
		
		// Size of Array
		System.out.println("Size of A = " + A.length);
		System.out.println("Size of B = " + B.length);
		System.out.println("Size of D = " + D.length);
		System.out.println("--------------------------------------------------------------------------------");
		
		// Displaying values from Array which is already initialised
		System.out.print("1D-Array D = [");
		for(index = 0 ; index < D.length ; index++)
		{
			System.out.print(D[index] + " ");
		}
		System.out.println("]");
		System.out.println("--------------------------------------------------------------------------------");
		
		// Entering values into an Array through keyboard
		System.out.println("Please, Enter the elements you want to enter in the 1D Array : ");
		for(index = 0 ; index < E.length ; index++)
		{
			E[index] = Integer.parseInt(sc.nextLine());
		}
		
		// Displaying values from Array
		System.out.print("1D-Array E = [");
		for(index = 0 ; index < E.length ; index++)
		{
			System.out.print(E[index] + " ");
		}
		System.out.println("]");
		System.out.println("--------------------------------------------------------------------------------");
	}
}