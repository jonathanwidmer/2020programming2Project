/**
class for viewing the FibonacciFrame
@param user entered number and button click
@return that number in the Fibonacci sequence
*/
/**
import statement
*/
import javax.swing.*;

public class FibonacciViewer{
  public static void main(String[] args){
    /**
    constructs a JFrame for viewing the FibonacciFrame
    */
    JFrame fibonacciframe = new FibonacciFrame();
    fibonacciframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fibonacciframe.setTitle("fibonacci calculator");
    fibonacciframe.setVisible(true);
  }
}
