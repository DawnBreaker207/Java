package Chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

class MockSongs {

    public static List<String> getSongStrings() {
	List<String> songs = new ArrayList<>();
	songs.add("somersault");
	songs.add("cassidy");
	songs.add("$10");
	songs.add("havana");
	songs.add("Cassidy");
	songs.add("50 Ways");
	return songs;
    }

    public static List<SongV2> getSongV2() {
	List<SongV2> songs = new ArrayList<>();
	songs.add(new SongV2("somersault", "sero 7", 147));
	songs.add(new SongV2("cassidy", "grateful dead", 158));
	songs.add(new SongV2("$10", "hitchhiker", 140));

	songs.add(new SongV2("havana", "cabello", 105));
	songs.add(new SongV2("Cassidy", "grateful dead", 158));
	songs.add(new SongV2("50 ways", "simon", 102));
	return songs;
    }

    public static List<SongV3> getSongV3() {
	List<SongV3> songs = new ArrayList<>();
	songs.add(new SongV3("somersault", "sero 7", 147));
	songs.add(new SongV3("cassidy", "grateful dead", 158));
	songs.add(new SongV3("$10", "hitchhiker", 140));

	songs.add(new SongV3("havana", "cabello", 105));
	songs.add(new SongV3("Cassidy", "grateful dead", 158));
	songs.add(new SongV3("50 ways", "simon", 102));
	return songs;
    }

}
