package headfirst.command.remote;

public class HottubOffCommand implements Command {
	Hottub hottub;

	public HottubOffCommand(final Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.cool();
		hottub.off();
	}
}
