/// ******************************************************************  
// RatePanel.java  
//  
// Panel for a program that converts different currencies to  
// U.S. Dollars  
// ******************************************************************  
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
import java.text.DecimalFormat;
public class RatePanel extends JPanel  
{ 
private double[] rate; // exchange rates
 private String[] currencyName;  
 private JLabel result;  
 JComboBox comb;
 JTextField field;
 // ------------------------------------------------------------   
 // Sets up a panel to convert cost from one of 6 currencies   
 // into U.S. Dollars. The panel contains a heading, a text
 // field for the cost of the item, a combo box for selecting   
 // the currency, and a label to display the result.   
 // ------------------------------------------------------------   
 public RatePanel ()  
 {  
 JLabel title = new JLabel ("How much is that in dollars?");
 setPreferredSize(new Dimension(500, 250)); 
 title.setAlignmentX (Component.CENTER_ALIGNMENT);   
 title.setFont (new Font ("Helvetica", Font.BOLD, 20));  
 // Set up the arrays for the currency conversions   
 currencyName = new String[] {"Select the currency..","European Euro",
                                "Canadian Dollar","Japanese Yen", "Australian Dollar",
                                "Indian Rupee", "Mexican Peso"};   
 rate = new double [] {0.0, 1.2103, 0.7351, 0.0091, 0.6969, 0.0222, 0.0880};  
 result = new JLabel (" ------------ ");  
 //add (title);  
 //Add Combo
 comb = new JComboBox(currencyName);
 comb.setAlignmentX(CENTER_ALIGNMENT);
 field = new JTextField(15);
 field.addActionListener(new ComboListener());
  result = new JLabel("--Result--");
  result.setAlignmentX(Component.CENTER_ALIGNMENT);
  //comb.setModel(new DefaultComboBoxModel(currencyName));
  //comb.addActionListener(new ComboListener());

  add(title);
  add(comb);
  add(result);
  add(field);
 }  
 // ******************************************************   
 // Represents an action listener for the combo box.   
 // ******************************************************   
private class ComboListener implements ActionListener {  
 // --------------------------------------------------   
 // Determines which currency has been selected and   
 // the value in that currency then computes and   
 // displays the value in U.S. Dollars.  
 // --------------------------------------------------   
 public void actionPerformed (ActionEvent event)   {  
     double amount = 0;
     DecimalFormat decimal = new DecimalFormat("#.##");
     try{
         amount=Double.parseDouble(field.getText());
     }catch(Exception ex){
         result.setText("Input Number");
     }
     int ind = comb.getSelectedIndex();
 //double converted = amount*rate[index];
 result.setText (amount+ " " + currencyName[ind] + "=" + decimal.format(rate[ind] * amount)+"U.S Dollars");   }  
 }  
 } 

