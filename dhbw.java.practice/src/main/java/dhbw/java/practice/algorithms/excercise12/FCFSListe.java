package dhbw.java.practice.algorithms.excercise12;

public class FCFSListe implements WarteSchlange {

	private ZPatient patient1 = new ZPatient("Daniel", 1992);
	private ZPatient patient2 = new ZPatient("Timo", 1988);

	public ZPatient head = patient1;
	public ZPatient tail = patient2;

	public FCFSListe() {
		head.next = tail;
	}

	@Override
	public void anmelden(ZPatient p) {
		tail.next = p;
		tail = p;
	}

	@Override
	public ZPatient derNaechsteBitte() {
		ZPatient puffer = head;
		head = head.next;
		return puffer;
	}

}
