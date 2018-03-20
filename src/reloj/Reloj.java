/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author estudios
 */
public class Reloj {

    int hora;
    int minuto;
    int segundo;
    Timer timer;
    private int horas, minutos, segundos;

    public Reloj() {

        timer = new Timer();

        timer.schedule(new TicTac(), 0, 1000);
    }

    public class TicTac extends TimerTask {

        public void run() {

            Date date = new Date();
            horas = date.getHours();
            minutos = date.getMinutes();
            segundos = date.getSeconds();

            if (horas == hora && minutos == minuto && segundos == segundo) {
                System.out.println("ALARMA");
            } else {
                System.out.println(horas + ":" + minutos + ":" + segundos);
            }
        }

    }

    public void alarma() {

        hora = Integer.parseInt(JOptionPane.showInputDialog("alarma"));
        minuto = Integer.parseInt(JOptionPane.showInputDialog("alarma"));
        segundo = Integer.parseInt(JOptionPane.showInputDialog("alarma"));
    }
}
