import java.util.ArrayList;

public class Orquestra {

	private ArrayList<InstrumentoMusical> instrumentos;
	private String nome = "Filarmonica";
	
	public static void main(String[] args) throws Throwable {
			Orquestra orq = new Orquestra("Orquestra Filarmonica"); 
		
		try {
			
			orq.instrumentos.add(new Piano(1, 3000.00, 88, "Digital"));
			orq.instrumentos.add(new Violino(2, 1000.00, 4, "1/2"));
			orq.instrumentos.add(new Piano(1, 3000.00, 88, "Acustico de cauda"));
			
			orq.instrumentos.add(new Piano(5, 3453.00, 88, "Digital"));
			orq.instrumentos.add(new Violino(5, 13450.00, 4, "1/2"));
			orq.instrumentos.add(new Piano(1, 3000.00, 88, "Acustico de cauda"));
			orq.instrumentos.add(new Violino(2, 2000.00, 4, "3/4")); //aqui fica interrompiada a exeução do codigo pois o tamanho é invalido
			orq.instrumentos.add(new Violino(2, 2000.00, 4, "3/7")); 
	
		}catch (ExcecaoViolinoInvalido e) {
			System.out.println("ERRO: " +  e.getMessage());
		}
		
	
		orq.imprimeOrquestra();
		
		
		Orquestra orq2 = new Orquestra("Orquestra Sinfonica"); 
		
		try {
			
			orq2.instrumentos.add(new Violino(5, 800.00, 4, "4/4"));
			orq2.instrumentos.add(new Piano(10, 5000.00, 88, "Acustico"));
			


			
			
	
		}catch (ExcecaoPianoInvalido e) {
			System.out.println("ERRO: " +  e.getMessage());
		}
	
		orq2.imprimeOrquestra();
		
		
		
		
	}
	
	public Orquestra(String nome) {
		super();
		this.nome = nome;
		this.instrumentos = new ArrayList<InstrumentoMusical>();
	}

	
	public void imprimeOrquestra() {
		
		System.out.println();
		System.out.println();
		System.out.println(nome);
		System.out.println("---------------------------------------------");
		
		for (InstrumentoMusical instrumento : this.instrumentos) {
			
			String[] nomeClasse = instrumento.toString().split("@");
			
			System.out.println("[" + nomeClasse[0] + "]");
			instrumento.imprime();
			System.out.println("---------------------------------------------");

			
			
		}
		
		
	}

}
