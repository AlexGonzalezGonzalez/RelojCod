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
 * @author Alejandro
 */
public class Reloj {
    
    int hora;
    int minuto;
    int segundo;
    Timer timer;
    private int horas, minutos, segundos;

    /**
     *Constructor del reloj donde se crea un objeto timer y la accion de este es el timer task, con 0 delay(retardo) y se repite cada segundo.
     */
    public Reloj() {
        timer = new Timer();
        timer.schedule(new Tiempo(), 0, 1000);
    }

    /**
     *Clase Tiempo que coge la hora del sistema y la compara con la alarma, si es igual se muestra el mensaje ALARMA, sino, se muestra la hora cada segundo.
     */
    public class Tiempo extends TimerTask {

        /**
         *Metodo run del timerTask, es el metodo que se ejecuta con el tiempo predefinido que le hemos puesto en el constructor.
         */
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

    /**
     *Metodo alarma donde se piden las variables hora,minuto y segundo 
     */
    public void alarma() {
        hora = Integer.parseInt(JOptionPane.showInputDialog("alarma"));
        minuto = Integer.parseInt(JOptionPane.showInputDialog("alarma"));
        segundo = Integer.parseInt(JOptionPane.showInputDialog("alarma"));
    }
}
