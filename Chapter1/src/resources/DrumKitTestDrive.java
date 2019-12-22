package resources;

public class DrumKitTestDrive {
	public static void main (String[] args) {
		DrumKit drum = new DrumKit();
		
		drum.playSnare();
		drum.snare = true;
		drum.playTopHat();
		
		if (drum.snare == false) {
			drum.playSnare();
		}
	}
}
