/*Sravani Birudukota
 Programming fundamentals
 Summer
 Programming Assignment lab 2
 Exercise #4
*/



import java.util.Scanner; 
import java.util.Random;
public class AgeGuess2{
	public static void main(String[] args) {
		
		    Scanner sc = new Scanner(System.in);
			Random random = new Random();
			int age = random.nextInt(10);
			int ageGuess;
			System.out.println("Enter your Guess :"); 
			ageGuess = sc.nextInt();
			if (ageGuess == age) {
			    System.out.println("You Guess is Correct!");
			   }
			if(ageGuess != age)
			{
				System.out.println("You Guess is worng!");
				
				if(ageGuess < age )
				{
					System.out.println("Older");
				}
				else
				{
					System.out.println("younger");
				}
			}
		}
				
	}
	


