
public class Gerente extends Funcionario {
	private String area;
	private double bonus;
	
	public Gerente(int cod, String nome, double salario, String area, double bonus) {
		super(cod, nome, salario);
		this.area = area;
		this.bonus = bonus;
	}
	
	@Override
	public double getSalario() {
		double salario;
		salario = super.getSalario() + this.bonus;
		return salario;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
}
