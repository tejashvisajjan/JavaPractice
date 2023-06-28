/*
Write a program to count the number of character present in the string, take input a string and also character you want to find.

Example:
input:
enter string: my name is Ganesh Kumar Rai
enter character: a

output:
4
*/
import java.util.*;

public class string {
    public static void main(String[]args){
       System.out.print("Enter String: ");
       Scanner sc = new Scanner(System.in);
       String lines = sc.nextLine();
       System.out.print ("your string is: "+ lines);
       System.out.println();
       System.out.print("total number of character: "+ lines.length());
       System.out.println();
       System.out.print("Enter the character that you want to search in String: ");
       String character = sc.nextLine();
       System.out.print("index of "+ lines.indexOf(character));
       int temp = 0;
        for (int i = 0;i<=lines.length();i++){
            //System.out.print()
            if (  ==character){
                temp++;
            }
            temp++;
        }

       System.out.println("Number of occurance of that character is:" + temp+"times");

       

    }
}
