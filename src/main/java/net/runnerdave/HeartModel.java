package net.runnerdave;

/**
 * Created by davidajimenez on 13/05/2017.
 */
public class HeartModel implements HeartModelInterface {

    int pulse;

    public int getHeartRate() {
        return pulse;
    }

    @Override
    public void setHeartRate(int pulse) {
        this.pulse = pulse;
    }

    public void registerBeatObserver(){
        System.out.println("register my heart with Beat Obs");
    }

    public void registerBPMObserver() {
        System.out.println("register my heart with BPM obs");
    }
}
