public class Batman extends Heroi implements Camuflagem{
    
	

	public Batman(int cor) {
		super(cor);
	}

	public void atirar (){
        System.out.println("Batman esta atirando...");
    }


	public void camuflar(int cor) {
    	System.out.println("Batman camuflando...");
    	this.cor = cor;

    }
}

