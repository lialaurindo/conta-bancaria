package conta.model;

public class ContaPoupanca extends Conta {

	private int aniversarioConta;

	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int aniversarioConta) {
		super(numero, agencia, tipo, titular, saldo);
		this.aniversarioConta = aniversarioConta;
	}

	public int getAniversarioConta() {
		return aniversarioConta;
	}

	public void setAniversarioConta(int aniversarioConta) {
		this.aniversarioConta = aniversarioConta;
	}

	 @Override
		public void visualizar() {
			super.visualizar();
			System.out.println("Aniversário da conta: " + this.aniversarioConta);
		}
	
	
}
