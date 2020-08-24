import java.util.Scanner;
class Swap
{
public static void main(String args[])
{
	int a,b,temp;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the value of A ");
	a=s.nextInt();
	System.out.println("Enter the value of B ");
	b=s.nextInt();
	System.out.println("Before Swapping\na="+a+"\nb="+b);
	temp=a;
	a=b;
	b=temp;
	System.out.println("After Swapping \na="+a+"\nb="+b);
	
}
}