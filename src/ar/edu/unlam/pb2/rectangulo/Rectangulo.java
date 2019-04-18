package ar.edu.unlam.pb2.rectangulo;

public class Rectangulo {
	
	Double base, altura;
	Double areaRectangulo, perimetroRectangulo;
	
	
	public Rectangulo(Double base, Double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	/**
	Calcula el area del triangulo utilizando las propiedades base
	y altura
	*/
	public Double calcularArea(){
	    Double operacion = base * altura;
	    
	    areaRectangulo = operacion;
		
		return areaRectangulo;
	}
	
	/**
	Calcula el perímetro del rectangulo utilizando las propiedades base
	y altura
	*/
	public Double calcularPerimetro(){
		Double operacion = 2*(base + altura);
		
		perimetroRectangulo = operacion;
		
	    return perimetroRectangulo;
	}

}
