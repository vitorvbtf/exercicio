package exercicio;

public class Gerente extends Funcionario{
	@Override
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonifica��o do Gerente ");
		return super.getBonificacao() + getSalario();
	}
}
