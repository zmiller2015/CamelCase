//Making Commits trying to figure out GitHub link to Eclispe :0

package BrainTeasers;

import java.util.Scanner;

public class PrisonCell {

	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many prison cells: ");
		int totalCellNumber = input.nextInt();
		System.out.println("How many prisoners will be released: ");
		int releaseNumber = input.nextInt();  
		int toBeReleased[] = new int[10];  //to hold the values input from the keyboard
		//int cellArray[] = new int[100];		//I might not need this
		for (int i = 0; i < releaseNumber; i++)
		{
			System.out.println((i+1) + " prisoner: ");
			toBeReleased[i] = input.nextInt();
		}
		int max = totalCellNumber - 1;
		
		int temp = releaseNumber;  //This is the largest number of bribes to be subtracted repeatedly from the released ppl
		int middle = (totalCellNumber - 1) / 2;
		for (int j = 0; j < releaseNumber; j++){

			int closest = determineClosest(temp, toBeReleased, middle, 100);
			
			System.out.println(toBeReleased[closest]);
			if(j > 0){
				if(toBeReleased[closest] < max)
					max = toBeReleased[closest] - 2;
				else
					max = toBeReleased[closest] - max - 1;
			}
			System.out.println("Bribes: " + max);
			
			toBeReleased[closest] = 100;

			
			
		}
		/*    A better idea foor how to get this accomplished is to save the index of the highest value so that I can delete it from
		 *    the array once I am done with it
		 * 
		 *    The idea of my main method is that a loop will go through as many times as there are prisoers to be released. and then remove them
		 *    from the array recording the 
		 */
		
		
		
		
		
		input.close();
	}//end of main
	
	/*  within determine closest we are trying to find the index of the closest number to the middle index
	 *  The incentive here is that if we know which index is nearest the center then we can use that number next
	 *  to release and get smaller brides than the remaining indexes.
	 * 
	 *  We want to return a pointer to the correct index. the index of the closest index.
	 * 
	 * 
	 */
	
	public static int determineClosest(int sizeIndex, int toBeReleased[], int middle, int result){
		
		if (sizeIndex < 0) //base case
			return result;
		else if (result == 100 || Math.abs(middle - toBeReleased[sizeIndex]) < Math.abs(middle - toBeReleased[result]))    // if the absolute value of middle - first value then make result else recurse
		{
			result = determineClosest(--sizeIndex, toBeReleased, middle, sizeIndex + 1);
		}
		else
			result = determineClosest(--sizeIndex, toBeReleased, middle, result);
		return result;
	}
}
