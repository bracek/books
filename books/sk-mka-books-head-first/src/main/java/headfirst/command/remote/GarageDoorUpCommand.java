package headfirst.command.remote;

public class GarageDoorUpCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorUpCommand(final GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}
}
