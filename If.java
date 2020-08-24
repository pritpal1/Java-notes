import java.util.*;
class If
{
   public static void main(String[]args)
   {
      int x,y,z;
	  Scanner s=new Scanner(System.in);
	  System.out.println("enter the first number");
	  x=s.nextInt();
	  System.out.println("enter the second number");
	  y=s.nextInt();
	  System.out.println("enter the third number");
	  z=s.nextInt();
	  if((x>y)&&(x>z))
	  {
	    System.out.println(x+"is greater integer");
	   }
	     else if((y>x)&&(y>z))
		 {
		    System.out.println(y+"is greater integer");
		  }
		  else
		  System.out.println(z+"is greater integer");
	}
}