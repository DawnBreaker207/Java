package Chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Jukebox4 {
    public static void main(String[] args) {
	new Jukebox4().go();
    }

    public void go() {
	List<SongV3> songList = MockSongs.getSongV3();
	System.out.println(songList);

	Collections.sort(songList);
	System.out.println(songList);

	ArtistCompare artistCompare = new ArtistCompare();
	songList.sort(artistCompare);
	System.out.println(songList);
    }

}

class SongV2 {
    private String title;
    private String artist;
    private int bpm;

    SongV2(String title, String artist, int bpm) {
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

    public String toString() {
	return title;
    }
}

class SongV3 implements Comparable<SongV3> {
    private String title;
    private String artist;
    private int bpm;

    public int compareTo(SongV3 s) {
	return title.compareTo(s.getTitle());
    }

    SongV3(String title, String artist, int bpm) {
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

    public String toString() {
	return title;
    }
}

class ArtistCompare implements Comparator<SongV3> {

    public int compare(SongV3 one, SongV3 two) {
	return one.getArtist().compareTo(two.getArtist());
    }

}
