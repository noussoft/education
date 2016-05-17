import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PersonTestCase {
	
	private Person person;

	@Before
	public void setUp() throws Exception {
		this.person = new Person("John", "Doe");
	}
	
	@Test
	public void testGetFullName() {
		assertEquals("John Doe", this.person.getFullName());
	}
	
	@Test
	public void testGetAgeAsString() {
		this.person.setAge(27);
		assertEquals("27 years old", this.person.getAgeAsString());
	}

}
