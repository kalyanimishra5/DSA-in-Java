/* a a a a 
    b b b b 
    c c c c 
    d d d d         */
import java.util.Scanner;
public class pattern8 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j =1;j<=n;j++){
                System.out.print((char)(i+96)+" ");
            }
            System.out.println();
        }
    }
}
