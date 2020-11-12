public class Teste {

    public static void main(String[] args) {
    	
    	Batman bat = new Batman(1);
    	Coringa coring = new Coringa(2);
    	Pinguim ping = new Pinguim(2);
    	
    	JamesBond james = new JamesBond(1);
    	DrNo dr = new DrNo(2);
    	Goldfinger gold = new Goldfinger(2);
    	
    	bat.atirar();
    	bat.correr(20, 30);
    	bat.camuflar(2);
    	bat.saltar(20);
    	System.out.println("--------------------");
    	
    	coring.correr(20, 30);
    	coring.atirar();
    	coring.saltar(5);
    	System.out.println("--------------------");
    	
    	ping.correr(20, 30);
    	ping.atirar();
    	ping.saltar(4);
    	System.out.println("--------------------");

    	james.atirar();
    	james.correr(20, 30);
    	james.saltar(5);
    	System.out.println("--------------------");

    	dr.correr(20, 30);
    	dr.atirar();
    	dr.saltar(5);
    	System.out.println("--------------------");

    	gold.personificar(james);
    	gold.camuflar(1);
    	gold.correr(20, 30);
    	gold.atirar();
    	gold.saltar(2);
    	
    	
    	
    	
    }
}
