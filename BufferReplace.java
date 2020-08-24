import java.lang.String;
class BufferReplace
{
	public static void main(String[]args)
	{
		StringBuffer sb=new StringBuffer("helloOk");
		sb.replace(5,7,"java");
	    System.out.println(sb);
	}
}