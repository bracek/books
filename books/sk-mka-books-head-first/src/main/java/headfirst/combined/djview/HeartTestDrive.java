package headfirst.combined.djview;
  
public class HeartTestDrive {

    public static void main (final String[] args) {
		HeartModel heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }
}
