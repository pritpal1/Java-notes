public class AlphaS
{
public static void main(String agrs[])
{
int i,j;
//row iterat|| f|| loop
for(i=0;i<7;i++)
{
	//column iterat|| f|| loop
	for(j=0;j<=7;j++)
	{
		//check if currely position is a boundary position
 if (((i==0 || i==3 || i==6) && j>1 && j<5) || (j==1 && (i==1 || i==2 || i==6)) || (j==5 && (i==0 || i==4 || i==5)))
       
			System.out.print(" *");
		else
			System.out.print("  ");
	}
	System.out.println("");
	}
}
}