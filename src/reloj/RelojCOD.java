package reloj;

import java.awt.Toolkit;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.sound.sampled.AudioSystem;
import javax.swing.JOptionPane;

public class RelojCOD {
    

    public static void main(String[] args) throws InterruptedException {
     
     Reloj r= new Reloj();
     r.alarma();
     
    }
}