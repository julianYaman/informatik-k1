import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Hilfsbildschirm extends JFrame implements ActionListener
{

    JButton button, button2, button3, button4, button5;
    JTextField tf, tf2, tf3, tf4, tf5;
    JLabel l1, l2, l3, l4, l5;
    JPanel panel;


    public Hilfsbildschirm()
    {
        
        setSize(170, 400);
        setLocation(700, 10);
        setTitle("Hilfsbildschirm");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        l1 = new JLabel("Linienbreite");
        l2 = new JLabel("Seitenlänge N-Eck");
        l3 = new JLabel("Winkel vom Stift");
        l4 = new JLabel("Seitenzahl");
        l5 = new JLabel("Einhorndicke");
        tf = new JTextField("1", 4);
        tf2 = new JTextField("10",4);
        tf3 = new JTextField("0",4);
        tf4 = new JTextField("5", 6);
        tf5 = new JTextField("1", 2);
        button = new JButton("Breite setzen");
        button2 = new JButton("Länge setzen");
        button3 = new JButton("Winkel setzen");
        button4 = new JButton("Seitenzahl setzen");
        button5 = new JButton("Einhorndicke setzen");
        panel = new JPanel();
        
        button.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        
        panel.add(l1);
        panel.add(tf);
        panel.add(button);
        panel.add(l2);
        panel.add(tf2);
        panel.add(button2);
        panel.add(l3);
        panel.add(tf3);
        panel.add(button3);
        panel.add(l4);
        panel.add(tf4);
        panel.add(button4);
        panel.add(l5);
        panel.add(tf5);
        panel.add(button5);
        
        add(panel);
        setVisible(true);
        
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == button)
        {
              Malen.s.setzeLinienBreite(  Integer.parseInt( tf.getText() )  ); 
        }
        else if(ae.getSource() == button2)
        {
            Malen.sl = Integer.parseInt( tf2.getText() );
        }
        else if(ae.getSource() == button3)
        {
            Malen.s.dreheBis(Float.parseFloat(tf3.getText()));
        }
        else if(ae.getSource() == button4)
        {
            Malen.NEck = Float.parseFloat( tf4.getText() );
        }
        else if(ae.getSource() == button5)
        {
            Malen.sd = Integer.parseInt( tf5.getText() );
        }
        
    }

}
