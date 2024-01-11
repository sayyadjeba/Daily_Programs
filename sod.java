
import java.util.Scanner;  
public class SOD
{  
int sum=0;  
int sum(int no)  
{  
if(no != 0)  
{ 
sum = sum + no % 10;  
no = no / 10;  
sum(no);  
}  
return sum;  
}  
public static void main(String args[])  
{  
int no;  
SOD sod = new SOD();  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter a number: ");  
no=sc.nextInt();  
System.out.println("The sum of digits: "+sod.sum(no));  
}  
}