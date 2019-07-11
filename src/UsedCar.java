
public class UsedCar extends Car{

	//Car c = new Car();
	private double mileage = 0.0;
	
	
	UsedCar(String carMake, String carModel, int carYear, double carPrice, double carMileage ){
		super(carMake, carModel, carYear, carPrice);
		mileage = carMileage;
	}
	
	


	@Override
	public String toString() {
		return "UsedCar [mileage=" + mileage + "]";
	}


	public double getMileage() {
		return mileage;
	}


	public void setMileage(double mileage) {
		this.mileage = mileage;
	}


	
	
}
