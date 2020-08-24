import java.lang.String;
class student
{
	int rollno;
	String name;
	void enter(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+""+name);
	}
}
	class Obj2
	{
		public static void main(String[]args)
		{
			student s1=new student();
			student s2=new student();
			    s1.enter(1,"pritpal");
				s2.enter(2,"dhillon");
				s1.display();
				s2.display();
			
		}
	}
	
