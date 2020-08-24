import java.io.*;
class Copyconstructor
{
	int id;
	String name;
	Copyconstructor(int i,String n)
	{
		this.id=i;
		this.name=n;
		System.out.println(id+""+name);
		
	}
	Copyconstructor(Copyconstructor c)
	{
		this.id=c.id;
		this.name=c.name;
		System.out.println(id + "" +name);
		
	}
	
}
class construct1
{
	public static void main(String []args)
	{
		Copyconstructor ca =new Copyconstructor(101,"pritpal");
	}
}