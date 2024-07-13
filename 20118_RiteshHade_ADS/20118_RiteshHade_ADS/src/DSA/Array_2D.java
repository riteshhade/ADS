package DSA;
import java.util.*;
public class Array_2D {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the row: ");
		int r = sc.nextInt();
		System.out.println("Enter the column: ");
		int c=sc.nextInt();
		
		int [][] arr = new int[r][c];
		System.out.println("Enter the array values: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println(" 2D Array: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
