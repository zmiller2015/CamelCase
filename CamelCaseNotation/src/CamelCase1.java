/*   Zach Miller username zmiller2015
 *   Coding Exercise in Recursion with CamelCaseNotation
 *   Takes Strings and Patterns from keyboard to test if the pattern exists within the String
 *   Executes in less than O(n^2) time. I think it is more than linear because of the recursion
 *   
 *   
 *   
 */

import java.util.Scanner;



public class CamelCase1 {
	
	public static void main(String args[])
	{
		
	System.out.println("Enter a string to test: ");
	System.out.println("change");
	Scanner input = new Scanner(System.in);
	String stringTest = input.nextLine();
	System.out.println("Enter a pattern to check against the array of Strings: ");
	String pattern = input.nextLine();
	if(checkPattern(pattern, 0, stringTest, 0, false))
		System.out.println("the pattern was found in " + stringTest);
	else
		System.out.println("the pattern was NOT found in " + stringTest);
	
	
	input.close();
	/*   I think this can be best executed through a recursive function that checks if the pattern at an 
	*    index is pointing to an uppercase or lowercase character. If upper we will check the pattern 
	*    against the word, and if true then recurse.
	*
	*   If false then we also want to check the pattern 
	*    because it could be the second or third in the string. If false here then return false and end 
	*    the recursion - false base case.
	*
	*    The True Base case is that the pattern’s index is greater than its length minus 1. Return true.
	*   
	*   If the isUpper is false, the program isn’t necessarily all false so there must be a loop
	*   mechanism that just interates through the word. THe first isUpper is that loop.  
	*/


	}// end of main


	static boolean checkPattern(String pattern, int index, String word, int wordIndex, boolean truthVal){

	if (index > (pattern.length() - 1) || wordIndex > (word.length() - 1))
	{
	  //  truthVal = true;
		return truthVal;
	}
    char p = pattern.charAt(index);
    char w = word.charAt(wordIndex);
    
	if (p > 64 && p < 91){ // dont want to quibble with the isUpper or lower with char equivalent
	       
		if (p == w)
	        {
				truthVal = true;
	           truthVal = checkPattern(pattern, ++index, word, ++wordIndex, truthVal);
	        }else{
	        	
	           truthVal = checkPattern(pattern, index, word, ++wordIndex, truthVal);
	        }
	}else{  //pattern could be still be true 
	    if(p == w)
	    {
	        truthVal = checkPattern(pattern, ++index, word, ++wordIndex, truthVal);
	    }else{
	    	truthVal = false;
	        return truthVal;
	        }
	    }
	return truthVal;

	}//end of Recursive function



}
