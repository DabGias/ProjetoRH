
public abstract class Funcionario {
	private int cod;
	private String nome;
	private double salario;
	
	public Funcionario(int cod, String nome, double salario) {
		this.cod = cod;
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCod() {
		return cod;
	}

	public double getSalario() {
		return salario;
	}
}
