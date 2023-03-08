package bytebank;

public class Teste {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		c1.setNome("Lavínia");
		c1.setCpf("222222222");
		c1.setProfissao("Desenvolvedora Back End");
		
		Cliente c2 = new Cliente();
		c2.setNome("Yves");
		c2.setCpf("444444444");
		c2.setProfissao("Desenvolver Full Stack");
		
		ContaCorrente cc1 = new ContaCorrente(1111, 1);
		cc1.setTitular(c1);
		cc1.deposita(5000);
		cc1.saca(2000);
		
		ContaPoupanca cp1 = new ContaPoupanca(1111, 2);
		cp1.setTitular(c2);
		cp1.deposita(3000);
		cp1.saca(1000);
		
		cc1.transfere(200, cp1);
		
		System.out.println("A cliente " + c1.getNome() + " que possui o cpf " + c1.getCpf() + " cuja profissão é de " + c1.getProfissao() +
		", possui um saldo atual de R$" + cc1.getSaldo() + ". O imposto cobrado nessa conta é de R$" + cc1.getValorImposto());
		
		System.out.println("O cliente " + c2.getNome() + " que possui o cpf " + c2.getCpf() + " cuja profissão é de " + c2.getProfissao() +
				", possui um saldo atual de R$" + cp1.getSaldo() + ".");
		
	}

}
