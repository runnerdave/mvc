package net.runnerdave;

/**
 * Created by davidajimenez on 13/05/2017.
 */
public interface HeartModelInterface {
    int getHeartRate();
    void setHeartRate(int pulse);
    void registerBeatObserver();
    void registerBPMObserver();
}
