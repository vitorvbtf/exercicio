package exercicio;

public class TesteReferencia {
	public static void main(String[] args) {
		
	ControleBonificacao controle = new ControleBonificacao();

	Funcionario f1 = new Funcionario();
	
	f1.setNome("Vítor");
	f1.setCpf("153.648.491-33");
	f1.setSalario(2000);
	
	
	Gerente g1 = new Gerente();
	
	g1.setNome("Lucas");
	g1.setCpf("456.854.956-32");
	g1.setSalario(5000);
	
	
	EditorVideo ev = new EditorVideo();
	
	ev.setNome("Pedro");
	ev.setCpf("489.224.956-10");
	ev.setSalario(2500);
	
	controle.registra(f1);
	controle.registra(g1);
	controle.registra(ev);
	
	System.out.println(ev.getBonificacao());
	
	System.out.println(controle.getSoma());
	
	
	
	}
}
