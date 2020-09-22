/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import src.Person;

/**
 * @author Tereza Miklóšová
 *
 */
public class PersonTest {
	private final static String FIRST_CAPITAL = "[A-Z]{1}[a-z]+";
	private final static String SURNAME_CAPITALS = "[A-Z]{1}[a-z]{1,2}[A-Z]?[a-z]+";
	private final static String EMAIL_REGEX = ".+[@]{1}.+[.]{1}[a-z]+";
	
	Person person;
	
	@Before
	public void setUp() {
		person = new Person("Helena", "McTroy","helenatroy@gmail.com",27);
		
	}
	
	/**
	 * Test method for {@link src.Person#Person(java.lang.String, java.lang.String, java.lang.String, int)}.
	 */
	@Test
	public void testPersonConstructor() {
		assertNotNull("Object Person is null after initialization!", person);
	}

	/**
	 * Test method for {@link src.Person#getName()}.
	 */
	@Test
	public void testNameStartsWithCapital() {
		boolean match = person.getName().matches(FIRST_CAPITAL);
		String failMessage = String.format("Name '%s' does not start with capital letter or contains more than 1 capital letter or is otherwise badly formed", person.getName());
		
		assertTrue(failMessage, match);
	}


	/**
	 * Test method for {@link src.Person#getSurname()}.
	 */
	@Test
	public void testSurnameValidCapitals() {
		boolean match = person.getSurname().matches(SURNAME_CAPITALS);
		String failMessage = String.format("Surname '%s' is badly formed", person.getSurname());
		
		assertTrue(failMessage, match);
	}

	/**
	 * Test method for {@link src.Person#getEmail()}.
	 */
	@Test
	public void testEmailFormat() {
		boolean match = person.getEmail().matches(EMAIL_REGEX);
		String failMessage = String.format("E-mail '%s' is badly formed", person.getEmail());
		
		assertTrue(failMessage, match);
	}


	/**
	 * Test method for {@link src.Person#getAge()}.
	 */
	@Test
	public void testGetAge() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link src.Person#setAge(int)}.
	 */
	@Test
	public void testSetAge() {
		fail("Not yet implemented");
	}

}
