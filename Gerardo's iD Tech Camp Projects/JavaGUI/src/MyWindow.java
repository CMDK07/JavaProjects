import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
 
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
 
public class MyWindow extends JFrame implements ActionListener, ItemListener{
    //Global components
    JTextField name, strength, defense, health;
    JButton create, clear;
     
    JComboBox race;
     
    JCheckBox tragicPast, amnesia, magicalPowers, lastOfYourRace;
    JRadioButton nobility, criminal, merchant, sailor;
 
    //constructor
    MyWindow(String title){
 
        super(title);
 
        this.setSize(400, 650);
        this.init();
        this.setVisible(true);
         
    }//end constructor
 
    void init(){
 
        JLabel lname = new JLabel("Name:");
        JLabel lstrength = new JLabel("Strength:");
        JLabel ldefense = new JLabel("Defense:");
        JLabel lhealth = new JLabel("Health:");
 
        name = new JTextField(10);
        strength= new JTextField(10);
        defense= new JTextField(10);
        health = new JTextField(10);
 
        JPanel panel = new JPanel(new GridLayout(4,2));
         
        panel.add(lname);
        panel.add(name);
        panel.add(lstrength);
        panel.add(strength);
        panel.add(ldefense);
        panel.add(defense);
        panel.add(lhealth);
        panel.add(health);
 
        create = new JButton("Create");
        clear = new JButton("Clear");
 
        create.addActionListener(this);
        clear.addActionListener(this);
         
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(create);
        buttonPanel.add(clear);
         
        String[] raceOptions = { "Human", "Orc", "Elf" };
         
        race = new JComboBox(raceOptions);
         
        race.addActionListener(this);
         
        JPanel comboBoxPanel = new JPanel();
        comboBoxPanel.add(race);
         
        tragicPast = new JCheckBox("Your character has a mysterious, tragic past.");
        amnesia = new JCheckBox("Your character has amnesia.");
        magicalPowers = new JCheckBox("Your character has magic powers nobody else has");
        lastOfYourRace = new JCheckBox("Your character is the last survivor of their race");
         
        JPanel checkPanel = new JPanel(new GridLayout(4, 1));
         
        checkPanel.add(tragicPast);
        checkPanel.add(amnesia);
        checkPanel.add(magicalPowers);
        checkPanel.add(lastOfYourRace);
         
        tragicPast.addItemListener(this);
        amnesia.addItemListener(this);
        magicalPowers.addItemListener(this);
        lastOfYourRace.addItemListener(this);
         
        JLabel originLabel = new JLabel("What did your character grow up as?");
         
        nobility = new JRadioButton("A member of a noble household");
        criminal = new JRadioButton("A street urchin in a criminal gang");
        merchant = new JRadioButton("The child of a travelling merchant");
        sailor = new JRadioButton("A deckhand on a sailing ship");
         
        JPanel radioPanel = new JPanel(new GridLayout(5,1));
         
        radioPanel.add(originLabel);
        radioPanel.add(nobility);
        radioPanel.add(criminal);
        radioPanel.add(merchant);
        radioPanel.add(sailor);
         
        ButtonGroup origins = new ButtonGroup();
        origins.add(nobility);
        origins.add(criminal);
        origins.add(merchant);
        origins.add(sailor);
         
        this.setLayout(new BorderLayout());
         
        this.add(comboBoxPanel, BorderLayout.NORTH);
        this.add(panel, BorderLayout.CENTER);
        this.add(checkPanel, BorderLayout.EAST);
        this.add(radioPanel, BorderLayout.WEST);
        this.add(buttonPanel, BorderLayout.SOUTH);
         
         
 
        this.pack();
        this.setResizable(false);
         
        }//End void
 
    @Override
    public void actionPerformed(ActionEvent event) {
        // TODO Auto-generated method stub
         
        if(event.getSource() == create){
            Character myCharacter = new Character( Integer.parseInt(strength.getText()), Integer.parseInt(defense.getText()), Integer.parseInt(health.getText()));
            myCharacter.name = name.getText();
             
            JOptionPane.showMessageDialog(this, "Your character:\nRace: " + race.getSelectedItem() + "\nName: " + myCharacter.name + "\nHealth: " + myCharacter.health + "\nStrength: " + myCharacter.strength + "\nDefense: " + myCharacter.defense );
        }
        else if( event.getSource() == race){
             
            String currentItem = (String) race.getSelectedItem();
             
            if(currentItem.equals("Human")){
                name.setText("Geoff");
                strength.setText("10");
                defense.setText("5");
                health.setText("20");
            } else if( currentItem.equals("Orc")){
                name.setText("Krogar");
                strength.setText("15");
                defense.setText("2");
                health.setText("25");
                 
            } else if( currentItem.equals("Elf")){
                name.setText("Steve");
                strength.setText("8");
                defense.setText("8");
                health.setText("16");
            }
             
             
        }
        else{
            name.setText("");
            strength.setText("");
            defense.setText("");
            health.setText("");
        }//End else
         
    }
 
    @Override
    public void itemStateChanged(ItemEvent e) {
        if( e.getStateChange() == ItemEvent.SELECTED){
             
            // This code will run if an item was selected (not if it's unselected)
            if(tragicPast.isSelected() && amnesia.isSelected() && magicalPowers.isSelected() && lastOfYourRace.isSelected()){
                JOptionPane.showMessageDialog(this, "Warning, your character might be a Mary Sue - too unique for their own good!");
            }
        }
         
    }
 
          
        //End class
}//End class