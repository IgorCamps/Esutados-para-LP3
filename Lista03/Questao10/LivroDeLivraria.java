package Lista03.Questao10;

public class LivroDeLivraria {

    String nome;
    String numeracao;
    String genero;
    float preco;
    int quantidade;


    void inicilizaLivro(String nomeLivro, String numeracaoLivro, String generoLivro, float NovoPreco, int NovaQuantidade){
        nome = nomeLivro;
        numeracao = numeracaoLivro;
        genero = generoLivro;
        preco = NovoPreco;
        quantidade = NovaQuantidade;
    }

    void mostraLivro(){
        String exibir = "Nome do livro: " + nome + "\nNumeracao do livro: " + numeracao + "\nGenero do livro: " + genero;
        exibir += "\nPreço do livro: " + preco + "\nQuantidade: " + quantidade;
        System.out.println(exibir);
    }

    public static void main(String[] args) {
        LivroDeLivraria LivroSimples = new LivroDeLivraria();

        LivroSimples.inicilizaLivro("Harry Potter e o Prisioneiro de Azkaban: 3", "853253080X", "Fantasia", 37.28f, 20);
        LivroSimples.mostraLivro();
    }
}
