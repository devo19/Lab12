import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Welcome to the Grand Circus Motor admin console!");
		System.out.println("How many cars are you entering ?");
		int userInput = scnr.nextInt();
		ArrayList<Car> carsInfo = new ArrayList<>();

		for (int noOfCars = 1; noOfCars <= userInput; noOfCars++) {
			System.out.println("Enter make of car ?");
			String userChoice = scnr.next();

			System.out.println("Enter model of car ?");
			String userChoice1 = scnr.next();

			System.out.println("Enter year of car ?");
			int userChoice11 = scnr.nextInt();

			System.out.println("Enter price of car ?");
			double userChoice21 = scnr.nextDouble();

			carsInfo.add(new Car(userChoice, userChoice1, userChoice11, userChoice21));
		}

		System.out.println("Current Inventory:");

		for (Car s : carsInfo) {
			System.out.printf("%-8s %-8s %-8d %-8.2f \n", s.getCarMake(), s.getCarModel(), s.getCarYear(),
					s.getCarPrice());
		}
		scnr.close();

	}

}
