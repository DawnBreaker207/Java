package Head_First.Chapter12;

import java.util.*;
import java.util.stream.*;

public class StreamAPI {

    public static void main(String[] args) {
	List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");
//	Change a collection into stream
//	Stream<String> stream = strings.stream();
//	Using stream operation to set limit of return collection into 4
//	Stream<String> limit = stream.limit(4);
// Call the count terminal operator, and store the output in a variable called result 
// 	long result = limit.count();

//	List<String> result = limit.collect(Collectors.toList());
//	Stream can be stack and combine and combine like a chain
//	List<String> result = strings.stream().limit(4).collect(Collectors.toList());
//	Can be use lambda expression in intermediate operation
	List<String> result = strings.stream().sorted((s1, s2) -> s1.compareToIgnoreCase(s2)).skip(2).limit(4)
		.collect(Collectors.toList());
	System.out.println("Strings = " + strings);
	System.out.println("Result = " + result);
    }

}
