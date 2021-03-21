import java.awt.event.*;
import javax.swing.*;

public class WeightFrame extends JFrame{
  int FRAME_WIDTH = 800;
  int FRAME_HEIGHT = 500;

  private AllClassesFrame allclassesframe;

  public void setAllClassesFrame(AllClassesFrame allclassesframe){
    this.allclassesframe = allclassesframe;
  }
  public void diplay(){
    allclassesframe.setVisible(true);
  }

  double DEFAULT_WEIGHT = 10;

  JLabel weightLabel;
  JTextField weightField;
  JButton button;
  JLabel resultLabel;
  double finalWeight;

  public WeightFrame(){
    resultLabel = new JLabel("weight in kg: " + finalWeight);

    createTextField();
    createButton();
    createPanel();

    setSize(FRAME_WIDTH, FRAME_HEIGHT);
  }

  private void createTextField(){
    weightLabel = new JLabel("weight in lbs: ");

    weightField = new JTextField(15);
    weightField.setText("" + DEFAULT_WEIGHT);
  }

  class AddWeightListener implements ActionListener{
    public void actionPerformed(ActionEvent event){
      double weight = Double.parseDouble(weightField.getText());
      finalWeight = weight / 2.205;
      resultLabel.setText("Final weight: " + finalWeight);
    }
  }

  private void createButton(){
    button = new JButton("Convert lbs to kg");
    ActionListener listener = new AddWeightListener();
    button.addActionListener(listener);
  }

  private void createPanel(){
    JPanel panel = new JPanel();
    panel.add(weightLabel);
    panel.add(weightField);
    panel.add(button);
    panel.add(resultLabel);
    add(panel);
  }
}
