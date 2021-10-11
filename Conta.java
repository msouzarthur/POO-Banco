/**
 * 
 */
package SistemaBancario;

import java.util.Random;

/**
 * @author Arthur Machado de Souza - 19102583
 * Engenharia de Computação - POO
 */
public class Conta {
	private String nome;
	private Banco banco;
	private int codigo;
	private float saldo;
	public Conta(String n, int c, Banco b)
	{
		nome = n;
		codigo = c;
		banco = b;
		saldo = geraSaldo();
	}
	public Banco pegaBanco() 
	{
		return this.banco;
	}
	public String pegaNome()
	{
		return this.nome;
	}
	public int pegaCodigo()
	{
		return this.codigo;
	}
	public float pegaSaldo()
	{
		return this.saldo;
	}
	public void aplica(float soma)
	{
		this.saldo += soma;
	}
	public void debita(float soma)
	{
		this.saldo -= soma;
	}
	public float geraSaldo()
	{
		Random gerador = new Random();
		return gerador.nextInt(10000);
	}
}