/**
class for viewing the MusicFrame
@param user button clicks
@return the music playing, stopping, restarting, or ending
*/
/**
import statements
*/
import javax.swing.*;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;

public class MusicViewer{
  public static void main(String[] args){
    try {
      /**
      constructs a JFrame for viewing the MusicFrame
      */
      JFrame musicframe = new MusicFrame();
      musicframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      musicframe.setTitle("Music Player");
      musicframe.setVisible(true);
    } catch (IOException | LineUnavailableException e) {
      e.printStackTrace();
    }
  }
}
