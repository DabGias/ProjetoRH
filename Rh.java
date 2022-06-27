
public class Rh {

	public static void main(String[] args) {
		Engenheiro engenheiro = new Engenheiro(1, "Pedro", 100, "Agro", 123);
		Gerente gerente = new Gerente(2, "João", 1000, "TI", 500);
		Presidente presidente = new Presidente(3, "Lucas", 3000, 500);
		
		System.out.println(engenheiro.getSalario());
		System.out.println(gerente.getSalario());
		System.out.println(presidente.getSalario());
	}

}
