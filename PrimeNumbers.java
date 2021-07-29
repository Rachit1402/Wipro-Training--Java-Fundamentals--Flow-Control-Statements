import java.util.*;
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int number= scan.nextInt();
		int flag=0;
		if (number==0)
		{
			System.out.println("Number entered is 0 and hence cannot be identified");
		}
		else if(number==1)
		{
			System.out.println("Number entered is neither prime nor composite");
		}
		else
		{
			for(int i=2;i<number;i++)
			{
				if(number%i==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("Number entered is a  Prime number");
			}
			else {
				System.out.println("Number entered is not a prime number");
			}
		}
	}

}
