package teste_lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Conta> lista_contas = new ArrayList<>();
		
		Conta conta1 = new ContaCorrente();
		Conta conta2 = new ContaCorrente();
		
		lista_contas.add(conta1);
		lista_contas.add(conta2);
		
		System.out.println(lista_contas.indexOf(conta2));
		
		lista_contas.get(1).setOwner(sc.nextLine());
		
		System.out.println(lista_contas.get(1).getOwner());
		
		sc.close();
	}

}
