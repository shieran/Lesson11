public abstract class Car {
    public static final int NUMBER_OF_WHEELS = 4;
    private String colour;
    private boolean isAutomat;
    private int powerOfEngine;

    public final String getColour() {
        return colour;
    }

    public final boolean isAutomat() {
        return isAutomat;
    }

    public final int getPowerOfEngine() {
        return powerOfEngine;
    }

    public final void setColour(String colour)  {
        if (colour == null || colour.isEmpty()) {
            System.out.println("colour can't be empty string");
            return;
        }
        this.colour = colour;
    }

    public final void setAutomat(boolean automat) {
        isAutomat = automat;
    }

    public final void setPowerOfEngine(int powerOfEngine){
        if (powerOfEngine < 0 || powerOfEngine > 1000){
            System.out.println("powerOfEngine can't be less than 0 and more than 1000");
            return;
        }
        this.powerOfEngine = powerOfEngine;
    }

    public Car(String colour, boolean isAutomat, int powerOfEngine) throws InvalidCarParametersException {
        if (colour == null || colour.isEmpty()){
            throw new InvalidCarParametersException("colour can't be empty string");
        }

        if (powerOfEngine < 0 || powerOfEngine > 1000){
            throw new InvalidCarParametersException("powerOfEngine can't be less than 0 and more than 1000");
        }

        this.colour = colour;
        this.isAutomat = isAutomat;
        this.powerOfEngine = powerOfEngine;
    }

    public abstract void move();




}
