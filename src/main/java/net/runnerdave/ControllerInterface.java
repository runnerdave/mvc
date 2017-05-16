package net.runnerdave;

/**
 * Created by davidajimenez on 24/04/2017.
 */
public interface ControllerInterface {
    void start();

    void stop();

    void increaseBPM();

    void decreaseBPM();

    void setBPM(int bpm);
}
