package model.exceptions;

public class DomainException extends RuntimeException { //ao utilizar RuntimeException no lugar de Exception não somos obrigados à tratar a exception. podemos remover o "throws" da class Reservation o "catch" da class Program/
														// mas ao retirar o catch, podemos fazer com que o programa "quebre" ao incorrer em tal exception. por isso é bom que mantenhamos o "catch" pra tratar a RuntimeException.
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}
}
