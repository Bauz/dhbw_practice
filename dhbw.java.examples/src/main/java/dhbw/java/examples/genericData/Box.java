package dhbw.java.examples.genericData;

public class Box<T> {

	private T inhalt;

	public Box(T obj) {
		this.inhalt = obj;
	}

	public T getInhalt() {
		return inhalt;
	}

	public void setInhalt(T inhalt) {
		this.inhalt = inhalt;
	}
	
	
}
