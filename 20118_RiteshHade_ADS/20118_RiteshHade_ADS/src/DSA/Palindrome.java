package DSA;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		
		int temp=num;
		int digit=-0,reverse=0;
		while(num>0)
		{
			digit=num%10;
			reverse=reverse*10+digit;
			num/=10;
		}
		System.out.println("Reverse: "+reverse);
		if(temp==reverse)
		{
			System.out.println("Given Number is Palindrome");
		}
		else
		{
			System.out.println("Given Number is not an Palindrome..");
		}
		sc.close();
	}

}
