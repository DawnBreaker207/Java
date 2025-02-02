package Chapter12;

import java.util.*;

public class TestLoop {

    public static void main(String[] args) {
	List<String> allColors = List.of("Red", "Blue", "Yellow");
	allColors.forEach(color -> System.out.println(color));
    }

}
