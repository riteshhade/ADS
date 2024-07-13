package DSA;

public class QuickSort 
{
	int partition(int array[],int low,int high)
	{
		int pivot =array[high];
		int i=(low-1);
		for(int j=low;j<high;j++)
		{
			if(array[j]<pivot)
			{
				i++;
				int temp=array[i+1];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		
		int temp =array[i+1];
		array[i+1]=array[high];
		array[high]=temp;
		return i+1;
		
	}
	
	void quickSort(int array[],int low,int high)
	{
		if(low<high)
		{
			int pi=partition(array,low,high);
			quickSort(array,low,pi-1);
			quickSort(array,pi+1,high);
			
			
		}
	}
	
	void printArray(int array[])
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		QuickSort qs = new QuickSort();
		int array[]= {10,65,7,43,8,9};
		int n =array.length;
		qs.quickSort(array, 0, n-1);
		System.out.println("Sorted Array");
		qs.printArray(array);
	}
}
