public class Conta {
	protected String numero;
	protected String cliente;
	protected double saldo;

	public Conta(PessoaFisica cliente1) {
	}

	public Conta(String numero, String cliente) {
		this.numero = numero;
		this.cliente = cliente;
	}

	public Conta(String numero, String cliente, double saldo) {
		this(numero, cliente);
		this.saldo = saldo;
	}

	private String mostra() {
		String saida = "--------------";
		saida += "\nCliente: " + this.cliente;
		saida += "\nNumero: " + this.numero;
		saida = saida + "\nSaldo :" + this.saldo;
		saida += "\n-------------";
		return saida;
	}
	
	@Override
	public String toString() {
		return "\n"+ mostra();
	}

	public void creditar(double valor) {
		if (valor >= 0) {
			this.saldo += valor;
		}
	}

	public void debitar(double valor) {
		if (valor <= this.saldo) {
			this.saldo = this.saldo - valor;
		}
	}

	public Conta clone() {
		Conta cloneObj = new Conta(numero, cliente);
		cloneObj.creditar(saldo);
		return cloneObj;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public String getCliente() {
		return this.cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

}
