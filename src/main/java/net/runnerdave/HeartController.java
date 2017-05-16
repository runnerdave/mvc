package net.runnerdave;

/**
 * Created by davidajimenez on 15/05/2017.
 */
public class HeartController implements ControllerInterface {
    DJView view;
    HeartModelInterface model;

    public HeartController(HeartModelInterface model) {
        this.model = model;
        view = new DJView(this, new HeartModelAdapter(model));
        view.createView();
        view.createControls();
        view.disableStartMenuItem();
        view.disableStopMenuItem();
    }


    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void increaseBPM() {

    }

    @Override
    public void decreaseBPM() {

    }

    @Override
    public void setBPM(int bpm) {

    }
}
