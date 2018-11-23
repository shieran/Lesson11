public class Bmw extends Car {

    public static final String COUNTRY = "Germany";
    private int numberOfSpoilers;

    public Bmw(String colour, boolean isAutomat, int powerOfEngine, int numberOfSpoilers) throws InvalidCarParametersException {
        super(colour, isAutomat, powerOfEngine);
        if (numberOfSpoilers < 0 || numberOfSpoilers > 10){
            throw new InvalidCarParametersException("number of spoilers can't be less than 0 and more than 10");
        }
        this.numberOfSpoilers=numberOfSpoilers;
    }

    @Override
    public void move() {
        System.out.println("BMW moves");
    }

    public  int getNumberOfSpoilers() {
        return numberOfSpoilers;
    }

    public static String getCOUNTRY() {
        return COUNTRY;
    }

    public void setNumberOfSpoilers(int number) {
        if (numberOfSpoilers < 0 || numberOfSpoilers > 10){
            System.out.println("number of spoilers can't be less than 0 and more than 10");
            return;
        }
        numberOfSpoilers = number;
    }
}
