package Head_First.Chapter11;

import java.util.Comparator;
import java.util.List;

class Jukebox5 {
    public static void main(String[] args) {
	new Jukebox5().go();
    }

    public void go() {
	List<SongV3> songList = MockSongs.getSongV3();
	System.out.println(songList);

	TitleCompare titleCompare = new TitleCompare();
//	songList.sort(titleCompare);
	songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
	System.out.println(songList);

	ArtistCompare artistCompare = new ArtistCompare();
//	songList.sort(artistCompare);
	songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
	
	System.out.println(songList);

////	Inner classes
//	songList.sort(new Comparator<SongV3>() {
//	    public int compare(SongV3 one, SongV3 two) {
//		return one.getTitle().compareTo(two.getTitle());
//	    }
//	});
//
////	Lambda expression
//	songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
    }

}

class TitleCompare implements Comparator<SongV3> {

    public int compare(SongV3 one, SongV3 two) {
	return one.getTitle().compareTo(two.getTitle());
    }

}

class ArtistCompare implements Comparator<SongV3> {

    public int compare(SongV3 one, SongV3 two) {
	return one.getArtist().compareTo(two.getArtist());
    }

}