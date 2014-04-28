package dhbw.java.practice.algorithms.excercise7;


public class ArrayListRing {

	public static Object list[];
	private int k;


	public ArrayListRing(int length) {
		list = new Object[length];
		k = 0;
	}

	public void insert(Object obj) {
		int f = k;
		k = k + 1;
		while (list[k] != null && k != f) {
			k = k + 1;
			if (k == list.length){
				k = 0;
			}
		}
		if (k == f)
			return;
		list[k] = obj;
	}

	public void remove() {
		int f = k;
		k = k + 1;
		while (list[k] == null && k != f) {
			k = k + 1;
			if (k == list.length) {
				k = 0;
			}
		}
		if (k == f)
			return;
		list[k] = null;
	}


}
