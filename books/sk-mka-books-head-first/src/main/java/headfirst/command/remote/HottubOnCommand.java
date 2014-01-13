package headfirst.command.remote;

public class HottubOnCommand implements Command {
	Hottub hottub;

	public HottubOnCommand(final Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.on();
		hottub.heat();
		hottub.bubblesOn();
	}
}
