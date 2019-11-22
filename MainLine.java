package cgol;

import java.time.Duration;
import java.util.Scanner;

/*
 * Class MainLine contains the main functions
 * 
 * Here the start is called 
 * 
 * 
 * @author Bipin Singh
 * 
 */
public class MainLine {
			
	public static void main(String[] args) {
		
Scanner scanner =new Scanner(System.in);

		// Size of array is user's choice

		int row, col;
		System.out.println("Enter the number of rows you want: ");
		row = scanner.nextInt();
		System.out.println("Enter the number of columns you want: ");
		col = scanner.nextInt();
		int Arr[][] = new int[row][col];


	/* Taking input of the Array
	 *
	 *
	 */

		System.out.println("Enter the Intial state \n 0 for dead \n 1 for alive \n");


		int i,j;
			for(i=0;i<row;i++){
				
				System.out.println("Enter the "+ (i+1) +" row");

				for(j=0;j<col;j++){

					Arr[i][j] = scanner.nextInt();
				}

			}

// Print the 

		for(i=0;i<row;i++){

			for(j=0;j<col;j++){

				System.out.print(""+Arr[i][j]);

			}
			System.out.println("");
		}
		System.out.println("");
		CGOL(row,col,Arr);

	}

/* Method to implement the rules of CGOL
 *
 */
	static void CGOL(int row,int col,int ar[][]){
		

		Scanner sc= new Scanner(System.in); 

		int ARR[][] =new int[row][col];

		int d,e;


		
/*	For printing multiple generations
 * 
 * 
 */
		
		int f=1;
		char next;
	do{

//	Object of CGOL class
		
		CGOL cgol = new CGOL(ar,row,col);
		
		System.out.println("Generation No. "+f+ "\n");
		
		cgol.start();

	
		next = sc.next().charAt(0);
		f++;
		}while(next=='y' || next=='Y');

	}
	

	
}
