
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("enter number");
        int n = sc.nextInt();
       
        if(n == 1) {
            System.out.println("NO");
            return;
        }
        
        for(int i=2;i<n;i++) {
            if(n % i == 0) {
                System.out.println("number is not prime");
                return;
            }
        }
        
        System.out.println("number is prime");
    }
}
