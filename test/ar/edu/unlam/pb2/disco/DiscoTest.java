package ar.edu.unlam.pb2.disco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiscoTest {

	@Test
	public void testQueHayQueHacer() {
		Disco disco1 = new Disco(5.0, 3.0);
		Double pExteriorActual = disco1.perimetroExterior();
		Double pExteriorEsperado = 15.70796327;
		
		Double pInteriorActual = disco1.perimetroInterior();
		Double pInteriorEsperado = 9.42477796076938;
		
		disco1.radioInterior();
		disco1.radioExterior();
		
		Double superficieActual = disco1.superficie();
		Double superficieEsperada = 25.13274123;

		

		assertEquals(pExteriorEsperado, pExteriorActual, 0.001);
		
		assertEquals(pInteriorEsperado, pInteriorActual, 0.001);
		
		assertEquals(superficieEsperada, superficieActual, 0.001);
		
		
	}
}
