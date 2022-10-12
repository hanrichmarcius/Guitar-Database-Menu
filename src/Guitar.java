
public class Guitar {
	private String type;
	private String soundType;

	
	public Guitar(String type, String soundType) {
		super();
		this.type = type;
		this.soundType = soundType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSoundType() {
		return soundType;
	}

	public void setSoundType(String soundType) {
		this.soundType = soundType;
	}
	
	void display() { //display semua elemen yang ada di guitar
		System.out.print(type + " - " + soundType);
	}
	
}
