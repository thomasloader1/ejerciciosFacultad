package ar.edu.unlam.pb2.persona;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {

	@Test
	public void testQueIndicaElPesoIdeal() {
		Persona tomas = new Persona("Tomas", "16/12/1993", "12.345.678", 'H', 1.85, 70.0, 25);
		Integer resultado = tomas.calcularIMC();
		
		assertEquals(-1, resultado);
	}
	
	@Test
	public void testQueIndicaElSobrepeso() {
		Persona tomas2 = new Persona("Tomas", "16/12/1993", "12.345.678", 'H', 1.85, 200.0, 25);
		Integer resultado = tomas2.calcularIMC();
		
		assertEquals(1, resultado);
	}
	
	@Test
	public void testQueIndicaElPesoPorDebajoDeLoIdeal() {
		Persona tomas3 = new Persona("Tomas", "16/12/1993", "12.345.678", 'H', 1.85, 80.5, 25);
		Integer resultado = tomas3.calcularIMC();
		
		assertEquals(0, resultado);
	}
	
	@Test
	public void testQueIndicaSiEsMayorDeEdad() {
		Persona tomas3 = new Persona("Tomas", "16/12/1993", "12.345.678", 'H', 1.85, 80.5, 25);
		
		assertTrue(tomas3.esMayorDeEdad());
		
		Persona tomas4 = new Persona("Tomas", 'H', 12);
		
		assertFalse(tomas4.esMayorDeEdad());
		
	}

}
