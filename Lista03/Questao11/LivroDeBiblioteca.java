package Lista03.Questao11;

public class LivroDeBiblioteca {

    String nome;
    String numeracao;
    String genero;
    float preco;
    int quantidade;
    int emprestadosQuant;


    void inicilizaLivro(String nomeLivro, String numeracaoLivro, String generoLivro, float NovoPreco, int NovaQuantidade, int qntdEmprest){
        nome = nomeLivro;
        numeracao = numeracaoLivro;
        genero = generoLivro;
        preco = NovoPreco;
        quantidade = NovaQuantidade;
        emprestadosQuant = qntdEmprest;
    }

    void mostraLivro(){
        String exibir = "Nome do livro: " + nome + "\nNumeracao do livro: " + numeracao + "\nGenero do livro: " + genero;
        exibir += "\nPreço do livro: " + preco + "\nQuantidade: " + quantidade;
        exibir += "\nLivros emprestados: " + emprestadosQuant;
        System.out.println(exibir);
    }

    public static void main(String[] args) {
        LivroDeBiblioteca LivroSimples = new LivroDeBiblioteca();

        LivroSimples.inicilizaLivro("Harry Potter e o Prisioneiro de Azkaban: 3", "853253080X", "Fantasia", 37.28f, 20, 12);
        LivroSimples.mostraLivro();
    }
}
