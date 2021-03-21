import javax.swing.*;

public class BMIViewer{
  public static void main(String[] args){
    JFrame bmiframe = new BMIFrame();
    bmiframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    bmiframe.setTitle("bmi calculator");
    bmiframe.setVisible(true);
  }
}
