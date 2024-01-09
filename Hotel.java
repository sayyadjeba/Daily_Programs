import java.util.*;

class MyHotel {

	public static void main(String[] args) {
		
		int choice,ch;
		char ans;
		double total =0;
		int q=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Taj Hotel");
		do
		{
	System.out.println("1:Starters\n2:Main Course\n3:Deserts\n4:Drink");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
	System.out.println("Starters:");
System.out.println("1:kabab       RS-50\n");
	System.out.println("2:paneer chilli    RS-80");
	System.out.println("3:cutlets RS-100");

			ch=sc.nextInt();
					
		switch(ch) {
					case 1:
						total+=50;
                    q=q+1;
						break;
					case 2:
						total+=80;
                    q=q+1;
						break;
					case 3:
					total+=100;
                      q=q+1;
					}
				break;
				
			
				
			case 2:
				System.out.println("Main course:");
				System.out.println("1:Biryani     RS-300");
				System.out.println("2:Tahari   RS-250");
				System.out.println("3:Pulao        RS-150");
	
				ch=sc.nextInt();
				
				switch(ch) {
				case 1:
					total+=300;
                   q=q+1;
					break;
					
				case 2:
					total+=250;
                  q=q+1;
					break;
					
				case 3:
					total+=200;
                     q=q+1;
					break;
				
					
				}
			break;
			case 3:
				System.out.println("Deserts:");
				System.out.println("1:vanilla   RS-50");
				System.out.println("2: ButterscotchRS-40");
				System.out.println("3: ChocolateRS-80");
				
				ch=sc.nextInt();
				
				switch(ch) {
				case 1:
					total+=50;
                  q=q+1;
					break;
					
				case 2:
					total+=40;
                    q=q+1;
					break;
					
				case 3:
					total+=80;
                   q=q+1;
					break;
					

					
				}
			break;
			case 4:
				System.out.println("Drinks:");
				System.out.println("1:cola   RS-100");
				System.out.println("2:soda   RS-30");
				System.out.println("3:Juice     RS-80");
				
				ch=sc.nextInt();
				
				switch(ch) {
				case 1:
					total+=100;
                   q=q+1;
					break;
					
				case 2:
					total+=30;
                 q=q+1;
					break;
					
				case 3:
					total+=80;
                   q=q+1;
					break;
			
					
				}
			break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			
			System.out.println("Do you want to add any other item Y/N");
			ans=sc.next().charAt(0);
		}
		while(ans=='Y'||ans=='y');

		
		System.out.println(" *** Bill***\n");
		System.out.println("The Quantity of item is:\n"+q);
		System.out.println("Total amount="+total);
		System.out.println("#######Thanks for coming#######\n#######Visit again #######");
	}

      }
