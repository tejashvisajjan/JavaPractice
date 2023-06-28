import java.util.*;
public class prime {
    public static void main(String Args []){
    System.out.println("Enter the number");
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    if(n/n==0 && n%1==0){
        System.out.println("prime");

    }
    else{
        System.out.println("not prime");
    }
    
}
}
