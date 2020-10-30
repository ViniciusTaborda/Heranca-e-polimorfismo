
public class Profissional extends Jogador {
	
	private double capital;

	public Profissional(String nome, int score, double capital) {
		super(nome, score);
		this.capital = capital;
	}

	
	public void imprimir() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Score: " + this.score);
		System.out.println("Capital: " + this.getCapital());

	}
	
	
	public void ganhar(int p) {
		this.score += p;
		this.capital += (p * 4);
		
	}
	
	public void perder(int p) {
		this.score -= p;
		this.capital -= (p * 4);
		
	}
	
	
	//GETTERS E SETTERS
	public double getCapital() {
		return capital;
	}

	
	
	
	

	


	

	
	
	
}
