package conta;

import java.util.Scanner;

import conta.model.Conta;
import conta.model.ContaCorrente;

public class Menu {

	public static void main(String[] args) {
		
		
		//Utilizando métodos da superClasse Conta
		Conta c = new Conta(1, 123, 1, "Maria Silva", 10000.0f);
		c.visualizar();
		System.out.println(c.getSaldo());
		c.depositar(1000);
		c.sacar(500);
		System.out.println();
		System.out.println(c.getSaldo());
		System.out.println();
		
		
		//Utilizando métodos da subClasse ContaCorrente
		ContaCorrente c1 = new ContaCorrente(2, 321, 1, "Jose Silva", 5000.0f, 1000.0f);
		c1.visualizar();
		c1.sacar(5900);
		
		//MENU PARA GERENCIAR CONTAS
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		while(true) {
			System.out.println("___________________________________________________________________");
			System.out.println("                                                                   ");
			System.out.println("                          PURPLE BANK                              ");
			System.out.println("                                                                   ");
			System.out.println("___________________________________________________________________");
			System.out.println("                                                                   ");
			System.out.println("                   1- Abrir Conta                                  ");
			System.out.println("                   2- Listar todas as contas                       ");
			System.out.println("                   3- Buscar conta por número                      ");
			System.out.println("                   4- Atualizar dados da conta                     ");
			System.out.println("                   5- Desativar conta                              ");
			System.out.println("                   6- Saque                                        ");
			System.out.println("                   7- Depósito                                     ");
			System.out.println("                   8- Transferência entre contas                   ");
			System.out.println("                   9- Sair                                         ");
			System.out.println("                                                                   ");
			System.out.println("___________________________________________________________________");
			System.out.println(">>>> Digite sua opção:                                             ");

			opcao = leia.nextInt();
			if(opcao == 9) {
				System.out.println("Sistema Finalizado.");
				System.exit(0);
			}
			switch(opcao){
			case 1 ->{
				System.out.println("Abrir conta\n");
			}
			case 2 ->{
				System.out.println("Listar todas as contas\n");
			}
			case 3 ->{
				System.out.println("Buscar conta por número\n");
			}
			case 4 ->{
				System.out.println("Atualizar dados da conta\n");
			}
			case 5 ->{
				System.out.println("Desativar conta\n");
			}
			case 6 ->{
				System.out.println("Saque\n");
			}
			case 7 ->{
				System.out.println("Depósito\n");
			}
			case 8 ->{
				System.out.println("Transferência entre contas\n");
			}
			default ->System.out.println("Opção inválida!");
			}
			
		}

	}

}
