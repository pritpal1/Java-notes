import java.util.*;
class A2d
{
	 public static void main(String args[])
	 {
	 Scanner s=new Scanner(System.in);
		System.out.println("Enter the row and column");
		int n=s.nextInt();
		int m=s.nextInt();
		int arr[][]=new int [n][m];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		System.out.println("Print Array");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.println("\t"+arr[i][j]);
			}
			System.out.println("");
		}
		
	 }
}	 