import javax.swing.*;
public class Firstin extends JFrame
{
	Firstin()
	{
		JButton b=new JButton("Click");
		b.setBounds(130,100,100,50);
		add(b);
		setSize(400,500);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[]args)
	{
		Firstin f1=new Firstin();
	}
}