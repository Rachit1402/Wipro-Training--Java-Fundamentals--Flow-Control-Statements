import java.util.*;
public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int sum;
		for(sum=0;number!=0;number = number/10)
		{
			sum = sum+number%10;
		}
		System.out.println(sum);

	}

}
