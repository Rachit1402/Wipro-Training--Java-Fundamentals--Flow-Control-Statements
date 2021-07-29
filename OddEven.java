import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int x=sc.nextInt();
		if(x%2 ==0)
		{
			System.out.println("The user entered " +x + " which is an even number");
		}
		else
		{
			System.out.println("The user entered "+x + " which is an odd number" );
		}
	}

}
