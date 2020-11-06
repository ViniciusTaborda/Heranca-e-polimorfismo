
import java.util.ArrayList;

public class Compactado extends Arquivo{
    private ArrayList<Arquivo> arquivos;

    public Compactado (String nome, int endereco, int blocos){
        super(nome, endereco, blocos);
        arquivos = new ArrayList<>();
    }
    public void compactarArquivo (Arquivo a){
        arquivos.add(a);
    }
    public void abrir (Disco d){
        Pasta pastaDescompactada = d.criarPasta("pastaCompactada");
        for (Arquivo a : arquivos){
            pastaDescompactada.inserir(a);
        }
    }
}
