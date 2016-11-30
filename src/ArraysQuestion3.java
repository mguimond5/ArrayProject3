/**
	*
	* Name: Marsha Guimond
	* Teacher: Mr.Hardman
	* Assignment 5, Program 2
	* Date Last Modified: November 29, 2016
	*
	*/
import java.util.Scanner;


/**
 * 
 */

/**
 * @author m.guimond3
 *
 */
public class ArraysQuestion3{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		
		int[] userNumbers = new int[5];
		int index = -1;
		int maximum;
		
		System.out.println("Please enter five whole numbers below:");
		System.out.println();
		
		for(int i = 0; i < userNumbers.length; i++){
			System.out.print("Please enter a number: ");
			userNumbers[i] = userInput.nextInt();
			
		}
		
		maximum = userNumbers[0];
		
		for(int i = 0; i < userNumbers.length; i++){
			if(userNumbers[i] > maximum){
				maximum = userNumbers[i];

			}
	
		}
		
		System.out.println("Maximum number is: " + maximum + ".");
		
		for(int i = 0; i < userNumbers.length; i++){
			if(userNumbers[i] == maximum){
				index = i;
			}
			
		}
		
		System.out.println("The maximum number can be found at the index of " + index + ".");
		
		userInput.close();
	}
	
}
