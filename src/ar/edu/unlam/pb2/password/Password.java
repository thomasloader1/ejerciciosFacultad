package ar.edu.unlam.pb2.password;

public class Password {

	Integer longitud, minuscula, mayuscula, numeros;
	String clave;
	char ascii;
	int numeroAleatorio;

	public Password() {
		this.longitud = 8;
		this.clave = "12345678";
	}

	public Password(Integer longitud, String clave) {
		this.longitud = longitud;
		this.clave = clave;
	}

	public String cambiarContrasenia(String clave) {
		String claveNueva = clave;

		return claveNueva;

	}

	public char passwordAleatoria() {
		ascii = 'A';
		for (int i = 1; i <= longitud; i++) {
			numeroAleatorio = 32 + (int) (Math.random() * 92);
			ascii = (char) numeroAleatorio;
			if (i == longitud) {
				return ascii;
			}
		}
		return ascii;
	}

	public Boolean esFuerte() {

		if (numeroAleatorio >= 65 && numeroAleatorio <= 90) {
			mayuscula++;
		}
		if (numeroAleatorio >= 97 && numeroAleatorio <= 122) {
			minuscula++;
		}
		if (numeroAleatorio >= 48 && numeroAleatorio <= 57) {
			numeros++;
		}

		if (minuscula > 1 && mayuscula > 2 && numeros > 5) {
			return true;
		} else {
			return false;
		}
	}
}
