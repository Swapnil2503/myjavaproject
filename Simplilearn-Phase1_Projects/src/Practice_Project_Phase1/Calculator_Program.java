package Practice_Project_Phase1;
import java.util.Scanner;
public class Calculator_Program 
{
    public static void main(String[] args) 
    {
		int choice;
		double result;
		
		// Creating an Scanner class
		Scanner sc = new Scanner(System.in);
        
		// Ask users to enter the Choice
		System.out.println("Enter your Choice:");
		System.out.println("1: Addition");
		System.out.println("2: Subtraction");
		System.out.println("3: Multiplication");
		System.out.println("4: Division");
        choice = sc.nextInt();
        
        // ask users to enter numbers
		System.out.println("Enter your first number");
		double a = sc.nextDouble();
        System.out.println("Enter your second number");
		double b = sc.nextDouble();
		
        switch (choice) 
        {
        // Performs Addition between two numbers
		case 1:
			result = a + b;
			System.out.println("Addition of two numbers is: " + result);
			break;
        // Performs subtraction between two numbers
		case 2:
			result = a - b;
			System.out.println("Subtraction of two numbers is: " + result);
			break;
        // Performs Multiplication between two numbers
		case 3:
			result = a * b;
			System.out.println("Multiplication of two numbers is: " + result);
			break;
        // Performs Division between two numbers
		case 4:
			result = a / b;
			System.out.println("Division of two numbers is: " + result);
			break;
        default:
			System.out.println("Invalid Operator");
			break; 
			}
        
		sc.close();
	}
    
  }

