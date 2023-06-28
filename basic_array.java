/*
 Write a program to insert in an array of size 10 and display the elements of the array.
 */
import java.util.*;

public class basic_array {
    public static void main (String[]args){
        System.out.print("enter the number of elements in array: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr = new int[n];
        System.out.print("enter the elements in array: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();  }

        System.out.print("elements of array: ");
        for ( int i =0;i<n;i++){ 
        
        System.out.print (arr[i] + " ");}
    }
}
