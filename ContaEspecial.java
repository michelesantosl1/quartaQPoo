public class ContaEspecial extends Conta {

	private double limite;
	
	public ContaEspecial(String numero, String cliente) {
		super(numero, cliente);
		this.limite = 500;
		this.numero += "S";
	}
	
	public ContaEspecial(String numero, String cliente, double saldo) { 
		this(numero, cliente);
		this.saldo = saldo;
	}
	
	
	public void setLimite(double valor) {
		this.limite = valor;
	}
	
	public void setLimite(String valor) {
	    double  num = Double.parseDouble(valor);
		this.limite = num;
	}
	
	
	public double getLimite() {
		return this.limite;
	}
	
	@Override
	public void debitar(double valor) {
		double saldoTotal = saldo + limite;
		if(valor <= saldoTotal) {
			this.saldo = this.saldo - valor;
		}
	}
	
	@Override
	public String toString() {
		return super.toString()+
				"\nLimite: "+this.limite+
				"\nStaldo Total: "+(this.limite + this.saldo)+
				"\n-----------------\n";
	}
}

