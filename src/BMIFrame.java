/**
a class for converting height and weight to BMI
@param a number of pounds and height in inches
@return the BMI according to the user's entry
*/

/**
import statements
*/
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
class implements Interface
*/
public class BMIFrame extends JFrame implements Interface{
  int FRAME_WIDTH = 2000;
  int FRAME_HEIGHT = 500;

  /**
  reference to AllClassesFrame
  */
  private AllClassesFrame allclassesframe;

  public void setAllClassesFrame(AllClassesFrame allclassesframe){
    this.allclassesframe = allclassesframe;
  }

  /**
  default values to put in the text fields
  */
  double DEFAULT_WEIGHT = 10;
  double DEFAULT_HEIGHT = 60;

  /**
  buttons, textfields, labels, and results
  */
  JLabel weightLabel;
  JTextField weightField;
  JLabel heightLabel;
  JTextField heightField;
  JLabel healthLabel;
  JButton button;
  JButton back;
  JLabel resultLabel;
  double finalBMI;

  /**
  constructor
  */
  public BMIFrame(){
    resultLabel = new JLabel("your bmi: " + finalBMI);
    healthLabel = new JLabel();

    createTextField();
    createTextField1();
    createButton();
    goBack();
    createPanel();

    setSize(FRAME_WIDTH, FRAME_HEIGHT);
  }
  /**
  creates text field to enter a number into
  @param user entered number in lbs
  */
  public void createTextField(){
    weightLabel = new JLabel("weight in lbs: ");

    weightField = new JTextField(15);
    weightField.setText("" + DEFAULT_WEIGHT);
  }
  /**
  creates another text field to enter a number into
  @param user entered number in inches
  */
  public void createTextField1(){
    heightLabel = new JLabel("height in inches: ");

    heightField = new JTextField(15);
    heightField.setText("" + DEFAULT_HEIGHT);
  }

  /**
  button logic (lines 86 - 123)
  @param button click
  @return BMI
  */
  class AddBMIListener implements ActionListener{
    public void actionPerformed(ActionEvent event){
      double weight = Double.parseDouble(weightField.getText());
      double height = Double.parseDouble(heightField.getText());
      finalBMI = weight / height / height * 703;
      resultLabel.setText("Final bmi: " + finalBMI);
      if(finalBMI < 18.5){
        healthLabel.setText("You are underweight. You should eat some more.");
      }
      else if(18.5 <= finalBMI && finalBMI <= 24.9){
        healthLabel.setText("You are at a normal weight, good job.");
      }
      else{
        healthLabel.setText("You are overweight, stop eating.");
      }
    }
  }

  class GoBack implements ActionListener{
    public void actionPerformed(ActionEvent event){
      JFrame allclassesframe = new AllClassesFrame();
      allclassesframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      allclassesframe.setTitle("class selection");
      allclassesframe.setVisible(true);
    }
  }
/**
creates button to calculate BMI
@param button click
@return BMI
*/
  public void createButton(){
    button = new JButton("find your bmi");
    ActionListener listener = new AddBMIListener();
    button.addActionListener(listener);
  }
/**
creates button to go back
@param button click
@return AllClassesViewer
*/
  public void goBack(){
    back = new JButton("go back");
    ActionListener listener = new GoBack();
    back.addActionListener(listener);
  }

  /**
  creates visible panel for viewing buttons, text fields, and labels
  @return visible BMIFrame
  */
  public void createPanel(){
    JPanel panel = new JPanel();
    panel.add(weightLabel);
    panel.add(weightField);
    panel.add(heightLabel);
    panel.add(heightField);
    panel.add(healthLabel);
    panel.add(button);
    panel.add(back);
    panel.add(resultLabel);
    add(panel);
  }
}
