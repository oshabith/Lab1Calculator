

import java.util.Scanner;

public class ArithmaticCalculator {

	public static void main(String[] args) {
		double x,y,result;
		String s1,s2;
		int choice = 0;
		Scanner scan = new Scanner(System.in);
		
		while(choice != 6)
		{
		System.out.println("--------- Arithmatic Calculator ---------");
		System.out.println("1 for Addotion");
		System.out.println("2 for Subtraction");
		System.out.println("3 for Multiplication");
		System.out.println("4 for Division");
		System.out.println("5 for Modulus");
		System.out.println("6 for Exit");
		System.out.println("Enter your choice:");
		
		choice = scan.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter first number: ");
			s1 = scan.next();
			x =Double.parseDouble(s1);
			System.out.println("Enter second number: ");
			s2 = scan.next();
			y = Double.parseDouble(s2);
			result = x + y;
			System.out.println("Result is: "+result);
			break;
			
		case 2:
			System.out.println("Enter first number: ");
			s1 = scan.next();
			x =Double.parseDouble(s1);
			System.out.println("Enter second number: ");
			s2 = scan.next();
			y = Double.parseDouble(s2);
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
			s1 = scan.next();
			x =Double.parseDouble(s1);
			System.out.println("Enter second number: ");
			s2 = scan.next();
			y = Double.parseDouble(s2);
			result = x * y;
			System.out.println("Result is: "+result);
			break;
			
		case 4:
			System.out.println("Enter first number: ");
			s1 = scan.next();
			x =Double.parseDouble(s1);
			System.out.println("Enter second number: ");
			s2 = scan.next();
			y = Double.parseDouble(s2);
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
			
		case 5:
			System.out.println("Enter first number: ");
			s1 = scan.next();
			x =Double.parseDouble(s1);
			System.out.println("Enter second number: ");
			s2 = scan.next();
			y = Double.parseDouble(s2);
		    System.out.println("Result is: "+x % y);
			break;
				
			
		}//end switch
		}//end while loop
	}

}
