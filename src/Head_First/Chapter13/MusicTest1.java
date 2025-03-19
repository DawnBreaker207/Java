package Head_First.Chapter13;

import javax.sound.midi.*;

public class MusicTest1 {

    public void play() {
	try {
	    Sequencer sequencer = MidiSystem.getSequencer();
	    System.out.println("Successtfully got a sequencer");
	} catch (MidiUnavailableException e) {
	    System.out.println("Bummer");
	}
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	MusicTest1 mt = new MusicTest1();
	mt.play();
    }

}
