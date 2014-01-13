package headfirst.command.remote;

public class CeilingFanOffCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOffCommand(final CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.off();
	}
}
