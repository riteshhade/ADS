package DSA;

import java.util.InputMismatchException;
import java.util.Scanner;
public class BubbleSort1 {

	void bubbleSort(int a[])
	{
		int n =a.length;
		boolean swapped;
		for(int i=0;i<n-1;i++)
		{
			swapped =false;
			
			for(int j=0;j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					swapped =true;
				}
			}
			
			if(!swapped)
			{
				break;
			}
		}
	}
	
	int binarySearch(int a[],int low,int high,int x)
	{
		if(high>=low)
		{
			int mid=(low+high)/2;
			
			if(a[mid]==x)
			{
				return mid;
			}
			
			if(a[mid]>x)
			{
				return binarySearch(a,low,mid-1,x);
			}
			return binarySearch(a,mid+1,high,x);
		}
		
		return -1;
		
	}
	
	void print(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		BubbleSort1 bs = new BubbleSort1();
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("Enter the number of elements in the array: ");
			int n =sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter the elements of array: ");
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println("enter the number to locate in the sorted array: ");
			int x =sc.nextInt();
			bs.bubbleSort(a);
			System.out.println("Sorted Array: ");
			bs.print(a);
			int result=bs.binarySearch(a, 0, n-1, x);
			if(result==-1)
			{
				System.out.println("Element is not present..");
				
			}
			else
			{
				System.out.println("Element is found at index "+result);
			}
			
		}catch(InputMismatchException e)
		{
			System.out.println("Invalid Input");
		}finally
		{
			sc.close();
		}
		
	}
	
	
}
