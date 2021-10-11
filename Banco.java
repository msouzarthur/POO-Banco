package SistemaBancario;

//import SistemaBancario.Conta;
//import SistemaBancario.Poupanca;

public class Banco {
	private static int prox_banco = 1;
	private int max_contas = 10;
	private String nome;
	private int codigo, prox_conta, ind_array;
	private Conta[] contas;
	public Banco (String n){
		this.nome = n;
		this.codigo = prox_banco++;
		this.prox_conta = 1;
		this.contas = new Conta[max_contas];
		this.ind_array = 0;
	}
	public int pegaCodB() {
		return this.codigo;
	}
	public String pegaNomeB() {
		return this.nome;
	}
	public Conta criaConta(String nome) {
		Conta c;
		if(prox_conta==max_contas)
		{
			c = null;
		}
		else
		{
			c = new Conta(nome,prox_conta++,this);
			contas[ind_array++] = c;
		}
		return c;
	}
	public Conta buscaConta(int cod) {
		int i;
		for(i=0;i<ind_array;i++) {
			if(contas[i].pegaCodigo()==cod)
				return contas[i];
		}
		return null;
	}
	public int getProxConta()
	{
		return this.prox_conta;
	}
	public void setProxConta(int valor){
		this.prox_conta = valor;
	}
	public void alteraNome(String n) {
		this.nome = n;
	}
	public Poupanca criaPoupanca(String n) {	
		Poupanca c;
		if (ind_array == max_contas) 
		{
			c = null;
		} 
		else 
		{
			 c = new Poupanca(nome, this.prox_conta, this);
			 this.prox_conta++;
			 this.contas[ind_array++] = c;
		}
		return c;
		}
}
