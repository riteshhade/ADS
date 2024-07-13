package DSA;
import java.util.*; 
public class TotalSubString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to find Total Number of sub-strings: ");
		String str=sc.next();
		System.out.println("Total Substring in the given string: "+countString(str));
		sc.close();

	}

	private static int countString(String str) {
		int count=0;
		int n =str.length();
		for(int i =0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(str.charAt(i)==str.charAt(j))
						{
							count++;
						}
			}
		}
		return count;
	}

}
