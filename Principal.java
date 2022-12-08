public class Principal {
	public static void main(String[] args) {

        PessoaFisica cliente1 = new PessoaFisica(null, null, null);
		Conta c1 = new Conta(cliente1);

		c1.creditar(2000.0);
		c1.debitar(100);


        PessoaJuridica cliente2 = new PessoaJuridica(null, null, null);
		ContaEspecial c2 = new ContaEspecial(null, null);
		c2.debitar(0);

		Conta c = new Conta("234-8", "Jeová");
		c.creditar(2000.0);
		c.debitar(100);
		double valor = c.getSaldo() ;
		c.setCliente("Jeová Tavares");
		
		
		
		new ContaEspecial("875-8", "Samuel Rodrigues", 200);
		c2.debitar(500);
		
		c2.creditar(2000);
		
		Object c3 = new Object();

		System.out.println(c.toString());

		System.out.println(c2.toString());
		
		System.out.println(c3.toString());
	}
}
