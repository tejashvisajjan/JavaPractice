/*You are given a number N. You need to print the pattern for the given value of N.

For N = 2 the pattern will be 
2 2 1 1
2 1

For N = 3 the pattern will be 
3 3 3 2 2 2 1 1 1
3 3 2 2 1 1
3 2 1
*/

import java.util.*;
public class pattern7 {
    public static void main (String[]args){
    int N, i, k=1,j;
    System.out.print("Enter the value of  N: ");
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();

    for(i=1;i<=N;i++){
        for (j=N;j>=i;j--){
            System.out.print(j+" ");
        }
           //j+=2;
        
    }
    
    }
}
