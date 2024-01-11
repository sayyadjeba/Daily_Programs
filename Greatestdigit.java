import java.util.*;
class greatest
  {
    public static void main(String args[]);
    {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the five numbers");
				numb1=sc.nextInt();
				numb2=sc.nextInt();
				numb3=sc.nextInt();
				numb4=sc.nextInt();
				numb5=sc.nextInt();
				if(numb1>numb2 && numb1>numb3 && numb1>numb4 && numb1>numb5)
					{
					System.out.println("Number one is greater");
					}
				else if(numb2>numb1 && numb2>numb3 && numb2>numb4 && numb2>numb5)
				{
				System.out.println("Number two is greater");
				}
				else if(numb3>numb1 && numb3>numb2 && numb3>numb4 && numb3>numb5)
				{
				System.out.println("Number three is greater");
				}
				else if(numb4>numb1 && numb4>numb2 && numb4>numb3 && numb4>5)
				{
				System.out.println("Number four is greater");
				}
				else if(numb5>numb1 && numb5>numb2 && numb5>numb3 && numb5>numb4)
				{
				System.out.println("Number four is greater");
				}
				else
				{
					System.out.println("Invalid Input");
				}
    }
  }
