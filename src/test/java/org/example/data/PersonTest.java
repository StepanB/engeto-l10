package org.example.data;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

	Person person;
	@BeforeEach
	void setUp() {
		person = new Person("Stepan", "Bohm", 38);
	}

	@Test
	void getName() {
		String actual = person.getName();
		String excepted = "Stepan";

		Assertions.assertEquals(actual, excepted);
	}

	@Test
	void setName() {
		person.setName("Karel");

		String actual = person.getName();
		String excepted = "Karel";
		Assertions.assertEquals(actual, excepted);
	}

	@Test
	void getSurename() {
		String actual = person.getSurename();
		String expected = "Bohm";

		Assertions.assertEquals(actual, expected);
	}

	@Test
	void setSurename() {
		Person person1 = new Person();
//		Assertions.assertNull(person1.getSurename());
//		person1.setSurename("Tester");
		Assumptions.assumeTrue(person1.getSurename() == null);

		person1.setSurename("Tester");
		String actual = person1.getSurename();
		Assertions.assertEquals(actual, "Tester");
	}

	@Test
	void getAge() {
		int actual = person.getAge();
		int expected = 38;

		Assertions.assertEquals(actual, expected);
	}

	@Test
	void setAge() {
		person.setAge(48);
		int expected = 48;
		int actual = person.getAge();

		Assertions.assertEquals(actual, expected);
	}
}