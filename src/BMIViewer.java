/**
class for viewing the BMIFrame
@param user entered number in pounds, user entered number in inches, and a button click
@return the BMI according to the user's entry
*/
/**
import statement
*/
import javax.swing.*;

public class BMIViewer{
  public static void main(String[] args){
    /**
    constructs a JFrame for viewing the BMIFrame
    */
    JFrame bmiframe = new BMIFrame();
    bmiframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    bmiframe.setTitle("bmi calculator");
    bmiframe.setVisible(true);
  }
}
