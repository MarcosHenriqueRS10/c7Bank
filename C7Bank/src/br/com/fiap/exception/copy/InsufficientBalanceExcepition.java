package br.com.fiap.exception.copy;

public class InsufficientBalanceExcepition extends Exception {

	private static final long serialVersionUID = 1L;

	public InsufficientBalanceExcepition(String message) {
		super(message);
	}
}
