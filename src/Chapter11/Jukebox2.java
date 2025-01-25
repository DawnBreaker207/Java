package Chapter11;

import java.util.Collections;
import java.util.List;

class Jukebox2 {
    public static void main(String[] args) {
	new Jukebox2().go();
    }

    public void go() {
	List<SongV2> songList = MockSongs.getSongV2();
	System.out.println(songList);
	Collections.sort(songList);
	System.out.println(songList);
    }

}