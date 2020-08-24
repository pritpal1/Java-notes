import java.util.Scanner;
class Add
{
public static void main(String args[])
{
	int a,b,c;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the value of A ");
	a=s.nextInt();
	System.out.println("Enter the value of B ");
	b=s.nextInt();
	c=a+b;
	System.out.println("The sum of A and B:"+c);
}
}