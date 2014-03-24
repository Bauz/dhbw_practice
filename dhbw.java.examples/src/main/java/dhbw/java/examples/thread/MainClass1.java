package dhbw.java.examples.thread;

public class MainClass1 {

	public static void main(String[] args) {
		FirstThread t1 = new FirstThread();
		System.out.println("Beginn von main");
		t1.start();
		// // Join auf Main-Strang
		// try {
		// t1.join();
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		System.out.println("Ende von main");
	}

}
