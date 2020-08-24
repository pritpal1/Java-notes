public class AlphaL
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
		if(j==1||(i==11 && j!=0 && j<11))
			System.out.print("*");
		else
			System.out.print(" ");
	}
	System.out.print("\n");
	}
}
}