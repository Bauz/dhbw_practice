package dhbw.java.practice.algorithms.excercise8;


public class EinfachVerketteteListe<T> {
	

	static class ElementL<E> {
		private E element;// Inhalt des Listenelements
		private ElementL<E> next; // Verweis auf Nachfolger

		public ElementL(E o) {
			element = o;
			next = null;
		}
	}
	
	private ElementL<T> head;

	public EinfachVerketteteListe(){
		head = null;
	}

	public ElementL<T> insert (T o, ElementL<T> pos){
		ElementL<T> local = head;
		while (local != pos) {
			local = local.next;
		}
		ElementL<T> puffer = new ElementL(o);
		puffer.next = local.next;
		local = puffer;
		return local;
	}

}
