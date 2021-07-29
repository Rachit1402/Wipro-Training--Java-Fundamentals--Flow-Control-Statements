import java.util.Scanner;
public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int x= sc.nextInt();
		if(x == 0)
		{
			System.out.println("The user entered Zero");
		}
		else if (x >0)
		{
			System.out.println("The user entered a Positive number");
		}
		else {
			System.out.println("The user entered a Negative number");
		}
	}

}
