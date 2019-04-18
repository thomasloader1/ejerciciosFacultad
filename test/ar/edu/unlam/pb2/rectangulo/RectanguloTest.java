package ar.edu.unlam.pb2.rectangulo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectanguloTest {

	@Test
	public void sePuedenCrearRectangulos() {
		Rectangulo miRectangulo = new Rectangulo(1.0,2.0);
		assertNotNull(miRectangulo);
		
		Rectangulo miOtroRectangulo = new Rectangulo(1.0,2.0);
		assertNotNull(miOtroRectangulo);
	}
	
	@Test
    public void elPerimetroDeUnRectanguloDebeSerLaSumaDeSusLados(){
		
		Rectangulo miRectangulo = new Rectangulo(4.0,2.0);
        Double esperado = 12.0; // 
        
        Double actual = miRectangulo.calcularPerimetro();
        
        /* El tercer parametro es un delta. Quiere decir que solamente
          nos van a importar los primeros dos decimales para la comparacion */
        
        assertEquals(esperado, actual, 0.01); 
        
        }
	
	@Test
	public void elAreaDeUnRectanguloDebeSerLaBasePorSuAltura() {
		
		Rectangulo miRectangulo = new Rectangulo(2.0, 2.0);
		
		Double actual = miRectangulo.calcularArea();
		Double esperado = 4.0;
		
		assertEquals(esperado, actual, 0.01, "Vamo lo pibe'");
		
	}
	
	/*    
    */        

}
