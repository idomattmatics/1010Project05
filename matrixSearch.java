import java.util.Scanner;
/**
 * Purpose: searching in a two dimensional matrix
 * Matthew Kachar
 * @author mkachar
 * matthew.kachar@marquette.edu
 * April 9, 2014
 */

public class matrixSearch {



	public static void main(String[] args){


		matrixGenerator run = new matrixGenerator();

		Scanner keyboard = new Scanner (System.in);

		System.out.print("Please choose the size of the square matrix: ");

		int size = keyboard.nextInt();

		System.out.println("Here is the square matrix with random letters.");

		char [][] matrix = new char[size][size];

		String quit = "y";

		for(int i = 0; i < size; i++){//creates the array and populates it with lowercase letters
			for (int j = 0; j < size; j++){
				matrix[i][j] = run.letter();
			}
		}
		for(int i = 0; i < size; i++){//prints the array 
			for (int j = 0; j < size; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		do{
			System.out.println("What word would you like to find? ");

			String word = keyboard.next();

			word = word.toLowerCase();// allows the word to be entered in upper or lower case letters

			System.out.println("Enter to query to search: " + word); 

			run.searchMatrix(word, matrix);//The word is searched for

			System.out.println("There is " + run.getCount() + " occurrence(s) of " + word + " in the matrix. The position(s) of " + word + " in the matrix is as follows: ");

			for(int i = 0; i < size; i++){
				for (int j = 0; j < size; j++){
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
			}
			for (int i = 0; i < matrix.length; i++ ){//resets the array matrix characters to lowercase for another query
				for (int j = 0; j < matrix.length; j++ ){
					char a = matrix[i][j];
					matrix[i][j] = Character.toLowerCase(a);
				}
			}

			run.setCount(0);//resets the count to zero for another query

			System.out.println("Enter (Y/y) to make another query? ");

			quit = keyboard.next();

		}while (quit.equals("y") || quit.equals("Y"));
		
		System.out.println("Bye!");
	}
}