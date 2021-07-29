import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int rev=number;
		int t=0,c=0;
		while(rev!=0)
		{
			t=rev%10;
			c=c*10+t;
			rev=rev/10;
		}
		if(number==c)
		{
			System.out.println(number + " is a palidrome");
		}
		else {
			System.out.println(number + " is not a palindrome");
		}
	}
}