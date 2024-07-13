package DSA;
import java.util.*;
public class Fibonacci
{
	static int num1 =0,num2=1,num3=2;
	
	public static void fib(int num)
	{
		if(num>0)
		{
			num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.println(num3+" ");
			fib(num-1);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print the series: ");
		int num =sc.nextInt();
		System.out.println("Fibonacci Series: ");
		System.out.println("0 1");
		fib(num-2);
		System.out.println();
		System.out.println(num+" fibonacci number is "+num3);
		sc.close();
	}
}

