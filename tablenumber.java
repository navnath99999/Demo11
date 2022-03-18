package dac;
import java.util.Scanner ;

public class tablenumber 
{

	public static void main(String[] args)
	{
		int number ;
		int i ;
		int num;
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		number = s.nextInt();
		
		for(i=1;i<=10;i++)
		{
		 num= (i*number) ;
		 System.out.println("  " +num );
		}
        
	}

}
