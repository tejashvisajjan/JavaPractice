/*addition, subtraction, multiplication, division of two numbers and also square and square root of a number given by user*/


import java.util.*;
//import java.lang.Math;

public class cal {
public static void main(String [] args) {
   float a,b, sum, sub, mul, sq, div;
   System.out.print("Enter the first number:" );
   Scanner sc = new Scanner (System.in);
   a=sc.nextInt();
   System.out.print("Enter the second number:" );
   b=sc.nextInt();
   sum = a+b;
   System.out.println("Sum of your numbers :"+sum );
   sub = a-b;
   System.out.println("Substraction of your numbers :" + sub );
   mul = a*b;
   System.out.println("Multiplication of your numbers :" + mul );
   div = a/b;
   System.out.println("division of your numbers :" + div );
   sq = a*a;
   float sq2 = b*b;
   System.out.println("Square of "  + a + " is "+ sq + " and Square of " + b + " is " + sq2 );
   double sqroot = (Math.sqrt(a));
   double sqroot2 = (Math.sqrt(b));
   System.out.println("Square root of "  + a + " is "+ sqroot + " and Square root of " + b + " is " + sqroot2 );


}
}
    

