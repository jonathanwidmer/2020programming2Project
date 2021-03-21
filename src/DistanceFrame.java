import java.awt.event.*;
import javax.swing.*;

public class DistanceFrame extends JFrame{
  int FRAME_WIDTH = 800;
  int FRAME_HEIGHT = 500;

  private AllClassesFrame allclassesframe;

  public void setAllClassesFrame(AllClassesFrame allclassesframe){
    this.allclassesframe = allclassesframe;
  }
  public void diplay(){
    allclassesframe.setVisible(true);
  }

  double DEFAULT_DISTANCE = 10;

  JLabel distanceLabel;
  JTextField distanceField;
  JButton button;
  JLabel resultLabel;
  double finalDistance;

  public DistanceFrame(){
    resultLabel = new JLabel("distance in feet: " + finalDistance);

    createTextField();
    createButton();
    createPanel();

    setSize(FRAME_WIDTH, FRAME_HEIGHT);
  }

  private void createTextField(){
    distanceLabel = new JLabel("distance in miles: ");

    distanceField = new JTextField(15);
    distanceField.setText("" + DEFAULT_DISTANCE);
  }

  class AddDistanceListener implements ActionListener{
    public void actionPerformed(ActionEvent event){
      double distance = Double.parseDouble(distanceField.getText());
      finalDistance = distance * 5280;
      resultLabel.setText("Final distance: " + finalDistance);
    }
  }

  private void createButton(){
    button = new JButton("Convert miles to feet");
    ActionListener listener = new AddDistanceListener();
    button.addActionListener(listener);
  }

  private void createPanel(){
    JPanel panel = new JPanel();
    panel.add(distanceLabel);
    panel.add(distanceField);
    panel.add(button);
    panel.add(resultLabel);
    add(panel);
  }
}
