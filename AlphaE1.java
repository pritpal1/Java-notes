public class AlphaE1
{
public static void main(String agrs[])
{
int i,j;
//row iterator for loop
for(i=0;i<6;i++)
{
	//column iterator for loop
	for(j=0;j<5;j++)
	{
		//check if currely position is a boundary position
		if(i==0||i==6-1||i==2 ||j==0||j==1-1)
			System.out.print("*");
		else
			System.out.print(" ");
	}
	System.out.print("\n");
	}
}
}