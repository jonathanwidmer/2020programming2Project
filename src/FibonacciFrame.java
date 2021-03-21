import javax.swing.*;
import java.awt.event.*;

public class FibonacciFrame extends JFrame{
  int FRAME_WIDTH = 800;
  int FRAME_HEIGHT = 500;

  private AllClassesFrame allclassesframe;

  public void setAllClassesFrame(AllClassesFrame allclassesframe){
    this.allclassesframe = allclassesframe;
  }
  public void diplay(){
    allclassesframe.setVisible(true);
  }

  int DEFAULT_NUMBER = 1;

  JLabel fibLabel;
  JTextField fibField;
  JButton button;
  JLabel resultLabel;
  long finalNumber;

  public FibonacciFrame(){
    resultLabel = new JLabel("final number: " + finalNumber);

    createTextField();
    createButton();
    createPanel();
    setSize(FRAME_WIDTH, FRAME_HEIGHT);
  }

  private void createTextField(){
    fibLabel = new JLabel("number in Fibonacci sequence: ");
    fibField = new JTextField(5);
    fibField.setText("" + DEFAULT_NUMBER);
  }

  class AddNumberListener implements ActionListener{
    public void actionPerformed(ActionEvent event){
      System.out.println(fibField.getText());
      long number = Long.parseLong(fibField.getText());
      System.out.println(number);
      finalNumber = fib(number);
      resultLabel.setText("Final number: " + finalNumber);
    }
  }

  public static long fib(long number){
      if (number <= 2){
        return 1;
      }
      else {
        return fib(number - 1) + fib(number - 2);
      }
   }

   private void createButton(){
     button = new JButton("calculate fibonnaci number");
     ActionListener listener = new AddNumberListener();
     button.addActionListener(listener);
   }

   private void createPanel(){
     JPanel panel = new JPanel();
     panel.add(fibLabel);
     panel.add(fibField);
     panel.add(button);
     panel.add(resultLabel);
     add(panel);
   }
}
