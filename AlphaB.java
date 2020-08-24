public class AlphaB

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
		if (j == 1||((i == 0 || i == 6)&&(j > 1 && j < 5))|| (j == 5 && i != 0 && i != 6) ||i==3 && (j>1 && j<5))
         
			System.out.print("*");
		else
			System.out.print(" ");
	}
	System.out.print("\n");
	}
}
}