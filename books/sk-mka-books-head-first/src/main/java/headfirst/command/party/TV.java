package headfirst.command.party;

public class TV {
	String location;
	int channel;

	public TV(final String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " TV is on");
	}

	public void off() {
		System.out.println(location + " TV is off");
	}

	public void setInputChannel() {
		this.channel = 3;
		System.out.println(location + " TV channel is set for DVD");
	}
}
