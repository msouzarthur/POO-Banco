package SistemaBancario;
import java.util.Scanner;
/**
 * @author Arthur Machado de Souza - 19102583
 * Engenharia de Computação - POO
 */
public class Teste {
	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			int opcao = 1;
			String nome;
			System.out.println("Digite o nome do titular da conta");
			nome = entrada.next();
			while(opcao!=0)
			{
				System.out.println("1 - Criar conta Itau");
				System.out.println("2 - Criar conta BB");
				System.out.println("3 - Criar conta Bradesco");			
				System.out.println("0 - Sair");			
				System.out.println("Digite a opção: ");
				opcao = entrada.nextInt();
				if(opcao==1) 
				{
					Banco itau = new Banco("Itau");
					Conta cadastro = itau.criaConta(nome);
					System.out.println("Nome do titular da conta: "+cadastro.pegaNome());
					System.out.println("Saldo da conta: "+cadastro.pegaSaldo());
					System.out.println("Código da conta: "+cadastro.pegaCodigo());
					System.out.println("Nome do banco: "+cadastro.pegaBanco());
				}
				if(opcao==2)
				{
					Banco bb = new Banco("Banco do Brasil");
					Conta cadastro = bb.criaConta(nome);
					System.out.println("Nome do titular da conta: "+cadastro.pegaNome());
					System.out.println("Saldo da conta: "+cadastro.pegaSaldo());
					System.out.println("Código da conta: "+cadastro.pegaCodigo());
					System.out.println("Nome do banco: "+cadastro.pegaBanco());
				}
				if(opcao==3)
				{
					Banco bradesco = new Banco("Bradesco");
					Conta cadastro = bradesco.criaConta(nome);
					System.out.println("Nome do titular da conta: "+cadastro.pegaNome());
					System.out.println("Saldo da conta: "+cadastro.pegaSaldo());
					System.out.println("Código da conta: "+cadastro.pegaCodigo());
					System.out.println("Nome do banco: "+cadastro.pegaBanco());
				}
			}
		}
	}
}