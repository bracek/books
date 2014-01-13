package headfirst.command.undo;

public class DimmerLightOffCommand implements Command {
	Light light;
	int prevLevel;

	public DimmerLightOffCommand(final Light light) {
		this.light = light;
		prevLevel = 100;
	}

	public void execute() {
		prevLevel = light.getLevel();
		light.off();
	}

	public void undo() {
		light.dim(prevLevel);
	}
}
