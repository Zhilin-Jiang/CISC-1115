import java.util.Scanner;
import java.io.*;
public class calculator {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char choice;//choose a method
		int num1 = 0,num2 = 0;
		Scanner keyboard = new Scanner(System.in);
		PrintWriter outFile = new PrintWriter("outputFile.txt");
		do {
			menu();
			System.out.print("Make a choice:");
		    choice = keyboard.next().charAt(0);
		    switch(choice) {
		    case'q':
		    case'Q':
		    	System.out.print("completed");//q stands for quit
		    	break;
		    case'+':
		    	System.out.print("Enter 1st number:");
		    	num1 = keyboard.nextInt();
		    	System.out.print("Enter 2nd number:");
		    	num2 = keyboard.nextInt();
		    	add(num1,num2,outFile);
		    	break;
		    case'-':
		    	System.out.print("Enter 1st number:");
		    	num1 = keyboard.nextInt();
		    	System.out.print("Enter 2nd number:");
		    	num2 = keyboard.nextInt();
		    	sub(num1,num2,outFile);
		    	break;
		    case'*':
		    	System.out.print("Enter 1st number:");
		    	num1 = keyboard.nextInt();
		    	System.out.print("Enter 2nd number:");
		    	num2 = keyboard.nextInt();
		    	mul(num1,num2,outFile);
		    	break;
		    case'/':
		    	System.out.print("Enter 1st number:");
		    	num1 = keyboard.nextInt();
		    	System.out.print("Enter 2nd number:");
		    	num2 = keyboard.nextInt();
		    	div(num1,num2,outFile);
		    	break;
		    case'%':
		    	System.out.print("Enter 1st number:");
		    	num1 = keyboard.nextInt();
		    	System.out.print("Enter 2nd number:");
		    	num2 = keyboard.nextInt();
		    	mod(num1,num2,outFile);
		    	break;
		    case'A'://find the average of 2 numbers
		    case'a':
		    	System.out.print("Enter 1st number:");
		    	num1 = keyboard.nextInt();
		    	System.out.print("Enter 2nd number:");
		    	num2 = keyboard.nextInt();
		    	avg(num1,num2,outFile);
		    	break;
		    case'X'://find the max of 2 numbers
		    case'x':
		    	System.out.print("Enter 1st number:");
		    	num1 = keyboard.nextInt();
		    	System.out.print("Enter 2nd number:");
		    	num2 = keyboard.nextInt();
		    	max(num1,num2,outFile);
		    	break;
		    case'M'://find the min of 2 numbers
		    case'm':
		    	System.out.print("Enter 1st number:");
		    	num1 = keyboard.nextInt();
		    	System.out.print("Enter 2nd number:");
		    	num2 = keyboard.nextInt();
		    	min(num1,num2,outFile);
		    	break;
		    case'S'://find the square of a number
		    case's':
		    	System.out.print("Enter a number:");
		    	num1 = keyboard.nextInt();
		    	square(num1,outFile);
		    	break;
		    default:
		    	System.out.println("Error, you made a wrong choice");
		    	outFile.println("Error, wrong choice");
		    	break;
		    }
		}while(choice != 'Q' && choice != 'q');

		outFile.flush();
		keyboard.close();
		outFile.close();
	}	
	public static void menu()
	{
		System.out.println("\t\tCalculator\n");
		System.out.println("+, -, *, /, or %\t representing the "
				+ "usual arithmetic operators");
		System.out.println("A\t\t\t representing the average of two numbers");
		System.out.println("X\t\t\t representing the maximum of two numbers");
		System.out.println("M\t\t\t representing the minimum of two numbers");
		System.out.println("S\t\t\t representing the square of a number");
		System.out.println("Q\t\t\t indicating the user wants to quit the program\n");
	}
	public static void add(int a, int b, PrintWriter outputFile)
	{
		int add = a + b;
		outputFile.println("Operation: addition");
		outputFile.println("Num 1:" + a);
		outputFile.println("Num 2:" + b);
		outputFile.println("Answer:" + add);
		outputFile.println();
	}
	public static void sub(int a, int b, PrintWriter outputFile)
	{
		int sub = a - b;
		outputFile.println("Operation: subtraction");
		outputFile.println("Num 1:" + a);
		outputFile.println("Num 2:" + b);
		outputFile.println("Answer:" + sub);
		outputFile.println();
	}
	public static void mul(int a, int b, PrintWriter outputFile)
	{
		int mul = a * b;
		outputFile.println("Operation: multiplication");
		outputFile.println("Num 1:" + a);
		outputFile.println("Num 2:" + b);
		outputFile.println("Answer:" + mul);
		outputFile.println();
	}
	public static void div(int a, int b, PrintWriter outputFile)
	{
		int div = a / b;
		outputFile.println("Operation: division");
		outputFile.println("Num 1:" + a);
		outputFile.println("Num 2:" + b);
		outputFile.println("Answer:" + div);
		outputFile.println();
	}
	public static void mod(int a, int b, PrintWriter outputFile)
	{
		int mod = a % b;
		outputFile.println("Operation: modulo");
		outputFile.println("Num 1:" + a);
		outputFile.println("Num 2:" + b);
		outputFile.println("Answer:" + mod);
		outputFile.println();
	}
	public static void avg(int a, int b, PrintWriter outputFile)
	{
		int avg = (a+b)/2;
		outputFile.println("Operation: average");
		outputFile.println("Num 1:" + a);
		outputFile.println("Num 2:" + b);
		outputFile.println("Answer:" + avg);
		outputFile.println();
	}
	public static void max(int a, int b, PrintWriter outputFile)
	{
		int max;
		if(a>b)
			max = a;
		else
			max = b;
		outputFile.println("Operation: maximum");
		outputFile.println("Num 1:" + a);
		outputFile.println("Num 2:" + b);
		outputFile.println("Answer:" + max);
		outputFile.println();
	}
	public static void min(int a, int b, PrintWriter outputFile)
	{
		int min;
		if(a<b)
			min = a;
		else
			min = b;
		outputFile.println("Operation: minimum");
		outputFile.println("Num 1:" + a);
		outputFile.println("Num 2:" + b);
		outputFile.println("Answer:" + min);
		outputFile.println();
	}
	public static void square(int a, PrintWriter outputFile)
	{
		int square = a * a;
		outputFile.println("Operation: square");
		outputFile.println("Num 1:" + a);
		outputFile.println("Answer:" + square);
		outputFile.println();
	}
}
