import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

class GUI implements ActionListener
{
    JFrame f;
    JButton plus,multiply;
    JLabel firstNumber, secondNumber,answer;
    JTextField num1, num2, result;
    int firstOperand, secondOperand,sum;
    String input;
    public void init()
    {
        f = new JFrame ();
        plus = new JButton("+");
        multiply = new JButton ("*");
        firstNumber = new JLabel("First Number");
        secondNumber = new JLabel("Second Number");
        answer = new JLabel("Answer");
        num1 = new JTextField(10);
        num2 = new JTextField(10);
        result = new JTextField(10);
        result.setEditable(false);
        f.setLayout(new FlowLayout());
        f.add(firstNumber); f.add(num1);
        f.add(secondNumber);f.add(num2);
        f.add(plus);f.add(multiply);
        f.add(answer);f.add(result);
        
        f.setVisible(true);
        f.setSize(150,250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        plus.addActionListener(this);
        multiply.addActionListener(this);       
    }
    
    public GUI()
    {
        init();
    }

    public void getInput()
    {
        try
        {
      input = num1.getText();
      firstOperand = Integer.parseInt(input);
      input = num2.getText();
      secondOperand = Integer.parseInt(input);
        }
        catch(NumberFormatException nfe)
        {
            JOptionPane.showMessageDialog(null, "Only input integer values in the text field");
       }
    }
    public void actionPerformed(ActionEvent ae) 
    {
     if (ae.getSource() == plus)
     {
      getInput();
      sum = firstOperand + secondOperand;
      result.setText(sum +"");
     }
     else if (ae.getSource() == multiply)
     {
      getInput();
      sum = firstOperand * secondOperand;
      result.setText(sum + "");
     }
    }
}
public class Test {

    
    public static void main(String[] args) 
    {
    new GUI();    
    }
    
}
