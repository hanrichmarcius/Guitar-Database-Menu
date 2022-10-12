//compositiondengan guitar karena tanpa guitar acoustic electric guitar tidak akan ada
public class AcousticElectric extends Guitar{ //inherit guitar type dan soundType
	private int tone = 0, volume = 0;
	
	public AcousticElectric(String type, String soundType, int tone, int volume) {
		super(type, soundType);
		this.tone = tone;
		this.volume = volume;
	}
	public int getTone() {
		return tone;
	}
	public void setTone(int tone) {
		this.tone = tone;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	@Override //polymorphism penbamahan dari print di guitar
	void display() {
		super.display();
		System.out.println(" - " + tone + " - " + volume);
	}
	
}
