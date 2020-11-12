public class Goldfinger extends Terrorista implements Camuflagem{

    public Goldfinger(int cor) {
		super(cor);
	}

	private Heroi heroi;

    public void saltar (float z){
    	System.out.println("Goldfinger saltando...");
    	this.posicaoZ = z;
    }

    public void camuflar(int cor) {
    	System.out.println("Goldfinger camuflando...");
    	this.cor = cor;

    }

	public void personificar(Heroi heroi) {
		String vetor[] = heroi.toString().split("@");
		System.out.println("Personificando " + vetor[0]);
		
	}
}

