
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.JOptionPane;  
public class Puzzle extends Frame implements ActionListener
{  
   Button b1,b2,b3,b4,b5,b6,b7,b8,b9;  
     Puzzle()
     {  
          super("Puzzle"); //name of the window 
          b1=new Button("1");  //set the text displaying on button
          b1.setBounds(50,100,40,40);  //define the position of button(left,top,width ,height)
          b2=new Button("2");  
          b2.setBounds(100,100,40,40);  
          b3=new Button("3");  
          b3.setBounds(150,100,40,40);  
          b4=new Button("4");  
          b4.setBounds(50,150,40,40);  
          b5=new Button("5");  
          b5.setBounds(100,150,40,40);  
          b6=new Button("6");  
          b6.setBounds(150,150,40,40);  
          b7=new Button("7");  
          b7.setBounds(50,200,40,40);  
          b8=new Button("");   //blank button
          b8.setBounds(100,200,40,40);  
          b9=new Button("8");  
          b9.setBounds(150,200,40,40);  
      
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        b3.addActionListener(this);  
        b4.addActionListener(this);  
        b5.addActionListener(this);  
        b6.addActionListener(this);  
        b7.addActionListener(this);  
        b8.addActionListener(this);  
        b9.addActionListener(this);  
      
        add(b1);add(b2);add(b3);add(b4);add(b5); //adding buttons into frame
        add(b6);add(b7);add(b8);add(b9);  
    
        setSize(400,400);  //Size of the Frame
        setLayout(null);  //Layout as null
        setVisible(true);  //Visibility True
     }  
public void actionPerformed(ActionEvent e) //actionPerformed is a method of ActionListener
{  
    if(e.getSource()==b1)  //if b1 button is clicked
    {  
        String label=b1.getLabel();  //label is a variable which hold the value of b1
        if(b2.getLabel().equals("")) //check the condition either the buttons around b1 are blank or not.
        {  
            b2.setLabel(label);  //if b2 is blank then set the value of b1 that hold by lable variable
            b1.setLabel("");   //set the b1 as blank
        }  
        if(b4.getLabel().equals(""))
        {  
            b4.setLabel(label);  
            b1.setLabel("");  
        }  
    }  
    if(e.getSource()==b2)
   {  
        String label=b2.getLabel();  
        if(b1.getLabel().equals(""))
       {  
            b1.setLabel(label);  
            b2.setLabel("");  
       }  
        if(b3.getLabel().equals(""))
       {  
            b3.setLabel(label);  
            b2.setLabel("");  
        }  
        if(b5.getLabel().equals(""))
       {  
            b5.setLabel(label);  
            b2.setLabel("");  
        }  
    }  
    if(e.getSource()==b3)
    {  
        String label=b3.getLabel();  
        if(b2.getLabel().equals(""))
       {  
            b2.setLabel(label);  
            b3.setLabel("");  
        }  
        if(b6.getLabel().equals(""))
        {  
            b6.setLabel(label);  
            b3.setLabel("");  
        }  
    }  
    if(e.getSource()==b4)
    {  
        String label=b4.getLabel();  
        if(b1.getLabel().equals(""))
       {  
            b1.setLabel(label);  
            b4.setLabel("");  
        }  
        if(b7.getLabel().equals(""))
       {  
            b7.setLabel(label);  
            b4.setLabel("");  
        }  
        if(b5.getLabel().equals(""))
       {  
            b5.setLabel(label);  
            b4.setLabel("");  
        }  
    }  
    if(e.getSource()==b5)
    {  
        String label=b5.getLabel();  
        if(b2.getLabel().equals(""))
        {  
            b2.setLabel(label);  
            b5.setLabel("");  
        }  
        if(b6.getLabel().equals(""))
        {  
            b6.setLabel(label);  
            b5.setLabel("");  
        }  
        if(b4.getLabel().equals(""))
        {  
            b4.setLabel(label);  
            b5.setLabel("");  
        }  
        if(b8.getLabel().equals(""))
       {  
            b8.setLabel(label);  
            b5.setLabel("");  
        }  
    }  
    if(e.getSource()==b6)
    {  
        String label=b6.getLabel();  
        if(b9.getLabel().equals(""))
        {  
            b9.setLabel(label);  
            b6.setLabel("");  
        }  
        if(b3.getLabel().equals(""))
       {  
            b3.setLabel(label);  
            b6.setLabel("");  
        }  
        if(b5.getLabel().equals(""))
        {  
            b5.setLabel(label);  
            b6.setLabel("");  
        }  
    }  
    if(e.getSource()==b7)
    {  
        String label=b7.getLabel();  
        if(b4.getLabel().equals(""))
        {  
            b4.setLabel(label);  
            b7.setLabel("");  
        }  
        if(b8.getLabel().equals(""))
       {  
            b8.setLabel(label);  
            b7.setLabel("");  
        }  
    }  
    if(e.getSource()==b8)
   {  
        String label=b8.getLabel();  
        if(b9.getLabel().equals(""))
        {  
            b9.setLabel(label);  
            b8.setLabel("");  
        }  
        if(b7.getLabel().equals(""))
        {  
            b7.setLabel(label);  
            b8.setLabel("");  
        }  
        if(b5.getLabel().equals(""))
        {  
            b5.setLabel(label);  
            b8.setLabel("");  
        }  
    }  
    if(e.getSource()==b9)
    {  
        String label=b9.getLabel();  
        if(b6.getLabel().equals(""))
        {  
            b6.setLabel(label);  
            b9.setLabel("");  
        }  
        if(b8.getLabel().equals(""))
       {  
            b8.setLabel(label);  
            b9.setLabel("");  
        }  
    }  
      
    //sets the position of correct buttons and displaying congo messege
    if(b1.getLabel().equals("1")&&b2.getLabel().equals("2")&&b3.getLabel()    
            .equals("3")&&b4.getLabel().equals("4")&&b5.getLabel().equals("5")    
            &&b6.getLabel().equals("6")&&b7.getLabel().equals("7")&&b8.getLabel()    
            .equals("8")&&b9.getLabel().equals(""))
    {     
            JOptionPane.showMessageDialog(this,"Congratulations! You won.");    
    }    
}  
public static void main(String[] args) 
{  
    new Puzzle();  //call the constructor
}  
}  
