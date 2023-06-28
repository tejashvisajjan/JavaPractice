/*
Write a program to print your first name and last name together. Input from user first name and last name seperately.
example: 
input
Enter first name: Ganesh
Enter last name: Rai

Your name: Ganesh Rai
 */


import java.util.*;

public class basic_String {
    public static void main(String [] args){
        System.out.print ("Enter first name: ");
        Scanner sc= new Scanner(System.in);
        String fName = sc.nextLine();
        System.out.print ("Enter last name: ");
        String lName = sc.nextLine();
        System.out.print ("Your name: " + fName+" "+lName);
    }
}
