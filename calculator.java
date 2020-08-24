import java.awt.*;
import java.awt.event.*;
public class calculator implements ActionListener
{
	int c,n;
	String s1,s2,s3,s4,s5;
	Textield t=new Textield(20);
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
	calculator()
	{
		Frame f = new Frame("My calculator");
		Panel p = new Panel();
		f.setLayout(new FlowLayout());
		b1 = new Button("0");
		b1.addActionListener(this);
		b2 = new Button("1");
		b2.addActionListener(this);
		b3 = new Button("2");
		b3.addActionListener(this);
		b4 = new Button("3");
		b4.addActionListener(this);
		b5 = new Button("4");
		b5.addActionListener(this);
		b6 = new Button("5");
		b6.addActionListener(this);
		b7 = new Button("6");
		b7.addActionListener(this);
		b8 = new Button("7");
		b8.addActionListener(this);
		b9 = new Button("8");
		b9.addActionListener(this);
		b10 = new Button("9");
		b10.addActionListener(this);
		b11 = new Button("+");
		b11.addActionListener(this);
		b12 = new Button("-");
		b12.addActionListener(this);
		b13 = new Button("*");
		b13.addActionListener(this);
		b14 = new Button("/");
		b14.addActionListener(this);
		b15 = new Button("%");
		b15.addActionListener(this);
		b16 = new Button("=");
		b16.addActionListener(this);
		b17 = new Button("C");
		b17.addActionListener(this);
		 
		f.add(t);
		GridLayout g = new GridLayout(4,14,10,20);
		p.setLayout(g);
		p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(b6);p.add(b7);p.add(b8);p.add(b9);
		p.add(b10);p.add(b11);p.add(b12);p.add(b13);p.add(b14);p.add(b15);p.add(b16);p.add(b17);
		f.add(p);
		f.setSize(300,300);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			s3 = t.getText();
			s4 = "0";
			s5 = s3+s4;
			t.setText(s5);
		}
		if(e.getSource()==b2)
		{
			s3 = t.getText();
			s4 = "1";
			s5 = s3+s4;
			t.setText(s5);
		}
		if(e.getSource()==b3)
		{
			s3 = t.getText();
			s4 = "2";
			s5 = s3+s4;
			t.setText(s5);
		}if(e.getSource()==b4)
		{
			s3 = t.getText();
			s4 = "3";
			s5 = s3+s4;
			t.setText(s5);
		}
		if(e.getSource()==b5)
		{
			s3 = t.getText();
			s4 = "4";
			s5 = s3+s4;
			t.setText(s5);
		}
		if(e.getSource()==b6)
		{
			s3 = t.getText();
			s4 = "5";
			s5 = s3+s4;
			t.setText(s5);
		}
		if(e.getSource()==b7)
		{
			s3 = t.getText();
			s4 = "6";
			s5 = s3+s4;
			t.setText(s5);
		}
		if(e.getSource()==b8)
		{
			s3 = t.getText();
			s4 = "7";
			s5 = s3+s4;
			t.setText(s5);
		}
		if(e.getSource()==b9)
		{
			s3 = t.getText();
			s4 = "8";
			s5 = s3+s4;
			t.setText(s5);
		}
		if(e.getSource()==b10)
		{
			s3 = t.getText();
			s4 = "9";
			s5 = s3+s4;
			t.setText(s5);
		}
		if(e.getSource()==b11)
		{
			s1 = t.getText();
			t.setText("");
			c=1;

		}
		if(e.getSource()==b12)
		{
			s1 = t.getText();
			t.setText("");
			c=2;

		}
		if(e.getSource()==b13)
		{
			s1 = t.getText();
			t.setText("");
			c=3;

		}
		if(e.getSource()==b14)
		{
			s1 = t.getText();
			t.setText("");
			c=4;

		}
		if(e.getSource()==b15)
		{
			s1 = t.getText();
			t.setText("");
			c=5;

		}
		if(e.getSource()==b16)
		{
			s2 = t.getText();
			if(c==1)
			{
				n = Integer.parseInt(s1)+Integer.parseInt(s2);
				t.setText(String.valueOf(n));
			}
			else
			if(c==2)
			{
				n = Integer.parseInt(s1)-Integer.parseInt(s2);
				t.setText(String.valueOf(n));
			}
			else
			if(c==3)
			{
				n = Integer.parseInt(s1)*Integer.parseInt(s2);
				t.setText(String.valueOf(n));
			}
			if(c==4)
			{
			    try
			    {
			        int p=Integer.parseInt(s2);
			        if(p!=0)
                    {
                        				n = Integer.parseInt(s1)/Integer.parseInt(s2);
                    t.setText(String.valueOf(n));
                     }
                     else
                        t.setText("infinite");

                }
                catch(Exception i){}
			}
			if(c==5)
			{
				n = Integer.parseInt(s1)%Integer.parseInt(s2);
				t.setText(String.valueOf(n));
			}
		}
		if(e.getSource()==b17)
		{
			t.setText("");
		}
	}

	public static void main(String args[])
	{
		calculator v = new calculator();
	}
}