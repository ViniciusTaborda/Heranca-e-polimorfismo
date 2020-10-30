
public class Jogador {

	private String nome;
	protected int score;
	
	
	public Jogador(String nome, int score) {
		super();
		this.nome = nome;
		this.score = score;
	}
	
	
	public void imprimir() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Score: " + this.score);
	}


	public String getNome() {
		return nome;
	}


	

	
	
}
