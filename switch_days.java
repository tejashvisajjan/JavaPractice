/*
 Write a program to print week days on counting of 1 to 7 like when user enter 1 it prints monday
   using else if as well as Switch.
 */

import java.util.*; 

public class switch_days {
    public static void main(String[]args){
        System.out.print("Enter the number of days that you want to print: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = n;
        switch (num){
            case 1: System.out.print("Monday");
            break;
            case 2: System.out.print("Tuesday");
            break;
            case 3: System.out.print("Wednesday");
            break;
            case 4: System.out.print("Thursday");
            break;
            case 5: System.out.print("Friday");
            break;
            case 6: System.out.print("Saturday");
            break;
            case 7: System.out.print("Sunday");
            break;
            default: System.out.print("Invalid input");

        }
        
    }
    
}
