/*Sravani Birudukota
 Programming fundamentals
 Summer
 Programming Assignment lab 2
 Exercise #3
*/



import java.util.Random;
import java.util.Scanner;
public class UserNames {
 public static void main(String[] args) {
 
 String First_Name,Last_Name,Name;  
 int rand_num;
 
 Scanner un = new Scanner(System.in);   
 
 System.out.println("Enter First Name: ");  
 First_Name = un.next();  
 System.out.println("Enter Last Name: ");   
 Last_Name = un.next();    
 Random random = new Random();
 rand_num = random.nextInt(89) + 10;
 Name = First_Name.substring(0,1) + Last_Name.substring(0,4) + rand_num; 
 System.out.println("Your Name : "+ Name); 
 }  
 }
