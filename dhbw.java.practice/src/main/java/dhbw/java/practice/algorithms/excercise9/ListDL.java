package dhbw.java.practice.algorithms.excercise9;

public class ListDL<T> {

    private ElementDL<T> head; // Referenz auf Anfang der Liste
    private ElementDL<T> tail; // Referenz auf Ende der Liste

    public ElementDL<T> insert(T o) {
        ElementDL<T> puffer = new ElementDL<>(o);
        tail.next = puffer;
        puffer.prev = tail;
        tail = puffer;
        return tail;
    }

    public ElementDL<T> insert(T o, ElementDL<T> pos) {
        ElementDL<T> puffer = new ElementDL<>(o);
        ElementDL<T> local = head;
        while (local != pos) {
            local = local.next;
        }
        puffer.next = local.next;
        puffer.prev = local.prev;
        local = puffer;
        return local;
    }

    public void remove(ElementDL<T> e) {
        ElementDL<T> local = head;
        while (local.next != e) {
            local = local.next;
		}
        local.next = local.prev;
        local.prev = local.next;
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
}
