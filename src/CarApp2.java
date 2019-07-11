import java.util.ArrayList;
import java.util.Scanner;

public class CarApp2 {

	public static void main(String[] args) {

		int count = 1;
		int count1 = 1;
		int count2 = 1;
		String userInput2 = "";
		Scanner scnr = new Scanner(System.in);
		ArrayList<UsedCar> carsList = new ArrayList<>();
		ArrayList<Double> carsMileageList = new ArrayList<>();

		carsList.add(new UsedCar("Ford", "Fusion", 2020, 22234.45, 0.0));
		carsList.add(new UsedCar("Ford", "Focus", 2019, 9870.23, 0.0));
		carsList.add(new UsedCar("Lincoln", "MKZ", 2017, 9456.12, 0.0));
		carsList.add(new UsedCar("Cadilac", "C3", 1998, 9803.45, 12345.56));
		carsList.add(new UsedCar("Toyota", "Corolla", 2010, 9900.11, 23451.34));
		carsList.add(new UsedCar("Honda", "Civic", 2011, 2316.44, 98723.12));
		try {
			do {
				for (UsedCar s : carsList) {

					if (s.getMileage() > 0.0) {
						System.out.printf(count + " %-8s %-8s %-8d %-8.2f (Used)%-8.2f miles \n", s.getCarMake(),
								s.getCarModel(), s.getCarYear(), s.getCarPrice(), s.getMileage());
						carsMileageList.add(s.getMileage());

					} else {
						System.out.printf(count + " %-8s %-8s %-8d %-8.2f %-8.2f\n", s.getCarMake(), s.getCarModel(),
								s.getCarYear(), s.getCarPrice(), s.getMileage());
						carsMileageList.add(s.getMileage());
					}
					count++;

				}
				System.out.println(count + " Quit");

				System.out.println("Which car would you like?");
				int userInput = scnr.nextInt();

				for (UsedCar e : carsList) {
					if (count1 == (userInput)) {
						if (e.getMileage() > 0.0) {
							System.out.printf(count1 + " %-8s %-8s %-8d %-8.2f (Used)%-8.2f miles \n", e.getCarMake(),
									e.getCarModel(), e.getCarYear(), e.getCarPrice(), e.getMileage());

						} else {
							System.out.printf(count1 + " %-8s %-8s %-8d %-8.2f %-8.2f\n", e.getCarMake(),
									e.getCarModel(), e.getCarYear(), e.getCarPrice(), e.getMileage());

						}
						break;
					}
					count1++;
				}

				System.out.println("Would you like to buy this car? y/n");
				String userInput1 = scnr.next();
				if (userInput1.equalsIgnoreCase("Y")) {
					carsList.remove(count1 - 1);

					System.out.println("Excellent! Our Finance department will be in touch shortly.");
					System.out.println();
					for (UsedCar s : carsList) {

						if (s.getMileage() > 0.0) {
							System.out.printf(count2 + " %-8s %-8s %-8d %-8.2f (Used)%-8.2f miles \n", s.getCarMake(),
									s.getCarModel(), s.getCarYear(), s.getCarPrice(), s.getMileage());

						} else {
							System.out.printf(count2 + " %-8s %-8s %-8d %-8.2f %-8.2f\n", s.getCarMake(),
									s.getCarModel(), s.getCarYear(), s.getCarPrice(), s.getMileage());

						}
						count2++;

					}
					System.out.println(count2 + " Quit");
				}
				System.out.println("Would you like shop more? y/n");
				userInput2 = scnr.next();
				count = 1;
				count1 = 1;
				count2 = 1;
			} while (userInput2.equalsIgnoreCase("y"));
			System.out.println("Have a great day");

		} catch (Exception exception) {
			System.out.println("The exception is " + exception);
		}
		scnr.close();
	}
}
