
public class Car {

	private static int initialID = 10000;
	
	private int id;
	private double price;
	private String model;
	private int year;
	
	public Car (String model, double price, int year) {
		this.id = initialID++;
		this.model = model;
		this.price = price;
		this.year = year;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		return 
			(this.id == ((Car)obj).getId())
			&& (this.model.equals(((Car)obj).getModel()));
	}
}
