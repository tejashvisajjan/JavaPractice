import java.util.*;

class odd {
    public static void main (String [] args){
int i; int n1; int n2;
System.out.println("Enter The Range");
Scanner sc = new Scanner (System.in );
n1=sc.nextInt();
n2=sc.nextInt(); 

if(n1<n2){
    System.out.println("The Odd Numbers in your range: ");
       for(i=n1;i<=n2;i++)    
	{
        if (i % 2 != 0)
	System.out.print(" "+i);
	}
    
}else{
    System.out.println("invalid input");
}

}

}