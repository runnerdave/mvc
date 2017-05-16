package net.runnerdave;

import java.util.ArrayList;

/**
 * Created by davidajimenez on 13/05/2017.
 */
public class HeartModelAdapter implements BeatModelInterface {

    HeartModelInterface heartModel;
    ArrayList<BeatObserver> beatObservers = new ArrayList<>();
    ArrayList<BPMObserver> bpmObservers = new ArrayList<>();

    public HeartModelAdapter(HeartModelInterface heartModel) {
        this.heartModel = heartModel;
    }

    @Override
    public void initialize() {

    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public void setBPM(int bpm) {
        heartModel.setHeartRate(bpm);
    }

    @Override
    public int getBPM() {
        return heartModel.getHeartRate();
    }

    @Override
    public void registerObserver(BeatObserver o) {
        beatObservers.add(o);
    }

    @Override
    public void removeObserver(BeatObserver o) {
        beatObservers.remove(o);
    }

    @Override
    public void registerObserver(BPMObserver o) {
        bpmObservers.add(o);
    }

    @Override
    public void removeObserver(BPMObserver o) {
        bpmObservers.remove(o);
    }
}
