class test
{
	public int add(int x,int y)
	{
		return x+y;
	}	
     public int add(int x,int y,int z)
	{
		return x+y+z;
	}
	public int add(double x,int y)
	{
		return (int)x+y;
	}
}



class OverloadDemo
{
	public static void main(String[]args)
	{
		test obj=new test();
		System.out.println(obj.add(2,3));
		System.out.println(obj.add(2,3,4));
		System.out.println(obj.add(2,3));
	}
}