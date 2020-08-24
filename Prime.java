import java.util.*;
class Prime
{
	 public static void main(String args[])
	 {
		 Scanner s=new Scanner(System.in);
		 int n,i,status=0;
		 System.out.println("Enter the number");
		 n=s.nextInt();
		 for(i=2;i<=n/2;i++)
		 {
			 if(n%i==0)
			 {
				 status=1;
				 break;
			 }
		 }
		 if(status==0)
		 {
			 System.out.println("It is a Prime Number");
		 }
		 else
		 {
			  System.out.println("It is not a Prime Number");
		 }
	 }
}