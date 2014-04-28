package dhbw.java.practice.algorithms.excercise9;



public class ListDL<T> {
	static class ElementDL<E> {
		private E element;// Inhalt des Listenelements
		private ElementDL<E> next; // Verweis auf Nachfolger
		private ElementDL<E> prev; // Verweis auf Vorgänger

		public ElementDL(E o) {
			element = o;
			next = null;
			prev = null;
		}
	}

	private ElementDL<T> head; // Referenz auf Anfang der Liste
	private ElementDL<T> tail; // Referenz auf Ende der Liste
	
	public ElementDL<T> insert(T o) {
		tail.next = new ElementDL(o);
		tail = tail.next;
		return tail;
		}

	public ElementDL<T> insert(T o, ElementDL<T> pos) {
		ElementDL<T> local = head;
		while (local != pos) {
			local = local.next;
		}
		ElementDL<T> puffer = new ElementDL(o);
		puffer.next = local.next;
		local = puffer;
		return local;
	}

	public void remove(ElementDL<T> e) {
		ElementDL<T> local = head;
		while (local.next != e) {
			local = local.next;
		}
		local.next = e.next;
	}

	@Override
	public String toString() {
		String output = "";
		ElementDL<T> local = head;
		while (local != null) {
			output = output + " " + local + ",";
			local = local.next;
		}
		return output;
	}

}
