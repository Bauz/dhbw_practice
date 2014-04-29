package dhbw.java.practice.algorithms.excercise14;


public class ListeL<I extends Comparable<I>> {

	static class ElementL<K> {
		private K inhalt; // Inhalt des Listenelements
		private ElementL<K> next; // Verweis auf den Nachfolger

		public ElementL(K o) {
			inhalt = o;
			next = null;
		}
	}

	private ElementL<I> head; // Referenz auf den Anfang der Liste

	public ListeL() {
		head = null;
	}

	public ListeL(I o) {
		head = new ElementL<I>(o);
	}

	public ElementL<I> insert(I o) { // am Anfang einf¸gen
		ElementL<I> newEl = new ElementL<I>(o);
		if (head == null) { // Liste ist noch leer
			head = newEl;
		} else {
			newEl.next = head;
			head = newEl;
		}
		return newEl;
	}

	public ElementL<I> insert(I o, ElementL<I> pred) { // nach pred (Vorg‰nger)
														// einf¸gen
		ElementL<I> newEl = new ElementL<I>(o);
		if (pred == null) { // am Anfang einf¸gen
			newEl.next = head;
			head = newEl;
		} else { // nach pred (Vorg‰nger) einf¸gen
			newEl.next = pred.next;
			pred.next = newEl;
		}
		return newEl;
	}

	public void remove(ElementL<I> pred) { // Element nach pred (Vorg‰nger)
											// lˆschen
		if (pred == null) // erstes Element lˆschen
			head = head.next;
		else if (pred.next != null) // Element nach pred (Vorg‰nger) lˆschen
			pred.next = pred.next.next;
	}

	@Override
	public String toString() {
		String s = "(";
		ElementL<I> help = head;
		while (help != null && help.next != null) {
			s = s + help.inhalt + ", ";
			help = help.next;
		}
		if (help != null)
			s = s + help.inhalt;
		return s + ")";
	}

	// Test

	public static void main(String[] args) {
		ListeL<Integer> l = new ListeL<Integer>();
		l.insert(7);
		ElementL<Integer> eins = l.insert(1);
		l.insert(3);
		l.insert(6);
		l.insert(5);
		System.out.println(l);
		l.insert(2, eins); // nach eins einf¸gen
		System.out.println(l);
		l.remove(eins); // Nachfolger von eins lˆschen
		System.out.println(l);
		l.sort2();
		System.out.println(l);
	}

	public int findI(I o) {
		ElementL<I> puffer = new ElementL<I>(o);
		puffer = head;
		int zaehler = 1;
		while (puffer.inhalt != o) {
			if (puffer.next != null) {
				zaehler = zaehler + 1;
				puffer = puffer.next;
			} else {
				return -1;
			}
		}
		return zaehler;
	}
	
	// public void sort1(){
	// ElementL<I> test = head;
	// int zaehler = 1;
	// while (test.next != null) {
	// zaehler = zaehler + 1;
	// test = test.next;
	// }
	// System.out.println(zaehler);
	// for( int i = 0; i <=zaehler; i++) {
	// int iMin = i;
	// for (int j = i+1; j<=zaehler; j++){
	// if
	// }
	// }
	//
	// }

	private void sort2() {
		ElementL<I> test = head;
		ElementL<I> puffer = head;
		while (test.next != null) {
			if (test.inhalt.compareTo(test.next.inhalt) > 0) {
				puffer = test.next;
			}
			test = test.next;
		}
		ElementL<I> puffer2 = new ElementL<I>((I) new Integer(0));
		puffer2.inhalt = head.inhalt;
		head.inhalt = puffer.inhalt;
		System.out.println(puffer.inhalt);
		puffer.inhalt = puffer2.inhalt;

		System.out.println(head.inhalt);
		System.out.println(puffer.inhalt);

		test = head.next;

		while (test.next != null) {
			if (test.inhalt.compareTo(test.next.inhalt) > 0) {
				puffer = test.next;
			}
			test = test.next;
		}
		puffer2 = new ElementL<I>((I) new Integer(0));
		puffer2.inhalt = head.next.inhalt;
		head.next.inhalt = puffer.inhalt;
		System.out.println(puffer.inhalt);
		puffer.inhalt = puffer2.inhalt;

		System.out.println(head.inhalt);
		System.out.println(puffer.inhalt);
	}
	
}
