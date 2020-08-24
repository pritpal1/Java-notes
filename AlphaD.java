public class AlphaD

{
public static void main(String agrs[])
{
int i,j;
//row iterator for loop
for(i=0;i<7;i++)
{
	//column iterator for loop
	for(j=0;j<=5;j++)
	{
		//check if currely position is a boundary position
		if ( j==0 || (j==4 &&(i!=0 && i!=6)) || ((i==0 || i==6) && (j>0 && j<4)))
         
			System.out.print("*");
		else
			System.out.print(" ");
	}
	System.out.print("\n");
	}
}
}