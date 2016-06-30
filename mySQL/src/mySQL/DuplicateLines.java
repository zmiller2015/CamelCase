package mySQL;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class DuplicateLines {

	public static void main(String args[]) throws FileNotFoundException{
		
		// open a file
		//make a string array that is used to store the first letter of every line in
		//
	//	DuplicateLine();
		//ask for more heap space.
	/*	bNumber array[] = new bNumber[10000];
		for (int i = 0; i < (array.length - 1); i++){
			array[i].setNumber(i);
		}
		*/
	
		//BSTinitialize( array);
		bNumber test = new bNumber(1111);
		test.assignNumber();
		System.out.println(test.checkAssigned() ? "The number is assigned." : "The number isn't assigned.");
		
		
		//System.out.println((inOrderString() ? "String was found" : "String wasn't found"));
		DetermineStrings("01?1?0", "", 0);
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an index for the Fibonacci number: ");
		int index = input.nextInt();
		
		System.out.println( "Fibonacci number at index" + index + " is " + fib(index));;
		
		
	}
	
	public static long fib(long n){
	long f0 = 0;
	long f1 = 1;
	long answer = 1;
	
	if(n == 0)
		return 0;
	else if (n == 1)
		return 1;
	else if (n == 2) 
		return answer;
	
	for (int i = 3; i <= n; i++){
		f0 = f1;
		f1 = answer;
		answer = f0 + f1;
		}
	
	return answer;
	}
	
	
public static boolean inOrderString(){
	String Text = "abcNfkrgnsAseibvGrgpAklkaRewsqnRtytytOaaa";
	String sample = "NAGARRO";
	int counter = 0;
	int parser = 0;
	while(counter < Text.length() && parser < sample.length()){
		if(sample.charAt(parser) == (Text.charAt(counter))){
			System.out.println(sample.charAt(parser++) + " found.");
		}
		counter++;
	}
	if ( parser >= sample.length()){
		return true;
	}	else
		return false;
			
	
}
/*
public static void BSTinitialize(bNumber[] * arr){
	int index = 0;
	while(index < (arr.length() - 1)){
		arr[index] = index;
	}
}
*/
	
public static void DuplicateLine() throws FileNotFoundException{
//   An array of 26 empty spots, go through the file and put a 1 in spots that 
  	int firstLetter[] = new int[26];
   java.io.File TextDocument = new java.io.File("C:\\Users\\Zach\\Desktop\\text1.txt");   /// open the file for the document to read
   Scanner input = new Scanner(TextDocument);    	//now the file is in the scanner file
   while(input.hasNext()){
  		String currentLine = input.nextLine();
   	System.out.println(currentLine);
   }
   
  
 
 	int linesToCheck[] = new int[100];
  int lineIndex = 0;
  String currentLine;
 	for (int i = 0; input.hasNext() && i < 12; i++)	{
 		currentLine = input.nextLine();
 		for(int alphaIncrement = 0; alphaIncrement < 25; alphaIncrement++)
 			{ // this loop iterates at Constant rate
 		
 				if(currentLine.charAt(0) == (char)(65+alphaIncrement) || currentLine.charAt(0) == (char)(97+alphaIncrement)) //line is an a
 				{ 	
 					firstLetter[alphaIncrement]++;
 					linesToCheck[lineIndex++] = i;
 				 }//......For all Lines.....// actually do a switch instead for simplicity.
 			}
 		
 		}
 	for(int it = 0; it < 25; it++)
		{ // this loop iterates at Constant rate
 			System.out.println(firstLetter[it]);
		}
 	
 	
 	
 


   input.close();
}// end of duplicate lines 

public static void DetermineStrings(String original, String possible, int index){
	//base case is that there is no next character
	//recursive case is that there is a ? because it can be 0 or 1 send the recursive case with 1 then when it comes back address the 0
	
	if(index >= original.length())
		{
		System.out.println(index + " " + possible);
		return; }
	//for (int i = 0; i < input.length(); i++){
	else if(original.charAt(index) == '?'){
		String temp = possible;
		DetermineStrings(original, possible.concat("1"), ++index);
			//System.out.println(index + " " + possible.concat("1"));
		DetermineStrings(original, temp.concat("0"), index);
		//	System.out.println(index + " " + temp.concat("0"));
}
	else{
		DetermineStrings(original, possible + original.charAt(index), ++index);		
			}
	//System.out.println(index + " " + possible);
	return;
	
		
	}




	public static int gcd(int i, int j){
		int gcd = 1;
		for(int k = 2; k <= i && k <= j; k++){
		
			if(i % k == 0 && j % k ==0)
				gcd = k;
			}
		return gcd;
	}

}