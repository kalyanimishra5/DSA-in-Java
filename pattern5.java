/*  a b c d e 
    a b c d e 
    a b c d e 
    a b c d e 
    a b c d e          */
import java.util.Scanner;
public class pattern5 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j =1;j<=n;j++){
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }
    }
}
