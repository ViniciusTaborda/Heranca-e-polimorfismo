public abstract class Terrorista extends Vilao{

    public Terrorista(int cor) {
		super(cor);
	}

    public void saltar (float z){
		System.out.println("Terrotista saltando...");
		this.posicaoZ = z;
    }

    public void atirar(){
    	System.out.println("Terrotista atirando..." );
    }
    
}
