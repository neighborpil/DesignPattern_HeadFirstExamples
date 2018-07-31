package Com.Remote;

public class Stereo {
	String location;
	
	public Stereo(String location) {
		this.location = location;
	}
	
	public void on() {
		System.out.println(location + " stereo is on.");
	}
	
	public void off() {
		System.out.println(location + " stereo is off");
	}
	
	public void setDVD() {
		System.out.println(location + " stereo is set for DVD input");
	}
	
	public void setRadio(){
		System.out.println(location + " stereo is set for radio");
	}
	
	public void setVolume(int volume) {
		System.out.println(location + " stereo volumn set to " + volume);
	}
}
