package Head_First.Chapter11;

import java.util.Collections;
import java.util.List;

class Jukebox1 {
    public static void main(String[] args) {
	new Jukebox1().go();
    }

    public void go() {
	List<String> songList = MockSongs.getSongStrings();
	System.out.println(songList);
	Collections.sort(songList);
	System.out.println(songList);
    }

}
