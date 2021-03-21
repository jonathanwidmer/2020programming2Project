import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class BMIFrame extends JFrame{
  int FRAME_WIDTH = 2000;
  int FRAME_HEIGHT = 500;

  private AllClassesFrame allclassesframe;

  public void setAllClassesFrame(AllClassesFrame allclassesframe){
    this.allclassesframe = allclassesframe;
  }
  public void diplay(){
    allclassesframe.setVisible(true);
  }

  double DEFAULT_WEIGHT = 10;
  double DEFAULT_HEIGHT = 60;

  JLabel weightLabel;
  JTextField weightField;
  JLabel heightLabel;
  JTextField heightField;
  JLabel healthLabel;
  JButton button;
  JLabel resultLabel;
  double finalBMI;

  public BMIFrame(){
    resultLabel = new JLabel("your bmi: " + finalBMI);
    healthLabel = new JLabel();

    createTextField();
    createTextField1();
    createButton();
    createPanel();

    setSize(FRAME_WIDTH, FRAME_HEIGHT);
  }

  private void createTextField(){
    weightLabel = new JLabel("weight in lbs: ");

    weightField = new JTextField(15);
    weightField.setText("" + DEFAULT_WEIGHT);
  }

  private void createTextField1(){
    heightLabel = new JLabel("height in inches: ");

    heightField = new JTextField(15);
    heightField.setText("" + DEFAULT_HEIGHT);
  }

  class AddBMIListener implements ActionListener{
    public void actionPerformed(ActionEvent event){
      double weight = Double.parseDouble(weightField.getText());
      double height = Double.parseDouble(heightField.getText());
      finalBMI = weight / height / height * 703;
      resultLabel.setText("Final bmi: " + finalBMI);
      if(finalBMI < 18.5){
        healthLabel.setText("You are underweight. u should eat some more and get swoll");
      }
      else if(18.5 <= finalBMI && finalBMI <= 24.9){
        healthLabel.setText("You are at a normal weight, good job");
      }
      else{
        healthLabel.setText("you are overweight, stop eating");
      }
    }
  }

  private void createButton(){
    button = new JButton("find your bmi");
    ActionListener listener = new AddBMIListener();
    button.addActionListener(listener);
  }

  private void createPanel(){
    JPanel panel = new JPanel();
    panel.add(weightLabel);
    panel.add(weightField);
    panel.add(heightLabel);
    panel.add(heightField);
    panel.add(healthLabel);
    panel.add(button);
    panel.add(resultLabel);
    add(panel);
  }
}
