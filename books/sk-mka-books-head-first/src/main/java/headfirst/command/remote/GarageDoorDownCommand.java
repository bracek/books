package headfirst.command.remote;

public class GarageDoorDownCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorDownCommand(final GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}
}
