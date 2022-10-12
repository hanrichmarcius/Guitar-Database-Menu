//composition dengan guitar karena tanpa guitar acoustic guitar tidak akan ada
public class Acoustic extends Guitar { //inherit guitar type dan soundType

	public Acoustic(String type, String soundType) {
		super(type, soundType);
	}
	
	@Override //polymorphism penbamahan dari print di guitar
	void display() {
		super.display();
		System.out.println("");
	}

}
