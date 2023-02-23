package conta;

import java.io.IOException;
import java.util.Scanner;

import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {

		/* Utilizando métodos da superClasse Conta
		 * Usado quando ainda não tinhamos tornado a classe Absctract
		 * 
		Conta c = new Conta(1, 123, 1, "Maria Silva", 10000.0f);
		c.visualizar();
		System.out.println(c.getSaldo());
		c.depositar(1000);
		c.sacar(500);
		System.out.println();
		System.out.println(c.getSaldo());
		System.out.println();
		 */
		
		// Utilizando métodos da subClasse ContaCorrente
		ContaCorrente c1 = new ContaCorrente(2, 321, 1, "Jose Silva", 5000.0f, 1000.0f);
		c1.visualizar();
		c1.sacar(5900);

		// Utilizando métodos da subClasse Conta Poupança
		ContaPoupanca c4 = new ContaPoupanca(4, 123, 2, "Lia", 20000.0f, 5);
		c4.visualizar();

		
		//Usando no Input
		
		Scanner leia = new Scanner(System.in);
		int opcao, numero, agencia, tipo, aniversario, numeroDestino;
		float saldo, limite, valor;
		String titular;

		// MENU PARA GERENCIAR CONTAS
		

		while (true) {
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
			if (opcao == 9) {
				System.out.println("Sistema Finalizado.");
				System.exit(0);
			}
			switch (opcao) {
			case 1:
				System.out.println("Criar Conta\n\n");

				System.out.println("Número da Agencia: ");
				agencia = leia.nextInt();

				System.out.println("Nome do Titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();

				do {
					System.out.println("Tipo da Conta (1-CC / 2-CP): ");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);

				System.out.println("Saldo da Conta: ");
				saldo = leia.nextFloat();

				switch (tipo) {
				case 1 -> {
					System.out.println("Limite da Conta Corrente: ");
					limite = leia.nextFloat();
					ContaCorrente cc = new ContaCorrente(0, agencia, tipo, titular, saldo, limite);
					cc.visualizar();
				}
				case 2 -> {
					System.out.println("Aniversário da Conta Poupança: ");
					aniversario = leia.nextInt();
					ContaPoupanca cp = new ContaPoupanca(0, agencia, tipo, titular, saldo, aniversario);
					cp.visualizar();
				}
				}

				keyPress();
				break;
			case 2:
				System.out.println("Listar todas as Contas\n\n");

				keyPress();
				break;
			case 3:
				System.out.println("Consultar dados da Conta - por número\n\n");

				System.out.println("Número da Conta: ");
				numero = leia.nextInt();

				keyPress();
				break;
			case 4:
				System.out.println("Atualizar dados da Conta\n\n");

				System.out.println("Número da Conta: ");
				numero = leia.nextInt();

				// Condicional para checar se a conta existe

				System.out.println("Número da Agencia: ");
				agencia = leia.nextInt();

				System.out.println("Nome do Titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();

				// Busca do tipo
				tipo = 0;

				System.out.println("Saldo da Conta: ");
				saldo = leia.nextFloat();

				switch (tipo) {
				case 1 -> {
					System.out.println("Limite da Conta Corrente: ");
					limite = leia.nextFloat();
					ContaCorrente cc = new ContaCorrente(0, agencia, tipo, titular, saldo, limite);
					cc.visualizar();
				}
				case 2 -> {
					System.out.println("Aniversário da Conta Poupança: ");
					aniversario = leia.nextInt();
					ContaPoupanca cp = new ContaPoupanca(0, agencia, tipo, titular, saldo, aniversario);
					cp.visualizar();
				}
				}

				keyPress();
				break;
			case 5:
				System.out.println("Apagar a Conta\n\n");

				System.out.println("Número da Conta: ");
				numero = leia.nextInt();

				// Chamada para o Método Deletar

				keyPress();
				break;
			case 6:
				System.out.println("Saque\n\n");

				System.out.println("Número da Conta: ");
				numero = leia.nextInt();

				System.out.println("Valor do Saque: ");
				valor = leia.nextFloat();

				// Chamada para o Método Sacar

				keyPress();
				break;
			case 7:
				System.out.println("Depósito\n\n");

				System.out.println("Número da Conta: ");
				numero = leia.nextInt();

				System.out.println("Valor do Depósito: ");
				valor = leia.nextFloat();

				// Chamada para o Método Depositar

				keyPress();
				break;
			case 8:
				System.out.println("Transferência entre Contas\n\n");

				System.out.println("Número da Conta - Origem: ");
				numero = leia.nextInt();

				System.out.println("Número da Conta - Destino: ");
				numeroDestino = leia.nextInt();

				System.out.println("Valor da Transferência: ");
				valor = leia.nextFloat();

				// Chamada para o Método Transferir

				keyPress();
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				keyPress();
				break;
			}
		}
	}

	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}

	}

}
