package exercicio;

public class EditorVideo extends Funcionario {
	@Override
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonifica��o do Editor de video ");
		return super.getBonificacao() + 100;
		
	}

}
