import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
public class scroll extends JFrame
{
	public scroll()
	{
		super("ScrollPane Demo");//heading of panel
		ImageIcon img=new ImageIcon("3.jpg");
		JScrollPane png=new JScrollPane(new JLabel(img));
		getContentPane().add(png);
		setSize(600,500);
		setVisible(true);
	}
	public static void main(String[]args)
	{
		scroll s=new scroll();
	}
}