package DSA;
import java.util.*;

public class LinearSearch {

	public static void main(String[] args) {
		int []arr= {10,20,45,66,89,24,78};
		System.out.println("Enter the number to search in the array: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean flag = false;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println(num+ " is present inside the array.");		
		}
		else
		{
			System.out.println(num+ " is not present inside the array.");
		}
		sc.close();
	}

}
