import javax.swing.*;
public class Finheritance extend JFrame
{
	Finheritance()
	{
		JButton b=new JButton("Click");
		b.setBoundss(130,100,100,50);
		add(b);
		setSize(400,500);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[]args)
	{
		Finheritance f1=new Finheritance();
	}
}