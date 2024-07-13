package DSA;
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num1,num2;
		System.out.println("Enter the two values to check Anagram: ");
		num1=sc.next();
		num2=sc.next();
		num1=num1.toLowerCase();
		num2=num2.toLowerCase();
		
		char[] arr1=num1.toCharArray();
		char [] arr2=num2.toCharArray();
		
		if(arr1.length==arr2.length)
		{
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if(Arrays.equals(arr1, arr2))
					{
						System.out.println("Given number is an Anagram..");
					}
			else
			{
				System.out.println("Given number is not an anagram...");
			}
		}
		sc.close();
	}
}
