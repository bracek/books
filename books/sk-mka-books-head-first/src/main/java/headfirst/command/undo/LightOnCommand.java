package headfirst.command.undo;

public class LightOnCommand implements Command {
	Light light;
	int level;
	public LightOnCommand(final Light light) {
		this.light = light;
	}
 
	public void execute() {
        level = light.getLevel();
		light.on();
	}
 
	public void undo() {
		light.dim(level);
	}
}
