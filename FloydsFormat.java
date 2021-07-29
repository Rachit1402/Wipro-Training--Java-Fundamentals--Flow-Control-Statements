import java.util.*;
public class FloydsFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner Scan = new Scanner(System.in);
		int n = Scan.nextInt();
		if(args.length ==0)
		{
			System.out.println("Please enter an integer number");
		}
		for(int i=0;i<=n;i++)
		{
			for (int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
