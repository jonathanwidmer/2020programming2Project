/**
a class for converting distance in miles to feet
@param a number of miles entered in a text field by the user
@return the distance in feet of the miles in the text field
*/

/**
import statements
*/
import java.awt.event.*;
import javax.swing.*;

/**
class implements Interface
*/
public class DistanceFrame extends JFrame implements Interface{
  int FRAME_WIDTH = 800;
  int FRAME_HEIGHT = 500;

/**
reference to AllClassesFrame
*/
  private AllClassesFrame allclassesframe;

  public void setAllClassesFrame(AllClassesFrame allclassesframe){
    this.allclassesframe = allclassesframe;
  }
/**
default value to put in the text field
*/
  double DEFAULT_DISTANCE = 10;
/**
buttons, textfield, labels, and results
*/
  JLabel distanceLabel;
  JTextField distanceField;
  JButton button;
  JButton back;
  JLabel resultLabel;
  double finalDistance;

/**
constructor
*/
  public DistanceFrame(){
    resultLabel = new JLabel("distance in feet: " + finalDistance);

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
    distanceLabel = new JLabel("distance in miles: ");

    distanceField = new JTextField(15);
    distanceField.setText("" + DEFAULT_DISTANCE);
  }
/**
button logic (lines 65 - 92)
*/
  class AddDistanceListener implements ActionListener{
    public void actionPerformed(ActionEvent event){
      double distance = Double.parseDouble(distanceField.getText());
      finalDistance = distance * 5280;
      resultLabel.setText("Final distance: " + finalDistance);
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

  public void createButton(){
    button = new JButton("Convert miles to feet");
    ActionListener listener = new AddDistanceListener();
    button.addActionListener(listener);
  }

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
    panel.add(distanceLabel);
    panel.add(distanceField);
    panel.add(button);
    panel.add(back);
    panel.add(resultLabel);
    add(panel);
  }
}
