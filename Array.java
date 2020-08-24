import java.util.*;
class Array
{
 public static void main(String[]args)
 {
	 int a[]=new int[5];
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter 5 integer of array");
	 for(int i=0;i<5;i++)
	 {
	 a[i]=s.nextInt();
	 }
	 System.out.println("You have entered");
	 for(int i=0;i<5;i++)
	 {
		 System.out.println(a[i]);
	 }
 }
}