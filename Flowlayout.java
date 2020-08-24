import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
  
class Flowlayout extends JFrame { 
    
    JLabel l1, l2, l3, l4, l5;
    public Flowlayout() 
    { 
        
        FlowLayout layout = new FlowLayout();
        this.setLayout(layout); 
        l1 = new JLabel("Label 1  "); 
        l2 = new JLabel("Label 2  ");
        l3 = new JLabel("Label 3  ");
        l4 = new JLabel("Label 4  "); 
        l5 = new JLabel("Label 5  "); 
  
        this.add(l1); 
        this.add(l2);
        this.add(l3); 
        this.add(l4);  
        this.add(l5); 
    } 
 
  

    public static void main(String[] args) 
    { 
        
        Flowlayout f = new Flowlayout(); 
        f.setTitle("Flowlayout of FlowLayout");
        f.setBounds(200, 100, 600, 400); 
  
        f.setVisible(true); 
    } 
} 