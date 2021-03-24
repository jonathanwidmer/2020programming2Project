/**
class for viewing the WeightFrame
@param user entered number in pounds and button click
@return that number in kilograms
*/
/**
import statement
*/
import javax.swing.*;

public class WeightViewer{
  public static void main(String[] args){
    /**
    constructs a JFrame for viewing the WeightFrame
    */
    JFrame weightframe = new WeightFrame();
    weightframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    weightframe.setTitle("weight converter");
    weightframe.setVisible(true);
  }
}
