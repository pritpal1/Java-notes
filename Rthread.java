class Rthread implements Runnable
{
	public void run()
	{
	 System.out.println("Thread is running");
	}
	public static void main(String[]args)
	{
		Rthread m1=new Rthread();
		Thread t1=new Thread(m1);
		Thread t2=new Thread(m1);
		t1.start();
		t2.start();
		
	}
}