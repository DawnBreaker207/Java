package Chapter11;

import java.util.*;

class Jukebox8 {
    public static void main(String[] args) {
	new Jukebox8().go();
    }

    public void go() {
	List<SongV4> songList = MockMoreSongs.getSongV4();
	System.out.println(songList);

	songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
	System.out.println(songList);

//	Set<SongV4> songSet = new HashSet<>(songList);
//	Set<SongV4> songSet = new TreeSet<>(songList);
	Set<SongV4> songSet = new TreeSet<>((o1, o2) -> o1.getBpm() - o2.getBpm());
	songSet.addAll(songList);
	System.out.println(songSet);
    }

}

class SongV4 implements Comparable<SongV4> {
    private String title;
    private String artist;
    private int bpm;
  
    public boolean equals(Object aSong) {
	SongV4 other = (SongV4) aSong;
	return title.equals(other.getTitle());
    }

    public int hashCode() {
	return title.hashCode();
    }

    public int compareTo(SongV4 s) {
	return title.compareTo(s.getTitle());
    }

    public String toString() {
	return title;
    }

    SongV4(String title, String artist, int bpm) {
	this.title = title;
	this.artist = artist;
	this.bpm = bpm;
    }

    public String getTitle() {
	return title;
    }

    public String getArtist() {
	return artist;

    }

    public int getBpm() {
	return bpm;

    }

}
