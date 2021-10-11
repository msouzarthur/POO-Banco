package SistemaBancario;

public class Poupanca extends Conta{
	public Poupanca(String n, int c, Banco banco)
	{
		super(n, c, banco);
	}
	public void retirar(float quantia)
	{
		if((this.pegaSaldo()-quantia)<=0)
		{
			System.out.println("Saldo insuficiente");
		}
		else
		{
			this.debita(quantia);
		}
	}
}
