package view;

import model.*;

public class main {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("André", "123.456.789-10", "14/03/1999", "R. Ilicinea 624 Centro");
		Fornecedor fo1 = new Fornecedor("Toyota", "123456789/0001-10", "Japão");
		Funcionario fu1 = new Funcionario("Deyvisson", "Diretor", "21/03/2023", true, 5000.00);
		Veiculo v1 = new Veiculo("Corola", "2023", "Preto", "ABCD1020");
		Vendas ve2 = new Vendas(0, fu1, "A vista", 100000.00);

		System.out.println(c1);
		System.out.println(fo1);
		System.out.println(fu1);
		System.out.println(v1);
		System.out.println(ve2);

		

	}

}
