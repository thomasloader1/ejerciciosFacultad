package ar.edu.unlam.pb2.disco;

public class Disco {

	Double circuloMayor;
	Double circuloMenor;
	Double perimetroMenor, perimetroMayor, radioExterior, radioInterior, superficie; 

	public Disco(Double circuloMayor, Double circuloMenor) {
		this.circuloMayor = circuloMayor;
		this.circuloMenor = circuloMenor;
	}

	public Double radioExterior() {
		Double radioExterior = (this.circuloMayor / 2);
		return radioExterior;
	}

	public Double radioInterior() {
		Double radioInterior = this.circuloMenor / 2;
		return radioInterior;
	}

	public Double perimetroExterior() {
		perimetroMayor = 2 * Math.PI * this.circuloMayor / 2;
		return perimetroMayor;
	}
	
	public Double perimetroInterior() {
		perimetroMenor = 2 * Math.PI * this.circuloMenor / 2;
		return perimetroMenor;
	}
	
	public Double superficie() {
		superficie = perimetroMayor + perimetroMenor;
		return superficie;
	}
}
