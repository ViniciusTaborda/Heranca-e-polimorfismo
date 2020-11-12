
public abstract class InstrumentoMusical {

	private int coloracao;
	protected double preco;
	
	
	public abstract void imprime();


	public InstrumentoMusical(int coloracao, double preco) {
		super();
		this.coloracao = coloracao;
		this.preco = preco;
	}


	public double getPreco() {
		return preco;
	}

	public String nomeColoracao(int coloracao) {
		switch(coloracao) {
		case 1:
			return "Preto";			
		case 2:
			return "Castanho";
		case 3:
			return "Amarelo";
		case 4:
			return "Azul";
		case 5:
			return "Vermelho";
		default:
			return "Branco";
		
		}
		
	}


	public int getColoracao() {
		return coloracao;
	}

	

	
	
}
