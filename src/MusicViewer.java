import javax.swing.*;

public class MusicViewer{
  public static void main(String[] args){
    JFrame musicframe = new MusicFrame();
    musicframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    musicframe.setTitle("Music Player");
    musicframe.setVisible(true);
  }
}
