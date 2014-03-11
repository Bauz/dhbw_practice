package dhbw.java.practice.excercise9;


public class Gleichung {
    private double a, b, c, d, w, x1, x2;

    public Gleichung(String parameterA, String parameterB, String parameterC) {
        a = new Double(parameterA).doubleValue();
        b = new Double(parameterB).doubleValue();
        c = new Double(parameterC).doubleValue();
    }

    public Loesung berechneLoesung() throws UnloesbarException {
        if (a == 0) throw new NichtquadratischException("a = 0 nicht zulaessig");
        d = Math.pow(b, 2) - 4 * a * c;
        if (d < 0) throw new UnloesbarException("\"b*b-4*a*c = \" + d + \" < 0");
        w = Math.sqrt(d);
        return new Loesung((-b + w) / 2 * a, (-b - w) / 2 * a);
    }
}
