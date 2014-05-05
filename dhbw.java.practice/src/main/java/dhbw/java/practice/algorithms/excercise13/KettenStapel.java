package dhbw.java.practice.algorithms.excercise13;

public class KettenStapel {

    Element head = null;

    public void push(Object newElement) {
        if (head == null) head = new Element(newElement, null);
        else {
            Element newNode = new Element(newElement, head);
            head = newNode;
        }
    }

    public Object pop() {
        if (head == null) return null;
        Object top = head.inhalt;
        head = head.next;
        return top;
    }

    class Element {

        public Element next;
        public Object inhalt;

        public Element(Object inhalt, Element next) {
            this.inhalt = inhalt;
            this.next = next;
        }
    }
}
