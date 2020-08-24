import java.util.*;
class Armstrong
{
	 public static void main(String args[])
	 {
		 Scanner s=new Scanner(System.in);
		 int n,r,x,sum;
		 System.out.println("Enter the number");
		 n=s.nextInt();
		 x=n;
		 sum=0;
		 while(n!=0)
		 {
			r=n%10;
            sum=sum+(r*r*r);
            n=n/10;			
		 }
		 if(sum==x)
		 { System.out.println(" The number is an Armstrong");}
		 else
		 {
			 System.out.println("Not Armstrong number");
		 }
	 }
}