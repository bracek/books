package headfirst.command.remote;

public class StereoOffCommand implements Command {
	Stereo stereo;
 
	public StereoOffCommand(final Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.off();
	}
}
