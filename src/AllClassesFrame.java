import javax.swing.*;
import java.awt.event.*;

public class AllClassesFrame extends JFrame{
  int FRAME_WIDTH = 800;
  int FRAME_HEIGHT = 500;

  private WeightFrame weightframe;

  public void setWeightFrame(WeightFrame weightframe) {
    this.weightframe = weightframe;
    }

  private DistanceFrame distanceframe;

  public void setDistanceFrame(DistanceFrame distanceframe) {
    this.distanceframe = distanceframe;
    }

  private FibonacciFrame fibonacciframe;

  public void setFibonacciFrame(FibonacciFrame fibonacciframe){
    this.fibonacciframe = fibonacciframe;
    }

  private BMIFrame bmiframe;

  public void setBMIFrame(BMIFrame bmiframe){
    this.fibonacciframe = fibonacciframe;
    }

  JButton weightbutton;
  JButton distancebutton;
  JButton fibonaccibutton;
  JButton bmibutton;

  public AllClassesFrame(){
    createWeightButton();
    createDistanceButton();
    createFibButton();
    createBMIButton();
    createPanel();
    setSize(FRAME_WIDTH, FRAME_HEIGHT);
  }

  class AddWeightClassListener implements ActionListener{
    public void actionPerformed(ActionEvent event){
      JFrame weightframe = new WeightFrame();
      weightframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      weightframe.setTitle("weight converter");
      weightframe.setVisible(true);
    }
  }

  class AddDistanceClassListener implements ActionListener{
    public void actionPerformed(ActionEvent event){
      JFrame distanceframe = new DistanceFrame();
      distanceframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      distanceframe.setTitle("distance converter");
      distanceframe.setVisible(true);
    }
  }

  class AddFibonacciClassListener implements ActionListener{
    public void actionPerformed(ActionEvent event){
      JFrame fibonacciframe = new FibonacciFrame();
      fibonacciframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      fibonacciframe.setTitle("fibonacci calculator");
      fibonacciframe.setVisible(true);
    }
  }

  class AddBMIClassListener implements ActionListener{
    public void actionPerformed(ActionEvent event){
      JFrame bmiframe = new BMIFrame();
      bmiframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      bmiframe.setTitle("bmi calculator");
      bmiframe.setVisible(true);
    }
  }


  private void createWeightButton(){
    weightbutton = new JButton("weight converter");
    ActionListener listener = new AddWeightClassListener();
    weightbutton.addActionListener(listener);
  }

  private void createDistanceButton(){
    distancebutton = new JButton("distance converter");
    ActionListener listener = new AddDistanceClassListener();
    distancebutton.addActionListener(listener);
  }

  private void createFibButton(){
    fibonaccibutton = new JButton("fibonacci calculator");
    ActionListener listener = new AddFibonacciClassListener();
    fibonaccibutton.addActionListener(listener);
  }

  private void createBMIButton(){
    bmibutton = new JButton("bmi calculator");
    ActionListener listener = new AddBMIClassListener();
    bmibutton.addActionListener(listener);
  }

  private void createPanel(){
    JPanel panel = new JPanel();
    panel.add(weightbutton);
    panel.add(distancebutton);
    panel.add(fibonaccibutton);
    panel.add(bmibutton);
    add(panel);
  }
}
