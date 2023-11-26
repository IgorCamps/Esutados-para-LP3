package Lista03.Questao9;

public class Livro {
    String nome;
    String numeracao;
    String genero;


    void inicilizaLivro(String nomeLivro, String numeracaoLivro, String generoLivro){
        nome = nomeLivro;
        numeracao = numeracaoLivro;
        genero = generoLivro;
    }

    void mostraLivro(){
        System.out.println("Nome do livro: " + nome + "\nNumeracao do livro: " + numeracao + "\nGenero do livro: " + genero);
    }

    public static void main(String[] args) {
        Livro LivroSimples = new Livro();

        LivroSimples.inicilizaLivro("Harry Potter e o Prisioneiro de Azkaban: 3", "853253080X", "Fantasia");
        LivroSimples.mostraLivro();
    }
}
