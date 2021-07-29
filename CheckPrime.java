import java.util.*;
public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		if(args.length == 0)
		{
			System.out.println("Please enter an integer number");
		}
		else if(n ==0 || n==1)
		{
			System.out.println(n + " is neither prime nor composite number");
		}
		else
		{
			int flag=0;
			for (int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(n + " is a prime number");
			}
			else {
				System.out.println(n+ " is a composite number");
			}
		}
	}
}