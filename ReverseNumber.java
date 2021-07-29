import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int t = 0;
		while(number!=0)
		{
			t=number%10;
			System.out.print(t);
			number=number/10;
		}
	}

}
