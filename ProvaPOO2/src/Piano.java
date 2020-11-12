
public class Piano extends InstrumentoMusical{

	private int teclas;
	private String tipo;
	
	public Piano(int coloracao, double preco, int teclas, String tipo) throws ExcecaoPianoInvalido {
		super(coloracao, preco);
		
		if (!((tipo.equals("Acustico de cauda")) || ((tipo.equals("Acustico Vertical")) || ((tipo.equals("Digital")))))) {
			throw new ExcecaoPianoInvalido("Tipo de Piano " + "[" + tipo + "]" + " inexistente");
		}
		
		this.teclas = teclas;
		this.tipo = tipo;
	}


	public void imprime() {
		System.out.println("Cor = " + super.nomeColoracao(super.getColoracao()));
		System.out.println("Teclas = "+ teclas);		
		System.out.println("Preço = " + "R$" + super.preco);
		System.out.println("Tipo = " + tipo);

	
		
	}
	
}
