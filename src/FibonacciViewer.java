import javax.swing.*;

public class FibonacciViewer{
  public static void main(String[] args){
    JFrame fibonacciframe = new FibonacciFrame();
    fibonacciframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fibonacciframe.setTitle("fibonacci calculator");
    fibonacciframe.setVisible(true);
  }
}
