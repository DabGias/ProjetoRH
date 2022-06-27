
public class Presidente extends Funcionario {
	private double valorCota;
	
	public Presidente(int cod, String nome, double salario, double valorCota) {
		super(cod, nome, salario);
		this.valorCota = valorCota;
	}
	
	@Override
	public double getSalario() {
		double salario = super.getSalario() + this.valorCota;
		return salario;
	}

	public double getValorCota() {
		return valorCota;
	}

	public void setValorCota(double valorCota) {
		this.valorCota = valorCota;
	}
}
