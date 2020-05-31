import java.util.Scanner;

public class Demonstration {

	public static void main(String[] args) {
		
		Calculator cal = null;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		System.out.println("1 - Addition");
		System.out.println("2 - Subtraction");
		System.out.println("3 - Multiplication");
		System.out.println("4 - Division");
		System.out.println("Enter your choice:");
		int choice=scanner.nextInt();
		switch(choice)
		{
		case 1: 
			{
				cal=new Addition();
				break;
			}
		case 2: 
			{
				cal=new Subtraction();
				break;
			}
		case 3: 
			{
				cal=new Multiplication();
				break;
			}
		case 4: 
			{
				cal=new Division();
				break;
			}
		default :
			{
				System.out.println("Invalid Operation");
			}
		}
		if(cal!=null)
		System.out.println("Answer is : "+cal.calculate(a,b));
	}

}
