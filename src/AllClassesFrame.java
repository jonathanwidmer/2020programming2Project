/**
a class for viewing all classes of the project
@param clicking a button to go to that specific classes
@return going to the class you clicked on
*/

/**
import statements
*/
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;

public class AllClassesFrame extends JFrame{
  int FRAME_WIDTH = 800;
  int FRAME_HEIGHT = 500;

/**
references to other classes
*/
  private WeightFrame weightframe;
/**
makes weight frame object
*/
  public void setWeightFrame(WeightFrame weightframe) {
    this.weightframe = weightframe;
    }

  private DistanceFrame distanceframe;
/**
makes distance frame object
*/
  public void setDistanceFrame(DistanceFrame distanceframe) {
    this.distanceframe = distanceframe;
    }

  private FibonacciFrame fibonacciframe;
/**
makes fibonacci frame object
*/
  public void setFibonacciFrame(FibonacciFrame fibonacciframe){
    this.fibonacciframe = fibonacciframe;
    }

  private BMIFrame bmiframe;
/**
makes bmi frame object
*/
  public void setBMIFrame(BMIFrame bmiframe){
    this.bmiframe = bmiframe;
    }

  private MusicFrame musicframe;
/**
makes music frame object
*/
  public void setMusicFrame(MusicFrame musicframe){
    this.musicframe = musicframe;
  }
/**
buttons for going to specific classes
*/
  JButton weightbutton;
  JButton distancebutton;
  JButton fibonaccibutton;
  JButton bmibutton;
  JButton musicbutton;

/**
constructor
*/
  public AllClassesFrame(){
    createWeightButton();
    createDistanceButton();
    createFibButton();
    createBMIButton();
    createMusicButton();
    createPanel();
    setSize(FRAME_WIDTH, FRAME_HEIGHT);
  }

  class AddWeightClassListener implements ActionListener{
    /**
    method for performing action
    */
    public void actionPerformed(ActionEvent event){
      JFrame weightframe = new WeightFrame();
      weightframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      weightframe.setTitle("weight converter");
      weightframe.setVisible(true);
    }
  }
/**
class logic and button logic (lines 82 - 150)
*/
  class AddDistanceClassListener implements ActionListener{
    /**
    method for performing action
    */
    public void actionPerformed(ActionEvent event){
      JFrame distanceframe = new DistanceFrame();
      distanceframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      distanceframe.setTitle("distance converter");
      distanceframe.setVisible(true);
    }
  }

  class AddFibonacciClassListener implements ActionListener{
    /**
    method for performing action
    */
    public void actionPerformed(ActionEvent event){
      JFrame fibonacciframe = new FibonacciFrame();
      fibonacciframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      fibonacciframe.setTitle("fibonacci calculator");
      fibonacciframe.setVisible(true);
    }
  }

  class AddBMIClassListener implements ActionListener{
    /**
    method for performing action
    */
    public void actionPerformed(ActionEvent event){
      JFrame bmiframe = new BMIFrame();
      bmiframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      bmiframe.setTitle("bmi calculator");
      bmiframe.setVisible(true);
    }
  }

  class AddMusicClassListener implements ActionListener{
    /**
    method for performing action
    */
    public void actionPerformed(ActionEvent event){
      try {
        JFrame musicframe = new MusicFrame();
        musicframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        musicframe.setTitle("music player");
        musicframe.setVisible(true);
      } catch (IOException | LineUnavailableException e) {
        e.printStackTrace();
      }
    }
  }
/**
creates button to calculate weight
*/
  private void createWeightButton(){
    weightbutton = new JButton("weight converter");
    ActionListener listener = new AddWeightClassListener();
    weightbutton.addActionListener(listener);
  }
/**
creates button to calculate distance
*/
  private void createDistanceButton(){
    distancebutton = new JButton("distance converter");
    ActionListener listener = new AddDistanceClassListener();
    distancebutton.addActionListener(listener);
  }
/**
creates button to calculate fibonacci number
*/
  private void createFibButton(){
    fibonaccibutton = new JButton("fibonacci calculator");
    ActionListener listener = new AddFibonacciClassListener();
    fibonaccibutton.addActionListener(listener);
  }
/**
creates button to calculate BMI
*/
  private void createBMIButton(){
    bmibutton = new JButton("bmi calculator");
    ActionListener listener = new AddBMIClassListener();
    bmibutton.addActionListener(listener);
  }
/**
creates button to do music stuff
*/
  private void createMusicButton(){
    musicbutton = new JButton("music player");
    ActionListener listener = new AddMusicClassListener();
    musicbutton.addActionListener(listener);
  }
/**
creates the panel for viewing class options
*/
  private void createPanel(){
    JPanel panel = new JPanel();
    panel.add(weightbutton);
    panel.add(distancebutton);
    panel.add(fibonaccibutton);
    panel.add(bmibutton);
    panel.add(musicbutton);
    add(panel);
  }
}
