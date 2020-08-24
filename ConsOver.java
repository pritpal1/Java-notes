import java.io.*;
class Student
{
	String name;
	int id;
	Student(String a)
	{
		this.name=a;
		System.out.println("1="+name);
	}
	Student(int i,String n)
	{
		this.id=i;
		this.name=n;
		System.out.println("2="+id+""+name);
		
	}
}

class ConsOver
{
	public static void main(String args[])
	{
		Student ca=new Student("prit");
		Student sa=new Student(1,"prit");
	}
}