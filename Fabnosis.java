import java util.*;
public class Fabno
{
public static void main(String args[]);
{
System.out.println("Enter the number of terms in the Fibonacci series:");
        	Scanner sc=new Scanner(System.in);
int num3 = sc.nextInt();
        	int n1 = 0, n2 = 1, n31;
            System.out.print("Fibonacci Series: ");
            for (int i = 1; i <= num3; i++) {
                System.out.print(n1 + " ");
                n31 = n1 + n2;
                n1 = n2;
                n2 = n31;
            }
            System.out.println();
}
}
