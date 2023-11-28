package Lista03.Questao14;

import Lista03.Questao12.Ponto2D;

public class Retangulo {
    Ponto2D pontoSuperiorEsquerdo;
    Ponto2D pontoSuperiorDireito;

    public Retangulo(Ponto2D pontoSupEsq, Ponto2D pontoSupDir){
        pontoSuperiorEsquerdo = pontoSupEsq;
        pontoSuperiorDireito = pontoSupDir;
    }

    void mostraRetangulo(){
        System.out.println("Ponto Superior Esquerdo: ");
        pontoSuperiorEsquerdo.mostraPonto();

        System.out.println("Ponto Superior Direito");
        pontoSuperiorDireito.mostraPonto();
    }

    public static void main(String[] args) {
        //Criando pontos para o retângulo
        Ponto2D pontoSupEsq = new Ponto2D();
        pontoSupEsq.inicilizaPonto(2,4);

        Ponto2D pontoSupDir = new Ponto2D();
        pontoSupDir.inicilizaPonto(3,2);

        //Criando o retângulo
        Retangulo retangulo = new Retangulo(pontoSupEsq, pontoSupDir);

        //Exibir o retângulo
        retangulo.mostraRetangulo();
    }

}
