
public class Teste {

	public static void main(String[] args) {
		
		Principiante Jogador1 = new Principiante("GuizaoCraftHD", 100, 20);
		Profissional Jogador2 = new Profissional("Kamyplays007", 300, 15);
		Senior Jogador3 = new Senior("XxHannazeiraxX", 200, 5, 1000);
		
		System.out.println("=-=-=-=-==-=-=-=-=Seja bem vindo ao RPG-BSI=-=-=-=-==-=-=-=-=");
		System.out.println();
		
		System.out.println("Stats iniciais do jogador1: " + Jogador1.getNome());
		Jogador1.imprimir();
		
		Jogador1.ganhar(5);
		Jogador1.perder(8);
		
		System.out.println();
		System.out.println("Stats finais: ");
		Jogador1.imprimir();
		System.out.println("================================================");
		
		System.out.println("Stats iniciais do jogador2: " + Jogador2.getNome());
		Jogador2.imprimir();
		
		Jogador2.ganhar(5);
		Jogador2.perder(8);
		
		System.out.println();
		System.out.println("Stats finais: ");
		Jogador2.imprimir();
		System.out.println("================================================");
		
		
		
		System.out.println("Stats iniciais do jogador1: " + Jogador3.getNome());
		Jogador3.imprimir();
		
		Jogador3.ganhar(5);
		Jogador3.perder(8);
		
		System.out.println();
		System.out.println("Stats finais: ");
		Jogador3.imprimir();
		System.out.println("================================================");
		
	}

}
