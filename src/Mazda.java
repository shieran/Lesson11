public class Mazda extends Car{
    public static final String COUNTRY = "Japan";
    private boolean isPraviyRul = true;

    public Mazda(String colour, boolean isAutomat, int powerOfEngine, boolean isPraviyRul) throws InvalidCarParametersException {
        super(colour, isAutomat, powerOfEngine);
        this.isPraviyRul=isPraviyRul;
    }

    public static String getCOUNTRY() {
        return COUNTRY;
    }

    public boolean isPraviyRul() {
        return isPraviyRul;
    }

    public void setPraviyRul(boolean praviyRul) {
        isPraviyRul = praviyRul;
    }

    @Override
    public void move() {
        System.out.println("Mazda, isPraviyRul= " + isPraviyRul);
        System.out.println("lets go");
    }

    public boolean getIsPraviyRul() {
        return isPraviyRul;
    }
}
