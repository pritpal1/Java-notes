import java.io.*;
class Student1
{
	int id;
	String name;
	Student1(int i,String n)
	{
		this.id=i;
		this.name=n;
	}
	Student1(Student1 s)
	{
		this.id=s.id;
		this.name=s.name;
		System.out.println(id+""+name);
	}

public static void main(String args[])
	{
	Student1 s1=new Student1(1,"pritpal");
	Student1 s2=new Student1(s1);
	}
}