public class O
{
public static void main(String agrs[])
{
int i,j;
//Row iterator for loop
for(i=0;i<5;i++)
{
	//Column iterator for loop
	for(j=0;j<5;j++)
	{
		//check if currely position is a boundary position
		if( ((i==0 || i==4) &&(j>0 || j<3))||(i!=0 || i!=4)&&j==0 || j==3)   {
           	System.out.print("*");
		}
		else{
			System.out.print(" ");
		}
	}
	System.out.println("");
	}
}
}