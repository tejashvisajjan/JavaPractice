/*Write a program to print the fabonacci series between given range by user.*/

import java.util.*;


public class fabo_user {
    public static void main(String[]args){
        int a=0,b=1, c, m, n ,count ;
        System.out.println("enter first number  : ");
        Scanner sc = new Scanner (System.in);
        m=sc.nextInt();
        System.out.println("enter the second number : ");
        n=sc.nextInt();
       
      for (int i=a;i<=n;i=a){
       
          if (a>=m)
           System.out.println(a);
           
            c=a+b;
            a=b;
            b=c;
        }

    }
    }
    

