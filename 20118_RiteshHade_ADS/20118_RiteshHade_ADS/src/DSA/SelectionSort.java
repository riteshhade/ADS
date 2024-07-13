package DSA;

public class SelectionSort 
{
	void sort(int a[])
	{
		int n = a.length;
		
		for(int i=0;i<n-1;i++)
		{
			int min_element=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[min_element])
				{
					min_element=j;
				}
			}
			int temp=a[min_element];
			a[min_element]=a[i];
			a[i]=temp;
		}
		
	}
	
	void print(int a[]) {
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		SelectionSort ss = new SelectionSort();
		
		int a[]= {64,25,7,89,20};
		
		ss.sort(a);
		
		System.out.println("Sorted Array");
		
		ss.print(a);
	}
}
