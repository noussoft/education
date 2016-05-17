import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SearchCarTestCase {
	
	private CarSale carSale;

	@Before
	public void setUp() throws Exception {
		this.carSale = new CarSale();
		this.carSale.
		add(
			new Car("Toyota Corolla", 3500, 2010)
		).
		add(
			new Car("Toyota Corolla", 4500, 2011)
		).
		add(
			new Car("Toyota Highlander", 7500, 2010)
		).
		add(
			new Car("Nissan Almera", 3000, 2010)
		);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSearchCarByPriceAndYear() {
		Car[] expectedCars = new Car[2];
		expectedCars[0] = new Car("Toyota Corolla", 3500, 2010);
		expectedCars[0].setId(10000);
		expectedCars[1] = new Car("Nissan Almera", 3000, 2010); 
		expectedCars[1].setId(10003);
		assertArrayEquals(
			expectedCars, 
			this.carSale.searchCarByPriceAndYear(3000, 4000, 2010).toArray()
		);
		
	}

}
