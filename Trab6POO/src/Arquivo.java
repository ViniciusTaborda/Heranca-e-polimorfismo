
public class Arquivo {
    protected String nome;
    protected int endereco;
    protected int blocos;

    public Arquivo(String nome, int endereco, int blocos) {
        this.nome = nome;
        this.endereco = endereco;
        this.blocos = blocos;
    }

    public String getNome () {
        return this.nome;
    }

    public void imprimirNome(){
        System.out.println("  . " + nome);
    }

    public void abrir () {
        System.out.println(this.nome);
    }
}