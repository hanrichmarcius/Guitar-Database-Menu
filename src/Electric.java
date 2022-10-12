//compositiondengan guitar karena tanpa guitar electric guitar tidak akan ada
public class Electric extends Guitar{ //inherit guitar type dan soundType
	private int switchPosition = 0, tone = 0, volume = 0;
	
	public Electric(String type, String soundType, int switchPosition, int tone, int volume) {
		super(type, soundType);
		this.switchPosition = switchPosition;
		this.tone = tone;
		this.volume = volume;
	}

	public int getSwitchPosition() {
		return switchPosition;
	}

	public void setSwitchPosition(int switchPosition) {
		this.switchPosition = switchPosition;
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
	};
	
	@Override //polymorphism penbamahan dari print di guitar
	void display() {
		super.display();
		System.out.println(" - " + switchPosition + " - " + tone + " - " + volume);
	}
	
}
