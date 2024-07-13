package DSA;
import java.util.*;
public class HappyNumber {

	public static int getSum(int num) 
	{
		int sum=0;
		while(num!=0)
		{
			int digit=num%10;
			sum+=digit*digit;
			num/=10;
		}
		return sum;
	}
	
	public static boolean isHappy(int num)
	{
		int slow,fast;
		slow=fast=num;
		do {
			slow=getSum(slow);
			fast=getSum(getSum(fast));
		}while(slow!=fast);
		return (slow==1);
	}
	
	public static void printHappyNumbers(int l,int r)
	{
		System.out.println("Happy Numbers in above range are: ");
		for(int i=l;i<=r;i++)
		{
			if(isHappy(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lower and upper limit of range: ");
		int l=sc.nextInt();
		int r=sc.nextInt();
		printHappyNumbers(l,r);
	}
} 
