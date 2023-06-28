/*
4 4 4 4
3 3 3
2 2 
1
*/
 

public class pattern3 {
    public static void main(String [] args){
        int i,j , k= 4;
        for (i=1;i<=4;i++){
            for (j=4;j>=i;j--)
            System.out.print(" "+k);
            k--;
            System.out.println();
        }
    }
}
