public class AlphaV
{
public static void main(String agrs[])
{
int i,j;
//row iterator for loop
for(i=0;i<12;i++)
{
	//column iterator for loop
	for(j=0;j<12;j++)
	{
		//check if currely position is a boundary position
		if (((j == 1 || j == 5) && i < 5) || (i == 6 && j == 3) || (i == 5 && (j == 2 ||j == 4)))
          
			System.out.print("*");
		else
			System.out.print(" ");
	}
	System.out.print("\n");
	}
}
}