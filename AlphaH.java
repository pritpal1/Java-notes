public class AlphaH
{
public static void main(String agrs[])
{
int i,j;
//row iterator for loop
for(i=0;i<11;i++)
{
	//column iterator for loop
	for(j=0;j<11;j++)
	{
		//check if currely position is a boundary position
		if(i==5||i==5||j==0||j==10)
			System.out.print("*");
		else
			System.out.print(" ");
	}
	System.out.print("\n");
	}
}
}