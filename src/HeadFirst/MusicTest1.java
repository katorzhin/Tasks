package HeadFirst;


import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTest1 {
    public void play() {
        try {
            Sequencer seqencer = MidiSystem.getSequencer();
            System.out.println(" Успешно получили синтезатор ");
        } catch (MidiUnavailableException ex) {
            System.out.println("Неудачка");
        }
    }

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }


}

