import java.util.*;
class EvenOdd
{
	 public static void main(String args[])
	 {
		 Scanner s=new Scanner(System.in);
		 int x;
		 System.out.println("Enter the value");
		 x=s.nextInt();
		 if(x%2==0)
		 {
			 System.out.println("The value is even");
		 }
		 else
		 {
			 System.out.println("The value is odd");
		 }
	 }
}