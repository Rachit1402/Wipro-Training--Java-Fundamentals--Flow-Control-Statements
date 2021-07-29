
public class PrimeNumber10and99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String prime=" ";
		for(int i=10;i<100;i++)
		{
			int counter=0;
			for(int j=i;j>1;j--)
			{
				if (i%j==0)
				{
					counter=counter+1;
				}
				}
			if(counter == 1)
			{
				prime=prime + i+"  ";
			}
		}
		System.out.println("Prime numbers between 10 and 99 are: ");
		System.out.println(prime);

	}

}
