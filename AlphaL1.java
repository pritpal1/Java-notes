public class AlphaL1
{
public static void main(String agrs[])
{
int i,j;
//row iterator for loop
for(i=0;i<12;i++)
{
	//column iterator for loop
	for(j=0;j<11;j++)
	{
		//check if currely position is a boundary position
		if(i==11||i==11||j==0||j==1-1)
			System.out.print("*");
		else
			System.out.print(" ");
	}
	System.out.print("\n");
	}
}
}