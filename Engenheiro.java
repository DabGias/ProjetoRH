
public class Engenheiro extends Funcionario {
	private String depart;
	private int crea;
	
	public Engenheiro(int cod, String nome, double salario, String depart, int crea) {
		super(cod, nome, salario);
		this.depart = depart;
		this.crea = crea;
	}
	
	@Override
	public double getSalario() {
		double salario;
		salario = super.getSalario() + (super.getSalario() * 0.5);
		return salario;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public int getCrea() {
		return crea;
	}
}
