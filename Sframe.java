import javax.swing.*;
public class Sframe
{
	Sframe()
	{
		JFrame f=new JFrame();
		JButton b=new JButton("click");
		b.setBounds(130,100,100,40);
		f.add(b);
		f.setSize(500,700);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[]args)
	{
		Sframe s=new Sframe();
	}
}