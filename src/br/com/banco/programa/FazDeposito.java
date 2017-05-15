package br.com.banco.programa;

import br.com.banco.model.Conta;

public class FazDeposito implements Runnable{
	private final Conta conta;
	public FazDeposito(Conta conta) {
		this.conta = conta;
	}
	@Override
	public void run() {
		conta.deposita(100.0);
	}
	
	
}
