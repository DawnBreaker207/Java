package Chapter12;

import java.util.*;
import java.util.stream.*;

public class StreamAPI {

    public static void main(String[] args) {
	List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");
//	Change a collection into stream
	Stream<String> stream = strings.stream();
//	Using stream operation to set limit of return collection into 4
	Stream<String> limit = stream.limit(4);
// Call the count terminal operator, and store the output in a variable called result 
// 	long result = limit.count();

	List<String> result = limit.collect(Collectors.toList());
	System.out.println("Result = " + result);
    }

}
