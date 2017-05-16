package net.runnerdave;

/**
 * Created by davidajimenez on 15/05/2017.
 */
public class HeartModelTestDrive {
    public static void main(String[] args) {
        HeartModelInterface hm = new HeartModel();
        ControllerInterface controller = new HeartController(hm);
    }
}
