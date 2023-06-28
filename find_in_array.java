/*
   Write a program to find a number in the array inserted by user,
   like 1,5,36,7,5,6,4,2 is the array inserted by user and user again insert a number 5 
   print the index number where the number located 
 */

import java.util.*;

public class find_in_array {

    public static void main(String[]args){
        System.out.print("enter the number of element you want to insert in array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] ar = new int [n];
        System.out.print("Enter the elements in array: ");
        for (int i= 0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        System.out.print("Elements in array are: ");
        for(int i=0; i<n;i++){
            System.out.print(ar[i]+" ");
            
        }
        System.out.println();
        System.out.println("enter the element that you want to search in array: ");  
        int a = sc.nextInt();
        int index =-1;
       for (int i=0;i<ar.length;i++)
        {
            if (ar[i]==a){
                index=i;
                System.out.println("Index position of"+a+ " is: " + index);
                break;
            }
            
       }
       
       if(index == -1)
            System.out.println("not found");
        

       

    }
    
}
