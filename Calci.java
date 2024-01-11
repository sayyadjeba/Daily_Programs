import java.util.*;
class calci
{
public static void main(String args[]);
{
Scanner sc=new Scanner(System.in);
System.out.println("Choose an operation:");
		           System.out.println("1: Addition");
		           System.out.println("2: Subtraction");
		           System.out.println("3: Multiplication");
		           System.out.println("4: Division");

		           int ch = sc.nextInt();

		           System.out.print("Enter the first number: ");
		           double num7 = sc.nextDouble();

		           System.out.print("Enter the second number: ");
		           double num8 = sc.nextDouble();

		           double result = 0;

		           switch (ch) {
		               case 1:
		                   result = num7 + num8;
		                   System.out.println("Result: " + result);
		                   break;
		               case 2:
		                   result = num7 - num8;
		                   System.out.println("Result: " + result);
		                   break;
		               case 3:
		                   result = num7 * num8;
		                   System.out.println("Result: " + result);
		                   break;
		               case 4:
		                   if (num8 != 0) {
		                       result = num7 / num8;
		                       System.out.println("Result: " + result);
		                   } else {
		                       System.out.println("Cannot divide by zero.");
		                   }
		                   break;
		               default:
		                   System.out.println("Invalid choice.");
		           }
}
}
