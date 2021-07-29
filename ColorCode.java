import java.util.*;
public class ColorCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the color code: ");
		char a = scan.next().charAt(0);
		switch(a)
		{
		case 'R':
		{
			System.out.println("Red");
			break;
		}
		case 'B':
		{
			System.out.println("Blue");
			break;
		}
		case 'O':
		{
			System.out.println("Orange");
			break;
		}
		case 'Y':
		{
			System.out.println("Yellow");
			break;
		}
		case 'W':
		{
			System.out.println("White");
			break;
		}
		default:
		{
			System.out.println("Invalid Code");
			break;
		}
			
		}
		

	}

}
