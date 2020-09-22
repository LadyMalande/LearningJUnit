package src;
/**
 * 
 */

/**
 * @author Tereza Mikl�ov�
 *
 */
public class Person {
	String name;
	String surname;
	String email;
	int age;
	
	public Person(String name, String surname, String email, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
