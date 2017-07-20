import java.util.Scanner;

/**
 * Created by Jared on 7/20/17.
 */
public class CarApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numCars = 0;
        //greetings
        //ask the user how many cars they want to enter
        System.out.println("Welcome to Grand Circus Motors admin console!");
        System.out.println("How many cars are you entering: ");
        numCars = scan.nextInt();
        System.out.println(numCars + " cars? Okayyyyy");
        Car[] cars = new Car[numCars];
        String mk = "SomeKindaCar";
        String ml = "Pinto";
        int y = 0;
        double pc = 0.00;
        for (int i = 0; i < numCars; i++) {
            System.out.println("Car " + (i +1) + "");
            System.out.println("Enter make: ");
            mk = scan.nextLine();
            scan.next();
            System.out.println("Enter model: ");
            ml = scan.nextLine();
            scan.next();
            System.out.println("Enter year: ");
            y = scan.nextInt();
            if (y > 2018 || y < 1900) {
                System.out.println("Please enter a year betweeen 1900 and 2018: ");
                y = scan.nextInt();
            }
            System.out.println("Enter price: ");
            pc = scan.nextDouble();
            Car car = new Car(mk, ml, y, pc);
            cars[i] = car;
        }

        System.out.println("...");
        System.out.println("Current Inventory");
        //extended for loop to get specific information from cars[]
        //Print out a table of the cars at the end
        for (Car car : cars) {
            System.out.println( car.getMake() + " " + car.getModel() + " " + car.getYear() + " " + "$" + car.getPrice());
        }



    }

}
