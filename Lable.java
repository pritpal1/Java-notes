import javax.swing.*;
public class Lable
{
 public static void main (String[]args)
 {
	 JFrame f=new JFrame();
	 JLabel l=new JLabel("Hellloooo");
	 l.setBounds(50,50,100,30);
	 JLabel l1=new JLabel("BCA");
	 l1.setBounds(70,70,100,40);
	 f.add(l);
	 f.add(l1);
	 f.setSize(400,500);
	 f.setLayout(null);
	 f.setVisible(true);
 }
}