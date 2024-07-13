package DSA;
import java.util.*;
public class TowerOfHanoi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of disc: ");
		int n = sc.nextInt();
		towerOfHanoi(n,'A','B','C');
		
		sc.close();
	}

	private static void towerOfHanoi(int n, char src, char aux, char dest)
	{
		if(n==1)
		{
			System.out.println(src+" -> "+dest);
			return;
		}
		towerOfHanoi(n-1,src,dest,aux);
		towerOfHanoi(1,src,aux,dest);
		towerOfHanoi(n-1,aux,src,dest);
		
	}

}
