class Exception1
{
	 public static void main(String[] args) 
	 {
 
    try 
	{
		int arr[]=new int[7];
		arr[10]=30/0;
		System.out.println("last statement of try block");
	}
	catch(ArithmeticException e)
	{
		System.out.println("U should not divide no by zero");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Accessing array element outside of the limit");
	}
	catch(Exception e)
	{
		System.out.println("other exception");
	}
   }
}