package Lista03.Questao12;

public class Ponto2D {
    int pontoX;
    int pontoY;

    public void inicilizaPonto(int posX, int posY){
        pontoX = posX;
        pontoY = posY;
    }

    public void mostraPonto(){
        System.out.println("Posição X: " + pontoX + "\nPosição Y: " + pontoY);
    }

    public static void main(String[] args) {
        Ponto2D Ponto = new Ponto2D();

        Ponto.inicilizaPonto(9,1);
        Ponto.mostraPonto();
    }

}
