/**
a class for converting a user entered number to a value in the Fibonacci sequence
@param a user entered number
@return the value of that sequence in the Fibonacci Sequence
*/
/**
import statements
*/
import javax.swing.*;
import java.awt.event.*;

/**
class implements interface
*/

public class FibonacciFrame extends JFrame implements Interface{
  int FRAME_WIDTH = 800;
  int FRAME_HEIGHT = 500;

  /**
  reference to AllClassesFrame
  */

  private AllClassesFrame allclassesframe;
/**
makes allclasses object
*/
  public void setAllClassesFrame(AllClassesFrame allclassesframe){
    this.allclassesframe = allclassesframe;
  }
  /**
  default value to put in the text field
  */

  int DEFAULT_NUMBER = 1;

  /**
  buttons, textfield, and labels
  */
  JLabel fibLabel;
  JTextField fibField;
  JButton button;
  JButton back;
  JLabel resultLabel;
  long finalNumber;

  /**
  constructor
  */
  public FibonacciFrame(){
    resultLabel = new JLabel("final number: " + finalNumber);

    createTextField();
    createButton();
    goBack();
    createPanel();
    setSize(FRAME_WIDTH, FRAME_HEIGHT);
  }

  /**
  creates text field to enter a number into
  */
  public void createTextField(){
    fibLabel = new JLabel("number in Fibonacci sequence: ");
    fibField = new JTextField(5);
    fibField.setText("" + DEFAULT_NUMBER);
  }

  /**
  button logic (lines 68 - 108)
  */
  class AddNumberListener implements ActionListener{
     /**
    method for performing action
    */
    public void actionPerformed(ActionEvent event){
      System.out.println(fibField.getText());
      long number = Long.parseLong(fibField.getText());
      System.out.println(number);
      finalNumber = fib(number);
      resultLabel.setText("Final number: " + finalNumber);
    }
  }

  class GoBack implements ActionListener{
     /**
    method for performing action
    */
    public void actionPerformed(ActionEvent event){
      JFrame allclassesframe = new AllClassesFrame();
      allclassesframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      allclassesframe.setTitle("class selection");
      allclassesframe.setVisible(true);
    }
  }
/**
RECURSIVE METHOD for calculating number in Fibonacci sequence
@param long number
@return number in fibonacci sequence
*/
  public static long fib(long number){
      if (number <= 2){
        return 1;
      }
      else {
        return fib(number - 1) + fib(number - 2);
      }
   }
/**
creates button for calculating fibonacci number
*/
   public void createButton(){
     button = new JButton("calculate fibonnaci number");
     ActionListener listener = new AddNumberListener();
     button.addActionListener(listener);
   }
/**
creates button to go back
*/
   public void goBack(){
     back = new JButton("go back");
     ActionListener listener = new GoBack();
     back.addActionListener(listener);
   }
   /**
   creates visible panel for viewing buttons, text field, and labels
   */
   public void createPanel(){
     JPanel panel = new JPanel();
     panel.add(fibLabel);
     panel.add(fibField);
     panel.add(button);
     panel.add(back);
     panel.add(resultLabel);
     add(panel);
   }
}
