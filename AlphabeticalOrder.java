import java.util.*;
public class AlphabeticalOrder {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		char x = s.next().charAt(0) ;
		char y = s.next().charAt(0);
		
		if (x < y) {
			System.out.println(x + ", " + y);
		} else {
			System.out.println(y + ", " + x);
			}
	}
}
