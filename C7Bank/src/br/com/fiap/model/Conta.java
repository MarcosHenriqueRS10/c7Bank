package br.com.fiap.model;

import br.com.fiap.exception.copy.InsufficientBalanceExcepition;

public class Conta {
	
	private String cliente;	
	private double saldo = 300;
	
	public void retirada(double valor) throws InsufficientBalanceExcepition {
		if(valor > saldo) {
			throw new InsufficientBalanceExcepition (Double.toString(saldo - valor));
		}
		this.saldo = this.saldo - valor;
	}
	
	public void deposito(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public static void main(String[] args) {
		Conta c = new Conta();
		c.deposito(200);
		c.deposito(100);
		try {
			c.retirada(250);
			c.retirada(300);
			c.retirada(300);
		} catch (InsufficientBalanceExcepition e) {			
			e.printStackTrace();
			//System.out.println("Cliente não possui saldo para retirada");
		}
	}
}
