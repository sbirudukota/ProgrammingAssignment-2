/*Sravani Birudukota
 Programming fundamentals
 Summer
 Programming Assignment lab 2
 Exercise #1
*/



import java.util.Scanner; 
import java.util.Random;
public class AgeGuess {
	public static void main(String[] args) {
		
		    Scanner var = new Scanner(System.in);	
			int age;
			Random random = new Random();
			age = random.nextInt(10);
			String name;
			String ageGuess;
			System.out.println("Enter Your Name :");
			name = var.nextLine();
			System.out.println("Enter your Guess :"); 
			ageGuess = var.nextLine();
			System.out.println("Name : " + name );
			System.out.println("your Guess :" + ageGuess );
			System.out.println("The correct Guess : " + age);
			
		}
				
	}
	

