public class Pinguim extends Ladrao{
   
	public Pinguim(int cor) {
		super(cor);
	}

	public void atirar (){
		System.out.println("Pinguim  atirando...");

    }

    public void correr (float x, float y){
    	this.posicaoX = x;
    	this.posicaoY = y;
    	System.out.println("Pinguim esta correndo...");

    }
}
