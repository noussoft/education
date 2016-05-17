import java.util.ArrayList;


public class CarSale {
	
	private ArrayList<Car> cars = new ArrayList<Car>();
	
	public CarSale add(Car car) {
		this.cars.add(car);
		return this;
	}
	
	public ArrayList searchCarByPriceAndYear(double minPrice, double maxPrice, int year) {
		ArrayList<Car> result = new ArrayList<Car>();
		
		for (Car car : this.cars) {
			if (
				(car.getPrice() >= minPrice)
				&& (car.getPrice() <= maxPrice)
				&& (car.getYear() == year)
			) {
				result.add(car); 
			}
		}
		
		return result;
	}

}
