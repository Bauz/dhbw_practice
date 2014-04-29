package dhbw.java.practice.algorithms.excercise10;

import java.util.HashSet;
import java.util.Set;

public class SetLotto {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>(7);
		while (set.size() != 7) {
			int i = (int) (Math.random() * 49 + 1);
			set.add(i);
		}
		System.out.println(set.toString());
	}

}
