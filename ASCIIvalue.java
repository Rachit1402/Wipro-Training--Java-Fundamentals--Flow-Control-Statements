import java.util.*;
public class ASCIIvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		char x=scan.next().charAt(0);
		if( x>='a' && x<='z' || x>='A' && x<='Z')
		{
			System.out.println("Alphabet");
		}
		else if(x>='0' && x<='9')
		{
			System.out.println("Digits");
		}
		else
		{
			System.out.println("Special character");
		}
	}

}
