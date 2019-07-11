
public class Car {

	private String carMake;
	private String carModel;
	private int carYear;
	private double carPrice;

	public Car() {
           carMake = "";
           carModel = "";
           carYear = 0;
           carPrice = 0.0;
	}

	public Car(String carMake, String carModel, int carYear, double carPrice) {
        this.carModel = carModel;
        this.carMake = carMake;
        this.carYear = carYear;
        this.carPrice = carPrice;
	}

	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public int getCarYear() {
		return carYear;
	}

	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}

	public double getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}

	@Override
	public String toString() {
		return "Car [carMake=" + carMake + ", carModel=" + carModel + ", carYear=" + carYear + ", carPrice=" + carPrice
				+ "]";
	}

}