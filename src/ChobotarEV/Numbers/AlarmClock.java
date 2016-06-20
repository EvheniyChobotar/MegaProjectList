package ChobotarEV.Numbers;

import java.applet.Applet;
import java.applet.AudioClip;
import java.util.Date;
/*
 A simple clock where it plays a sound after X number of minutes/seconds or at a particular time.
*/
public class AlarmClock {
    
    private long currentHours;
    private long currentMinutes;
    
    public AlarmClock(int alarmHour,int alarmMinutes) {
        currentHours    = new Date(System.currentTimeMillis()).getHours();
        currentMinutes  = new Date(System.currentTimeMillis()).getMinutes();
        System.err.println(currentHours+":"+currentMinutes+" now");
        System.err.println("alarm at "+alarmHour+":"+alarmMinutes);
        
        if(currentHours==alarmHour && currentMinutes==alarmMinutes) {
            AudioClip clip = Applet.newAudioClip(this.getClass().getClassLoader().getResource("audio.wav"));
            clip.play();
        }
    }
    
}
