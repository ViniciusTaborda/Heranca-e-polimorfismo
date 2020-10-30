
public class Senior extends Profissional {
	
	private double premio;

	public Senior(String nome, int score, double capital, double premio) {
		super(nome, score, capital);
		this.premio = premio;
	}

	public void imprimir() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Score: " + this.score);
		System.out.println("Capital: " + this.getCapital());
		System.out.println("Premio: " + this.premio);

	}

	public void ganhar(int p) {
		super.ganhar(p);
		this.premio += (this.premio * 2);
		
	}
	
	public void perder(int p) {
		super.perder(p);
		this.premio = (this.premio / 2);
		
	}
	
	
	
	
}
