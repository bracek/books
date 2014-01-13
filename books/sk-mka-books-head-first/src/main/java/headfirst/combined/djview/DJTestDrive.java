package headfirst.combined.djview;
  
public class DJTestDrive {

    public static void main (final String[] args) {
        BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new BeatController(model);
    }
}
