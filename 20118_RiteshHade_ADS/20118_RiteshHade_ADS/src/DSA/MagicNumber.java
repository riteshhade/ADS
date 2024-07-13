package DSA;
import java.util.*;
public class MagicNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		magicnum(num);
		sc.close();

	}

	private static void magicnum(int num) {
		int temp = num;
		int sum=0;
		while(num>0||sum>9)
		{
			if(num==0)
			{
				num=sum;
				sum=0;
			}
			else
			{
				sum+=num%10;
				num/=10;
			}
		}
		
		if(sum==1)
		{
			System.out.println("Number is an Magic Number..");
			
		}
		else
		{
			System.out.println("Number is not an Magic Number..");
		}
		
	}

}
