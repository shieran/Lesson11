import java.util.InputMismatchException;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        for (int i = 0; i < cars.length ; i++) {
            if(i%2==0){
                cars[i]=createCar("Bmw");
            }else {
                cars[i]=createCar("Mazda");
            }
        }
        for(Car car: cars){
            car.move();
            if (car instanceof Bmw){
                Bmw bmw = (Bmw) car;
                System.out.println(bmw.getNumberOfSpoilers());
            }
            if (car instanceof Mazda){
                Mazda mazda = (Mazda) car;
                System.out.println(mazda.getIsPraviyRul());
            }
        }


    }

    public static Car createCar(String className) {
        if ("Bmw".equals(className)){
            return createBmw();
        }else if ("Mazda".equals(className)){
            return createMazda();
        }
        return null;
    }

    public static Bmw createBmw() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bmw creation startet");
            System.out.println("enter colour");
            String colour = scanner.next();
            System.out.println("enter isAutomat");
            boolean isAutomat = scanner.nextBoolean();
            System.out.println("enter power");
            int powerOfEngine = scanner.nextInt();
            System.out.println("enter numberOfSpoilers");
            int numberOfSpoilers = scanner.nextInt();
            return new Bmw(colour, isAutomat, powerOfEngine, numberOfSpoilers);
        }catch (InvalidCarParametersException e){
            System.out.println("invalid parameters " + e.getMessage());
            return createBmw();
        }catch (InputMismatchException e){
            System.out.println("invalid input, try again");
            return createBmw();
        }

    }

    public static Mazda createMazda()  {
        try {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bmw creation startet");
        System.out.println("enter colour");
        String colour = scanner.next();
        System.out.println("enter isAutomat");
        boolean isAutomat = scanner.nextBoolean();
        System.out.println("enter power");
        int powerOfEngine = scanner.nextInt();
        System.out.println("enter isPraviyRul");
        boolean isPraviyRul = scanner.hasNextBoolean();
        return new Mazda(colour, isAutomat, powerOfEngine, isPraviyRul );
        }catch (InvalidCarParametersException e){
            System.out.println("invalid parameters " + e.getMessage());
            return createMazda();
        }catch (InputMismatchException e){
            System.out.println("invalid input, try again");
            return createMazda();
        }
    }




}
