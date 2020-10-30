
public class Principiante extends Jogador{

	
	private double bonus;

	public Principiante(String nome, int score, double bonus) {
		super(nome, score);
		this.bonus = bonus;
	}
	
	//METODOS ESPECIAIS
	
	public void imprimir() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Score: " + this.score);
		System.out.println("Bonus: " + this.bonus);

	}
	
	public void ganhar(int p) {
		this.score += p;
		this.bonus += (p * 0.1);
		
	}
	
	public void perder(int p) {
		this.score -= p;
		this.bonus -= (p * 0.1);
		
	}
	
	
}
