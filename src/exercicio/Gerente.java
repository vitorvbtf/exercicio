package exercicio;

public class Gerente extends Funcionario{
	@Override
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do Gerente ");
		return super.getBonificacao() + getSalario();
	}
}
