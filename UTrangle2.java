public class UTrangle2
{
  public static void main(String []args)
   {
     //no of spaces
      // int k=5*1;
	   
       //outer loop to handle no of rows
        for(int i=7;i>=1;i--)
       {
          //inner loop to handle no of spaces
          for(int j=7;j>=i;j--)
         {
                System.out.print(" ");
         }
         //decrementing k after each loop
         //k=k+1;
         //inner loop to handle no of columns
        for(int j=1;j<=i;j++)
        {
             System.out.print("* ");
        }
      System.out.println();
      }
    }
}
