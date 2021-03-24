/**
class for viewing the DistanceFrame
@param user entered number and button click
@return the entered number of miles in feet
*/
/**
import statement
*/
import javax.swing.*;

public class DistanceViewer{
  public static void main(String[] args){
    /**
    constructs a JFrame for viewing the DistanceFrame
    */
    JFrame distanceframe = new DistanceFrame();
    distanceframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    distanceframe.setTitle("distance converter");
    distanceframe.setVisible(true);
  }
}
