package staticProjectPackage;

import java.util.Scanner;

public class firstClass {
	
	public static int add(int num1, int num2)
	{
		return num1 + num2;
	}
	
	public static int substraction(int num1, int num2)
	{
		return num1 - num2;
	}
	
	public static int multiplication(int num1, int num2)
	{
		return num1 * num2;
	}
	
	public static double division(double num1, double num2)
	{
		if(num2 == 0)
		{
			throw new IllegalArgumentException("cannot divide by 0 ");
		}
		return num1 / num2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter your first number : ");
		int input1 = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Please Enter your second number : ");
		int input2 = sc1.nextInt();
		
		System.out.println("\nHere is your answer");
		System.out.println("Addition is : " + firstClass.add(input1, input2));
		System.out.println("Substraction is : " + firstClass.substraction(input1, input2));
		System.out.println("Multiplication is : " + firstClass.multiplication(input1, input2));
		System.out.println("Division is : " + firstClass.division(input1, input2));
		}

}
