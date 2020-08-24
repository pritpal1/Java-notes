import java.lang.String;
class Delete1
{
	public static void main(String[]args)
	{
		StringBuffer sb=new StringBuffer("BCA-MCA");
		sb.delete(1,3);
	    System.out.println(sb);
	}
}