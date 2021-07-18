/*Sravani Birudukota
 Programming fundamentals
 Summer
 Programming Assignment lab 2
 Exercise #5
*/


import java.util.Random;

public class FloatEqu {
	
 public static void main(String[] args) {
	 
 double first = (1.0/10) * (1.0/10);
 double second = (1.0/100);

 System.out.println("first :" + first);
 System.out.println("second :" + second);
 if (first == second) 
 {
   System.out.println("EQUAL");
 }
 else
 {
   System.out.println("NOT EQUAL");
 }
 double diff = Math.abs(first - second);        
 double tolerance =  0.000001;
 if(diff < tolerance)
 {
	 System.out.println("approximately equal");
 }
 
 }
}
