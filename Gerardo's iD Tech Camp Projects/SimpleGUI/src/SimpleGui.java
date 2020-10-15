import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
 
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class SimpleGui extends JFrame implements ActionListener{
 
private JPanel panelControl;
private JButton remove, removeAll;
 
SimpleGui(){
 
super("JPanel");
 
init();
this.setSize(300, 300);
this.setVisible(true);
}//end SimpleGui
 
public void init(){
 
JPanel panel = new JPanel();
panel.add(new JLabel("Name"));
panel.add(new JTextField(20));
 
panel.setBackground(Color.YELLOW);
panel.setBorder(BorderFactory.createTitledBorder("Info"));
 
remove = new JButton("Remove");
removeAll = new JButton("Remove All");
 
remove.addActionListener(this);
removeAll.addActionListener(this);
 
panelControl = new JPanel();
panelControl.add(remove);
panelControl.add(removeAll);
 

 
this.add(panel);
this.add(panel, BorderLayout.CENTER);
this.add(panelControl, BorderLayout.SOUTH);
}//end void
 
  
 
@Override
public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
     
}
 
}//end class