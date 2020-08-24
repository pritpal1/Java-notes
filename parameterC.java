import java.io.*;
class constructor
{
	int id;
	String name;
	constructor(int i,String n)
	{
		this.id=i;
		this.name=n;
		System.out.println(id+""+name);
	}
	
}
class parameterC
{
	public static void main(String args[])
	{
		constructor ca =new constructor(1,"Prit");
	}
}