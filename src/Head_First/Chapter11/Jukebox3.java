package Head_First.Chapter11;

import java.util.Collections;
import java.util.List;

class Jukebox3 {
    public static void main(String[] args) {
	new Jukebox3().go();
    }

    public void go() {
	List<SongV3> songList = MockSongs.getSongV3();
	System.out.println(songList);
	Collections.sort(songList);
	System.out.println(songList);

    }

}