package dhbw.java.examples.boxing;

public class Boxing_Unboxing {

    public static void main(String[] args) {
        Integer x= new Integer(5); //boxing
        Integer x2=Integer.valueOf(5); // boxing
        Boolean b=Boolean.valueOf(true); //boxing

        int i=x.intValue(); //unboxing
        boolean b2=b.booleanValue(); //unboxing
    }
}
