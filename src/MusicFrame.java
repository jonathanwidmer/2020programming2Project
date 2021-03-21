import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.event.*;

public class MusicFrame extends JFrame{
  int FRAME_WIDTH = 800;
  int FRAME_HEIGHT = 500;

  JButton start;
  JButton stop;
  JButton restart;
  JButton quit;



  public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
    File file = new File("monkeytypebeat.wav");
    AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
    Clip clip = AudioSystem.getClip();
    clip.open(audioStream);
  }


  public MusicFrame(){
    createStartButton();
    createStopButton();
    createRestartButton();
    createQuitButton();
    createPanel();
    setSize(FRAME_WIDTH, FRAME_HEIGHT);
  }

  class AddMusicPlayer implements ActionListener{
    public void actionPerformed(ActionEvent event){
      clip.start();
    }
  }

  class AddMusicStopper implements ActionListener{
    public void actionPerformed(ActionEvent event){
      clip.stop();
    }
  }

  class AddMusicReplayer implements ActionListener{
    public void actionPerformed(ActionEvent event){
      clip.setMicrosecondPosition(0);
    }
  }

  class AddMusicQuitter implements ActionListener{
    public void actionPerformed(ActionEvent event){
      clip.close();
    }
  }

  private void createStartButton(){
    start = new JButton("Start music");
    ActionListener listener = new AddMusicPlayer();
    start.addActionListener(listener);
  }
  private void createStopButton(){
    stop = new JButton("Stop music");
    ActionListener listener = new AddMusicStopper();
    stop.addActionListener(listener);
  }
  private void createRestartButton(){
    restart = new JButton("restart music");
    ActionListener listener = new AddMusicReplayer();
    restart.addActionListener(listener);
  }
  private void createQuitButton(){
    quit = new JButton("end music");
    ActionListener listener = new AddMusicQuitter();
    quit.addActionListener(listener);
  }

  private void createPanel(){
    JPanel panel = new JPanel();
    panel.add(start);
    panel.add(stop);
    panel.add(restart);
    panel.add(quit);
    add(panel);
  }
}