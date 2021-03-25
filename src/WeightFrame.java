/**
a class for converting distance in pounds to kilograms
@param a number of pounds entered by the user
@return the amount of pounds in kilograms
*/

/**
import statements
*/
import java.awt.event.*;
import javax.swing.*;

/**
class implements Interface
*/
public class WeightFrame extends JFrame implements Interface{
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
  double DEFAULT_WEIGHT = 10;

  /**
  buttons, textfield, labels, and results
  */
  JLabel weightLabel;
  JTextField weightField;
  JButton button;
  JButton back;
  JLabel resultLabel;
  double finalWeight;

  /**
  constructor
  */
  public WeightFrame(){
    resultLabel = new JLabel("weight in kg: " + finalWeight);

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
    weightLabel = new JLabel("weight in lbs: ");

    weightField = new JTextField(15);
    weightField.setText("" + DEFAULT_WEIGHT);
  }

  /**
  button logic (lines 69 - 97)
  */
  class AddWeightListener implements ActionListener{
    /**
    method for performing action
    */
    public void actionPerformed(ActionEvent event){
      double weight = Double.parseDouble(weightField.getText());
      finalWeight = weight / 2.205;
      resultLabel.setText("Final weight: " + finalWeight);
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
creates button to calculate weight
*/
  public void createButton(){
    button = new JButton("Convert lbs to kg");
    ActionListener listener = new AddWeightListener();
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
    panel.add(weightLabel);
    panel.add(weightField);
    panel.add(button);
    panel.add(back);
    panel.add(resultLabel);
    add(panel);
  }
}
