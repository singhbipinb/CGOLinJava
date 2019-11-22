package cgol;

public class CGOL extends Thread {

	/*CGOL class where multi-threading is used. It contains the logic
	 * 
	 * @author Bipin Singh
	 */
	int[][] ar;
	int row,col;
	
//	Constructor to take row, column and Array
	
	public CGOL(int[][] ar, int row, int col) {
		
		this.ar =ar;
		this.row=row;
		this.col=col;
		
		
	}
	
//	THe run method of thread class
	
	public void run() {
		
		int ARR[][] = new int[row][col];
		
//		Time when execution starts
		long timeofstart = System.nanoTime();
		int i,j;

/* Count the number of alive cells in neighborhood
 * 
 * 
 */
		int alive=0;
			for(i=0;i<row;i++){

				for(j=0;j<row;j++){
	alive=0;



	
//	At this positions the index of the neighbors will be out of Array bound
	if(i==0 || j==0 || i==(row-1) ||j==(col-1)) {
		
	}
	else {
		
		
		if(ar[i-1][j-1]==1){		//checks the up left neighbor
		alive++;
	}

	if(ar[i-1][j]==1){		//checks the up neighbor
			alive++;
		}
	if(ar[i-1][j+1]==1){		//checks the up right neighbor
			alive++;
		}

	if(ar[i][j-1]==1){		//checks the left neighbor
			alive++;
		}

	if(ar[i][j+1]==1){		//checks the right neighbor
			alive++;
		}

	if(ar[i+1][j-1]==1){		//checks the bottom left neighbor
			alive++;
		}

	if(ar[i+1][j]==1){		//checks the bottom neighbor
			alive++;
		}

	if(ar[i+1][j+1]==1){		//checks the bottom right neighbor
			alive++;
		}
		


	}

		// Each cell with one or no neighbors dies, as if by under-population

		if(alive<2){
			ARR[i][j]=0;
		}

		else if(alive==2){

		// Each cell with two neighbors survives

			if(ar[i][j]==1){

				ARR[i][j]=1;
			}

		// If the cell has two alive neighbors and it is dead then it will remain dead
			else{

			ARR[i][j]=0;
			}

		}

		// Each cell with three neighbors survives
		// Each cell with three neighbors becomes populated


		else if (alive==3){

			ARR[i][j]=1;
		}

		//Each cell with four or more neighbors dies, as if by overpopulation

		else if(alive>3){
			ARR[i][j]=0;

			}


		}

	}

		// Print the next generation

		int k,l;
				for(k=0;k<row;k++){

						for(l=0;l<col;l++){

							System.out.print(""+ARR[k][l]);

						}
						System.out.println();
					}


		//gives the value of new array(ARR) to the previous array(ar)

			for(k=0;k<row;k++){
					for(l=0;l<col;l++){

						ar[k][l]=ARR[k][l];

						}

					}
			
//			Print the time of generating the generation
			long time = (System.nanoTime() - timeofstart);
			System.out.println("");
			System.out.println("Time taken to generate this generation: "+time+ " ns");
			System.out.println("");
			System.out.println("Enter y for next gen");
			
		
	}
	
}
