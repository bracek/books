package headfirst.command.party;

public class LivingroomLightOnCommand implements Command {
	Light light;

	public LivingroomLightOnCommand(final Light light) {
		this.light = light;
	}
	public void execute() {
		light.on();
	}
	public void undo() {
		light.off();
	}
}
