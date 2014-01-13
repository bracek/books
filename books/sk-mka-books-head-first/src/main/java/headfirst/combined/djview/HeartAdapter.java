package headfirst.combined.djview;

public class HeartAdapter implements BeatModelInterface {
	HeartModelInterface heart;
 
	public HeartAdapter(final HeartModelInterface heart) {
		this.heart = heart;
	}

    public void initialize() {}
  
    public void on() {}
  
    public void off() {}
   
	public int getBPM() {
		return heart.getHeartRate();
	}
  
    public void setBPM(final int bpm) {}
   
	public void registerObserver(final BeatObserver o) {
		heart.registerObserver(o);
	}
    
	public void removeObserver(final BeatObserver o) {
		heart.removeObserver(o);
	}
     
	public void registerObserver(final BPMObserver o) {
		heart.registerObserver(o);
	}
  
	public void removeObserver(final BPMObserver o) {
		heart.removeObserver(o);
	}
}
