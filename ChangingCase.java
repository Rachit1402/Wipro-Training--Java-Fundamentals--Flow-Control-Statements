import java.util.*;
public class ChangingCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		char x= scan.next().charAt(0);
		if (x>='a' && x<='z')
		{
			temp = (int)(x);
			x = (char)(temp-32);
			System.out.println(x);
		}
		else
		{
			temp =(int)(x);
			x = (char)(temp+32);
			System.out.println(x);
		}
	}

}
