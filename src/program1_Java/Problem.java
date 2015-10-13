package program1_Java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Problem {
	public static Set<String> set = new HashSet<String>();

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(
				"C:/Users/new/Documents/q1-cities1.txt"));
		Scanner scanner2 = new Scanner(new File(
				"C:/Users/new/Documents/q1-cities2.txt"));
		List<String> list = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		while (scanner.hasNext()) {
			list.add(scanner.next());
		}
		scanner.close();
		while (scanner2.hasNext()) {
			list2.add(scanner2.next());
		}
		scanner2.close();

		System.out.println(new Problem().intersectionList(list, list2));
		System.out.println(new Problem().unionList(list, list2));
		System.out.println(new Problem().oneList(list, list2, set));

		// TODO Auto-generated method stub

	}

	private Set<String> oneList(List<String> list, List<String> list2,
			Set<String> set) {
		// TODO Auto-generated method stub
		Set<String> set2 = new HashSet<String>();
		for (String t : set) {
			if (!list2.contains(t)) {
				set2.add(t);
			}
		}

		return set2;

	}

	private Set<String> intersectionList(List<String> list, List<String> list2) {
		// TODO Auto-generated method stub
		Set<String> set1 = new HashSet<String>();
		for (String t : list) {
			if (list2.contains(t)) {
				set1.add(t);
			}
		}

		return set1;

	}

	private ArrayList<String> unionList(List<String> list, List<String> list2) {
		// TODO Auto-generated method stub
		// Set<String> set = new HashSet<String>();

		set.addAll(list);
		set.addAll(list2);

		return new ArrayList<String>(set);

	}

}
