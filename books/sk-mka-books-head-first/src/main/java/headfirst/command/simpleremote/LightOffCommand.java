package headfirst.command.simpleremote;

public class LightOffCommand implements Command {
	Light light;
 
	public LightOffCommand(final Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.off();
	}
}
