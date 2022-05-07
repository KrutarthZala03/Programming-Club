import java.util.Scanner;

public class Fibbonacci {

	public static void main (String args[])
	{
		
		int n;
		System.out.println("Enter starting number of fibbonacci series : ");
		Scanner kz = new Scanner(System.in);
		n = kz.nextInt();
		
		int t1=0 , t2=1, count = 1;
		
		for(int i = 1 ; i <= n + 5; i++)
		{
			if( t1 >= n && count <= 5) 
			{
				System.out.print(t1 + " ");
				count++;
			}
				int t3 = t1 + t2;
				t1 = t2;
				t2 = t3;
		}
		
		
	}
}
