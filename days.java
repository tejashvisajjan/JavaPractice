/*
 Write a program to print week days on counting of 1 to 7 like when user enter 1 it prints monday
   using else if as well as Switch.
 */


import java.util.*;

public class days {
    public static void main(String [] args){
        System.out.print("Enter the number for displaying day name: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num == 1){
            System.out.println("Monday");

        }
        else if (num==2)
        {
            System.out.println("Tuesday");  
        }
        else if (num==3)
        {
            System.out.println("Wednesday");  
        }
        else if (num==4)
        {
            System.out.println("Thursday");  
        }
        else if (num==5)
        {
            System.out.println("friday");  
        }
        else if (num==6)
        {
            System.out.println("Saturday");  
        }
        else if (num==7)
        {
            System.out.println("Sunday");  
        }
        else 
        {
            System.out.println("invalid input");  
        }

    }
    
}
