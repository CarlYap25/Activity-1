import java.io.*;

public class yap
{
	public static void main(String... args)throws IOException
	{
		BufferedReader me = new BufferedReader(new InputStreamReader(System.in));
		
		int sum,diff,prod,quo;
		
		int x,y;
		
		System.out.println("Enter First Number: ");
		x = Integer.parseInt(me.readLine());
		System.out.println("Enter First Number: ");
		y = Integer.parseInt(me.readLine());
		
		sum  = x + y;
		diff = x - y;
		prod = x * y;
		quo  = x / y;
		
		System.out.println("The sum is: " + sum);
		System.out.println("The diff is: " + diff);
		System.out.println("The prod is: " + prod);
		System.out.println("The quo is: " + quo);
		
		
	}	
}