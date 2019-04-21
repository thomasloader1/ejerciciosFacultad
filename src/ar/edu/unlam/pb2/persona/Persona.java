package ar.edu.unlam.pb2.persona;

import java.time.LocalDate;

public class Persona {

	private String nombre = " ", fechaDeNacimiento = " ", dni = " ";
	private Character sexo = 'H';
	private Double altura = 0.0, peso = 0.0;
	private Integer edad = 0;

	public Persona() {
		this.nombre = " ";
		this.fechaDeNacimiento = " ";
		this.dni = " ";
		this.sexo = 'H';
		this.altura = 0.0;
		this.peso = 0.0;
		this.edad = 0;
	}

	public Persona(String nombre, Character sexo, Integer edad) {
		this.nombre = nombre;
		this.fechaDeNacimiento = " ";
		this.dni = " ";
		this.sexo = sexo;
		this.altura = 0.0;
		this.peso = 0.0;
		this.edad = edad;
	}

	public Persona(String nombre, String fechaDeNacimiento, String dni, Character sexo, Double altura, Double peso,
			Integer edad) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.dni = dni;
		this.sexo = sexo;
		this.altura = altura;
		this.peso = peso;
		this.edad = edad;
	}

	public Integer calcularIMC() {
		Integer resultado = (int) (this.peso / (Math.pow(this.altura, 2)));
		final Integer PESO_IDEAL = -1;
		final Integer SOBREPESO = 1;
		final Integer DEBAJO_DEL_IDEAL = 0;

		if (resultado <= 20) {
			return PESO_IDEAL;
		} else if (resultado >= 20 && resultado <= 25) {
			return DEBAJO_DEL_IDEAL;
		} else {
			return SOBREPESO;
		}
	}

	public Boolean esMayorDeEdad() {
		Boolean resultado = false;

		LocalDate fechaLocal = LocalDate.now();
		Integer anioDeNacimiento = fechaLocal.getYear() - this.edad;
		Integer edadFinal = fechaLocal.getYear() - anioDeNacimiento;

		if (edadFinal >= 18) {
			resultado = true;
			return resultado;
		} else {
			return resultado;
		}

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

}
