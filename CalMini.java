import java.awt.*;
import java.awt.event.*;
public class CalMini implements ActionListener
{
	int c,n;
	String s1,s2,s3,s4,s5;
	Button b1,b2,b3,b4,b5;
	TextField t=new TextField(20);
	CalMini()
	{
		Frame f = new Frame("My calculator");
		Panel p = new Panel();	
		f.setLayout(new FlowLayout());
		b1 = new Button("10");
		b1.addActionListener(this);
		b2 = new Button("20");
		b2.addActionListener(this);
		b3 = new Button("+");
		b3.addActionListener(this);
		b4 = new Button("=");
		b4.addActionListener(this);
		b5 = new Button("C");
		b5.addActionListener(this);
		f.add(t);
		GridLayout g = new GridLayout(4,14,10,20);
		p.setLayout(g);
		p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);
		f.add(p);
		f.setSize(300,300);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			s1 = t.getText();
		    s2 = "10";
			s3 = s1+s2;
			t.setText(s1);
		}
		if(e.getSource()==b2)
		{
			s1 = t.getText();
			s2 = "20";
			s3 = s1+s2;
			t.setText(s1);
		}
		if(e.getSource()==b3)
		{
			s4 = t.getText();
			t.setText("");
			c=1;
		}
		if(e.getSource()==b4)
		{
			s5 = t.getText();
			if(c==1)
			{
				n = Integer.parseInt(s4)+Integer.parseInt(s5);
				t.setText(String.valueOf(n));
			}
		}
		if(e.getSource()==b5)
		{
			t.setText("");
		}
	}
	public static void main(String args[])
	{
		CalMini v = new CalMini();
	}
}