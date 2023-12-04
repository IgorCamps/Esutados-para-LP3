package Lista04.Questoa4;

public class Ponto2D {
    private int x;
    private int y;

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public boolean isEixoX(){
        if (y == 0 && x != 0) {
            return true;
        }else{
            return false;
        }
    }

    public boolean isEixoY(){
        if (x == 0 && y != 0) {
            return true;
        }else{
            return false;
        }
    }

    public boolean isEixo(){
        if (y == 0 && x == 0) {
            return true;
        }else{
            return false;
        }
    }

    public int quadrante(){
        if (x > 0 && y > 0) {
            return 1;
        }else if(x < 0 && y > 0){
            return 2;
        }else if(x < 0 && y < 0){
            return 3;
        }else if(x > 0 && y < 0){
            return 4;
        }else{
            return 0;
        }

    }

    public float distancia(Ponto2D novoPonto){
        float dist;

        dist = (float) Math.sqrt(Math.pow((novoPonto.x - this.x), 2) + Math.pow((novoPonto.y - this.y), 2));

        return dist;
    }
    
    public static void main(String[] args) {
        Ponto2D pontoAtual = new Ponto2D();

        pontoAtual.setX(4);
        pontoAtual.setY(3);

        Ponto2D outroPonto = new Ponto2D();
        outroPonto.setX(1);
        outroPonto.setY(2);

        float dist = pontoAtual.distancia(outroPonto);

        System.out.println("A distância entre os pontos é: " + dist);
    }
}
