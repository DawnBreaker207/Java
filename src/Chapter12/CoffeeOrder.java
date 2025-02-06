package Chapter12;

import java.util.*;
import java.util.stream.*;

public class CoffeeOrder {

    public static void main(String[] args) {
	List<String> coffees = List.of("Capuccino", "Americano", "Espresso", "Cortado", "Mocha", "Capuccino",
		"Flat White", "Latte");

	List<String> coffeeEndingInO = coffees.stream()
		.filter(s -> s.endsWith("o"))
		.sorted()
		.distinct()
		.collect(Collectors.toList());

	System.out.println(coffeeEndingInO);
    }

}
