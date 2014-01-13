package headfirst.command.undo;

public class DimmerLightOnCommand implements Command {
	Light light;
	int prevLevel;

	public DimmerLightOnCommand(final Light light) {
		this.light = light;
	}

	public void execute() {
		prevLevel = light.getLevel();
		light.dim(75);
	}

	public void undo() {
		light.dim(prevLevel);
	}
}
