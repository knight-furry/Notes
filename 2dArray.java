// 2 Dimentional Arrays 

import java.util.Scanner;

class Array
{
	public static void main(String args[])
	{
		int index1, index2;
		Scanner sc = new Scanner(System.in);
		
		// Array Declarations
		int[][] A;
		int[] []B;
		int [][]C;
		int[] D[];
		int []E[];
		int F[][];
		
		// Array Definitions
		A = new int[0][0];
		B = new int[5][5];
		
		// Array Declaration + Definition + Initialisation
		int G[][] = {{100, 200, 300}, {400, 500, 600}, {700, 800, 900}};
		
		// Array Declaration + Definition
		int H[][] = new int[5][5];
		
		// Size of Array
		System.out.println("Size of A = " + A.length);
		System.out.println("Size of B = " + B.length);
		System.out.println("Size of G = " + G.length);
		System.out.println("Size of G[0] = " + G[0].length);
		System.out.println("Size of G[1] = " + G[1].length);
		System.out.println("Size of G[2] = " + G[2].length);
		System.out.println("--------------------------------------------------------------------------------");
		
		// Displaying values from array which is already initialised
		System.out.println("2D-Array G : ");
		for(index1 = 0 ; index1 < G.length ; index1++)
		{
			System.out.print("|");
			for(index2 = 0 ; index2 < G[index1].length ; index2++)
			{
				System.out.print(G[index1][index2] + " "	);
			}
			System.out.println("|");
		}
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		
		// Entering values into an Array through keyboard
		System.out.println("Please, Enter the elements you want to enter in the 2D Array : ");
		for(index1 = 0 ; index1 < H.length ; index1++)
		{
			for(index2 = 0 ; index2 < H[index1].length ; index2++)
			{
				H[index1][index2] = Integer.parseInt(sc.nextLine());
			}
		}
		
		// Displaying values from array
		System.out.println("2D-Array H : ");
		for(index1 = 0 ; index1 < H.length ; index1++)
		{
			System.out.print("|");
			for(index2 = 0 ; index2 < H[index1].length ; index2++)
			{
				System.out.print(H[index1][index2] + " "	);
			}
			System.out.println("|");
		}
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
	}
}