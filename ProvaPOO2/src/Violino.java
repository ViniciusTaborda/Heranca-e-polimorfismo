
public class Violino extends InstrumentoMusical{

	private int cordas;
	private String tamanho;
	
	public Violino(int coloracao, double preco, int cordas, String tamanho) throws ExcecaoViolinoInvalido{
		super(coloracao, preco);
		
		if ( !((tamanho == "4/4") || (tamanho == "1/2") || (tamanho == "1/4"))) {
			throw new ExcecaoViolinoInvalido("Tamanho de violino" + "[" + tamanho + "]" + " inexistente");
		}
		
		this.cordas = cordas;
		this.tamanho = tamanho;
	}

	public void imprime() {
		System.out.println("Cor = " + super.nomeColoracao(super.getColoracao()));
		System.out.println("Cordas = "+ cordas);		
		System.out.println("Preço = " + "R$" + super.preco);
		System.out.println("Tamanho = " + tamanho);

	
		
	}

	public int getCordas() {
		return cordas;
	}

	public void setCordas(int cordas) {
		this.cordas = cordas;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	
}
