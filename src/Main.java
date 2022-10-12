import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static Scanner scan = new Scanner (System.in); //buat function scanner untuk menerima input
	public static Random rand = new Random(); //buat function random untuk merandom angka
	public static ArrayList<Guitar> guitar = new ArrayList<>(); //array list untuk menampung guitar yang telah dibuat

	
	//jika user memilih build guitar dan memilih acoustic
	public static void acoustic() {
		String[] soundType = {"warm","bright"}; // array yang menampung soundType dari guitar acoustic yang akan dirandom
		Acoustic acoustic = new Acoustic("Acoustic Guitar", null); //buat guitar acoustic baru
		acoustic.setSoundType(soundType[rand.nextInt(2)]); //random angka untuk dipakai untuk index string ssehingga mendapatkan angka 0,1 karena batasnya adalah 2
		guitar.add(acoustic); //insert guitar acoustic ke array list
		//System.out.println(Acoustic.getSoundType()); //testrandom
	}
	
	//jika user memilih build guitar dan memilih electric
	public static void electric() {
		String[] soundType = {"Funk","Jazz","Blues","Rock"}; // array yang menampung soundType dari guitar electric yang akan dirandom
		Electric electric = new Electric("Electric Guitar", null, 0, 0, 0); // buat guitar electric baru
		electric.setSoundType(soundType[rand.nextInt(4)]); //random angka untuk mendapatkan angka index 
		System.out.print("Input switch position: "); //menerima input switch position
		electric.setSwitchPosition(scan.nextInt()); scan.nextLine();
		System.out.print("Input tone: "); //menerima input tone guitar
		electric.setTone(scan.nextInt()); scan.nextLine();
		System.out.print("Input volume: "); //menerima input volume guitar
		electric.setVolume(scan.nextInt()); scan.nextLine(); // menerima input volumr guitar
		guitar.add(electric);
	}

	//jika user memilih build guitar dan memilih acousticElectric
	public static void acousticElectric() {
		AcousticElectric acousticElectric = new AcousticElectric("Acoustic Electric Guitar", "crunch", 0, 0); // set default acoustic electric soungtype crunch
		guitar.add(acousticElectric);// add ke array list
	}
	
	//jika user memilih build guitar
	public static void build () {
		
		int temp = 0;
		
		//print pilihan guitar
		System.out.println("1. Acoustic");
		System.out.println("2. Electric");
		System.out.println("3. Acoustic Electric");
		System.out.print("Input guitar type {1..3} : ");
		
		//scan pilihan
		temp = scan.nextInt(); scan.nextLine();

		//case untuk masing-masing pilihan
		switch(temp) {
		case 1:
			acoustic();
			break;
		case 2:
			electric();
			break;
		case 3:
			acousticElectric();
			break;
		}
	}

	//jika user memilih display guitar
	public static void display() {
		
		System.out.println("[GuitarType] - [GuitarSoundType] - [Tone] - [Volume] - [SwitchPosition]");
		
		for(int i = 0; i < guitar.size(); i++) {
			guitar.get(i).display(); // display guitar yang sudah diinput 
//			System.out.println(guitar.get(i).getType() + " - " + guitar.get(i).getSoundType() + " - " + guitar.get(i).getTone() + " - " + guitar.get(i).getVolume() 
//					+ " - " + guitar.get(i).getSwitchPosition());
		}
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 0;
		
		//loop menu sampe exit atau pilihan 3
		do {
			System.out.println("1. Build Guitar");
			System.out.println("2. Display List of Guitar");
			System.out.println("3. Exit");
			System.out.print("Choose menu [1..3] : ");
			
			//terma pilihan
			input = scan.nextInt(); scan.nextLine();
			
			// jalan sesuai input yang diterima
			switch(input) {
			case 1:
				build();
				break;
			case 2 :
				display();
				break;
			}
		}while (input != 3);
	}
}

