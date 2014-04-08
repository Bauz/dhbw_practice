package dhbw.java.examples.enumBeispiel;

public enum Beispiel2 {

	GOLD(255, 215, 0), KHAKI(240, 230, 140), OLIVE(128, 128, 0);

	public int r;
	public int g;
	public int h;

	private Beispiel2(int r, int g, int h) {
		this.r = r;
		this.g = g;
		this.h = h;
	}
}
