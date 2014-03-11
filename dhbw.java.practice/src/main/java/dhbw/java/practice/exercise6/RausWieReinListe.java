package dhbw.java.practice.exercise6;

public class RausWieReinListe implements WarteListe {

    private Patient[] patientenListe = new Patient[1000];
    private int zaehler = 0;
    private int index = 0;

    @Override
    public void rein(Patient p) {
        patientenListe[zaehler] = p;
        zaehler++;
    }

    @Override
    public Patient raus() {
        if (index < zaehler)
            return patientenListe[index++];
        else return null; //keine weiteren Patienten in der Liste
    }
}
