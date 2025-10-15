package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingCollection {

	public static void main(String[] args) {
		List<String> sort = new ArrayList<>();
		sort.add("HCL");
		sort.add("Wipro");
		sort.add("Aspire Systems");
		sort.add("CTS");
		Collections.sort(sort);
		System.out.println("Initial Value is " + sort);
		int size = sort.size();
		System.out.println("The Size is " + size);
		List<String> newValue = new ArrayList<>();
		for (int i = size - 1; i >= 0; i--) {
			String string = sort.get(i);
			newValue.add(string);
		}
		System.out.println("Final Value is " + newValue);

	}

}
