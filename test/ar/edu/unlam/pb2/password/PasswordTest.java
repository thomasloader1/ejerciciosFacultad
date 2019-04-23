package ar.edu.unlam.pb2.password;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PasswordTest {

	@Test
	public void testQueGeneraUnaPasswordAleatoria() {
		Password asd = new Password(8,"asd123as");
		asd.passwordAleatoria();
		
		assertTrue(asd.esFuerte());
	}
}
