class test
{
	public void Exam()
	{
		System.out.println("hello");
	}
	
}
class test1 extends test
{
	public void Exam()
	{
		System.out.println("bca");
	}
}
class Dynamic
{
	public static void main(String args[])
	{
		test obj=new test1();
		obj.Exam();
	}
}
