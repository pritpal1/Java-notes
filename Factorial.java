import java.util.Scanner;
class Factorial
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		int n,i,fact=1;
		System.out.println("Enter the Number");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("Factorial of"+n+"is="+fact);
			
	}
}