package DSA;
import java.util.*;
public class WordChain
{
	private static String[] words;
	private static boolean[] visited;
	private static String[] result;
	public static void main(String[] args)
		{
			Scanner scanner = new Scanner(System.in);
			int N = scanner.nextInt();
			words = new String[N];
			visited = new boolean[N];
			result = new String[N];
			for (int i = 0; i < N; i++)
			{
				words[i] = scanner.next();
			}
			result[0] = words[0];
			visited[0] = true;
			if (findChain(1))
			{
				for (String word : result)
				{
					System.out.println(word);
				}
			} 
			else
			{
				System.out.println("IMPOSSIBLE");
			}
		}
	private static boolean findChain(int index) 
	{
		if (index == words.length)
		{
			return true;
		}
		for (int i = 0; i < words.length; i++)
		{
			if (!visited[i] && overlap(result[index - 1], words[i])) 
			{
				result[index] = words[i];
				visited[i] = true;
				if (findChain(index + 1)) 
				{
					return true;
				}
				visited[i] = false;
			}
		}
		return false;
	}
	private static boolean overlap(String a, String b) 
	{
		int len = Math.min(a.length(), b.length());
		for (int i = 3; i <= len; i++) 
		{
			if (a.substring(a.length() - i).equals(b.substring(0, i)))
			{
				return true;
			}
		}
		return false;
	}
}
