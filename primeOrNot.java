package Task;
import java.util.Scanner;
public class primeOrNot {
       public static void main(String args[])
	   {		
		int temp;
		boolean isPrime=true;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number-");
		
		int n=sc.nextInt();
	        sc.close();
		for(int i=2;i<=n/2;i++)
		{
	           temp=n%i;
		   if(temp==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
		
		if(isPrime)
		   System.out.println(n + " is PRIME");
		else
		   System.out.println(n + " is NOT A PRIME");
	   }
	}