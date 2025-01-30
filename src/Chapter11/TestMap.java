package Chapter11;

import java.util.*;

public class TestMap {

    public static void main(String[] args) {
//	Map use key value pair
	Map<String, Integer> scores = new HashMap<>();

	scores.put("Kathy", 42);
	scores.put("Bert", 343);
	scores.put("Skyler", 420);

	System.out.println(scores);
	System.out.println(scores.get("Bert"));

//	List<String> songs = new ArrayList<>();
//	songs.add("somersault");
//	songs.add("cassidy");
//	songs.add("$10");
//	
//	Return a list that unchangable
//	return Collections.unmodifiableList(songs);

	List<String> strings = List.of("somersault", "cassidy", "$10");

	Set<Book> books = Set.of(new Book("How Cat Work"), new Book("Remix your Body"), new Book("Finding Emo"));

	Map<String, Integer> score = Map.of("Kathy", 42, "Bert", 343, "Skyler", 420);

	Map<String, String> stores = Map.ofEntries(Map.entry("Riley", "Supersports"),
		Map.entry("Brooklyn", "Camera World"), Map.entry("Jay", "Homecase"));

    }

}
