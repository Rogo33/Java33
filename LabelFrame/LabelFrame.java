import java.awt.FlowLayout; 

import javax.swing.Icon;
import javax.swing.ImageIcon; 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants; 

// Author: Rodrigo bueno

public class LabelFrame extends JFrame
{
    private JLabel label1; 
    private JLabel label2; 
    

    public LabelFrame()
    {
        super("INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DE MATO GROSSO");
        setLayout(new FlowLayout());

        
        label1 = new JLabel("");
        label1.setToolTipText("This is label1");
        add(label1); 

        
        Icon bug = new ImageIcon(getClass().getResource("ifmt.png"));
        label2 = new JLabel("", bug, SwingConstants.LEFT);
        label2.setToolTipText("IFMT");
        add(label2);   
    } 

    public static void main(String[] args)
    {
        LabelFrame frame = new LabelFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200); 
        frame.setVisible(true);
    }
}
