public class AlphaN
{
public static void main(String agrs[])
{
int i,j;
//row iterator for loop
for(i=0;i<7;i++)
{
	//column iterator for loop
	for(j=0;j<=7;j++)
	{
		//check if currely position is a boundary position
		 if (j == 1 || j == 5 || (i == j && j != 0 && j != 6))
   
			System.out.print(" *");
		else
			System.out.print("  ");
	}
	System.out.println("");
	}
}
}