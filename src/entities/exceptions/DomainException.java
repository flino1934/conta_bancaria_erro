package entities.exceptions;

public class DomainException extends RuntimeException {


	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {//Esse metodo contrutor vai pedir uma String de retorno
		super(msg);
	}

}
