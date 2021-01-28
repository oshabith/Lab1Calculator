

import java.util.Scanner;

public class ArithmaticCalculator {

	public static void main(String[] args) {
		float x,y,result;
		int choice = 0;
		Scanner scan = new Scanner(System.in);
		
		while(choice != 5)
		{
		System.out.println("--------- Arithmatic Calculator ---------");
		System.out.println("1 for Addotion");
		System.out.println("2 for Subtraction");
		System.out.println("3 for Multiplication");
		System.out.println("4 for Division");
		System.out.println("5 for Exit");
		System.out.println("Enter your choice:");
		
		choice = scan.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter first number: ");
			x = scan.nextFloat();
			System.out.println("Enter second number: ");
			y = scan.nextFloat();
			result = x + y;
			System.out.println("Result is: "+result);
			break;
			
		case 2:
			System.out.println("Enter first number: ");
			x = scan.nextFloat();
			System.out.println("Enter second number: ");
			y = scan.nextFloat();
			if (x>y) {
				result = x - y;
			}
			else
			{
				result = y - x;
			}
			System.out.println("Result is: "+result);
			break;
			
		case 3:
			System.out.println("Enter first number: ");
			x = scan.nextFloat();
			System.out.println("Enter second number: ");
			y = scan.nextFloat();
			result = x * y;
			System.out.println("Result is: "+result);
			break;
			
		case 4:
			System.out.println("Enter first number: ");
			x = scan.nextFloat();
			System.out.println("Enter second number: ");
			y = scan.nextFloat();
			if(y == 0) {
				result = x / y;
				System.out.println("Cannot divide by zero");
				break;
			}
			else {
				result = x / y;
				System.out.println("Result is: "+result);
				System.out.println();
				break;
			}		
			
		}//end switch
		}//end while loop
	}

}
