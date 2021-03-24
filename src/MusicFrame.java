/**
a class for playing music
@param a button click
@return the music being played, stopped, restarted, or ended
*/
/**
import statements
*/
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.event.*;

public class MusicFrame extends JFrame{
  int FRAME_WIDTH = 800;
  int FRAME_HEIGHT = 500;

  /**
  reference to AllClassesFrame
  */
  private AllClassesFrame allclassesframe;

  public void setAllClassesFrame(AllClassesFrame allclassesframe){
    this.allclassesframe = allclassesframe;
  }

  /**
  buttons for operating music and going back to the AllClassesViewer
  */
  JButton start;
  JButton stop;
  JButton restart;
  JButton quit;
  JButton back;

  /**
  constructor uses FILE AND EXCEPTION HANDLING
  */
  public MusicFrame() throws IOException, LineUnavailableException{
    File file = new File("Confutatis_V2.wav");
    try {
  AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
  Clip clip = AudioSystem.getClip();
  clip.open(audioStream);
/**
button logic (lines 49 - 100) music takes a couple seconds to start playing, song is Confutatis Maledictis from Mozart Requiem, if you upload your own file, make sure it is 16 bit 44100 KHz and also a .wav file
*/
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

  class GoBack implements ActionListener{
    public void actionPerformed(ActionEvent event){
      JFrame allclassesframe = new AllClassesFrame();
      allclassesframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      allclassesframe.setTitle("class selection");
      allclassesframe.setVisible(true);
    }
  }

  start = new JButton("Start music");
  ActionListener listener = new AddMusicPlayer();
  start.addActionListener(listener);

  stop = new JButton("Stop music");
  ActionListener listener1 = new AddMusicStopper();
  stop.addActionListener(listener1);

  restart = new JButton("restart music");
  ActionListener listener2 = new AddMusicReplayer();
  restart.addActionListener(listener2);

  quit = new JButton("end music");
  ActionListener listener3 = new AddMusicQuitter();
  quit.addActionListener(listener3);

  back = new JButton("go back");
  ActionListener listener4 = new GoBack();
  back.addActionListener(listener4);

  /**
  creates visible panel for viewing buttons
  */
  JPanel panel = new JPanel();
  panel.add(start);
  panel.add(stop);
  panel.add(restart);
  panel.add(quit);
  panel.add(back);
  add(panel);
  setSize(FRAME_WIDTH, FRAME_HEIGHT);
} catch (UnsupportedAudioFileException e) {
  e.printStackTrace();
}

}
}
