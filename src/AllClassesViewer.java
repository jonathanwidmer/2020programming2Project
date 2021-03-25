/**
a class for viewing all classes, uses logic from AllClassesFrame
@param a button click
@return going to that class
*/


/**
import statement
*/
import javax.swing.*;

public class AllClassesViewer{
  public static void main(String[] args){
    /**
    constructs a JFrame with all class buttons set visible
    */
    JFrame allclassesframe = new AllClassesFrame();
    allclassesframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    allclassesframe.setTitle("class selection");
    allclassesframe.setVisible(true);
  }
}
