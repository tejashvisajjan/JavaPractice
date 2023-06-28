/*
 
1 1 1 1 1 1
3 3 3 3 3
5 5 5 5
7 7 7
9 9
11
 */



public class pattern6 {
    public static void main(String []args){
        int i,j,k=1;
        for(i=1;i<=6;i++){
            for (j=6;j>=i;j--){
                System.out.print(k+ " ");
            }
            k+=2;
             
            System.out.println();
        }
    

    }
    
}
