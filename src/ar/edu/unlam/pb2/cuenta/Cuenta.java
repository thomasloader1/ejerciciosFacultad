package ar.edu.unlam.pb2.cuenta;

public class Cuenta {
	
	String titular;
	Double saldo, cantidad;
	
	public Cuenta(String titular) {
		this.titular = titular;
		this.saldo = 0.0;
	}
	
	public Cuenta(String titular, Double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	/**
	La cantidad se suma al saldo, si la cantidad
	es negativa el saldo no debe ser afectado
	*/
	public void depositar(Double cantidad){
	   
	   if(cantidad != 0.0) {
		   this.saldo += cantidad;
	   }
	}
	
	/**
	Restamos cantidad al saldo actual, si la cantidada a retirar
	es mayor que el saldo no se debe afectar el saldo
	*/

	public void retirar(Double cantidad){
		
		if(cantidad <= this.saldo) {
			this.saldo -= cantidad;
		}
	    
	}
	
	/* ¿Que pasa con los setters en este caso?
	 * 
	 *  No son necesarios ya que el constructor los inicializa al instanciar un Objeto Cuenta
	 *  */

}
