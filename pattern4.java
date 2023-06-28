/*    1
    2 3
  4 5 6
7 8 9 10
*/


public class pattern4 {
    public static void main(String[]args){
    int i, j, k=1;
    for (i=1; i<=4; i++)
    {
        for (j = 4; j > i ; j--){
        
            System.out.print("   ");
        }    
        for (k=1;k<=i ;k++){
        
            System.out.print(j+"  ");
            j++;
            
        }
        System.out.println();       
        
    }
    
    

}
}
