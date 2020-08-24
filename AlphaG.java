public class AlphaG

{
public static void main(String agrs[])
{
int i,j;
//row iterator for loop
for(i=0;i<7;i++)
{
	//column iterator for loop
	for(j=0;j<=6;j++)
	{
		//check if currely position is a boundary position
		if ( j==0 || (j==4 &&(i!=1 && i!=2)) || ((i==0 || i==6) && (j>0 && j<4))|| (i==3 &&(j==3|| j==5)))
         
			System.out.print("*");
		else
			System.out.print(" ");
	}
	System.out.print("\n");
	}
}
}