/*Sravani Birudukota
 Programming fundamentals
 Summer
 Programming Assignment lab 2
 Exercise #2
*/


import java.util.Scanner;
public class DistCalc {
 public static void main(String[] args) {
 float x1,x2,y1,y2;
 float dist = 0;
 Scanner sc = new Scanner(System.in);
 
 System.out.println("Enter x1 and y1 values :");
 x1 = sc.nextFloat();
 y1 = sc.nextFloat();
 
 System.out.println ("Enter x2 and y2 values :");
 x2 = sc.nextFloat();
 y2 = sc.nextFloat();

 dist = (float)Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
 
 System.out.println("Distance = " + dist);
 }
}
