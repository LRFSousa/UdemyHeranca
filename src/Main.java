
public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.nome = "Luis";
		
		Vendedor v = new Vendedor();
		v.nome = "Marcelo";
		v.comissao = 255.90;
		
		System.out.println("Nome: "+p.nome+"\nVendedor: "+v.nome+" recebeu: "+v.comissao);
		
	}

}
