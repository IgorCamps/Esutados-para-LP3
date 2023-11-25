import java.util.Random;
public class q2 {
    public static void main(String[] args) {
        System.out.println("Jogo do CRAPS.\n");

        int ponto = 0, dado1, dado2, somaD, lancamento = 0;
        
        Random rDado1 = new Random();
        Random rDado2 = new Random();

        dado1 = 1 + rDado1.nextInt(6);
        dado2 = 1 + rDado2.nextInt(6);

        somaD = dado1 + dado2;

        System.out.println("Dado 1:" + dado1 + "\nDado 2: " + dado2 + "\nPonto: " + somaD);

        if (somaD == 7) {
            System.out.println("Parabéns, você ganhou!");
        }else if (somaD == 2 || somaD == 3 || somaD == 12) {
            System.out.println("CRAPS! Você perdeu!");
        }else{
            ponto = somaD;
            System.out.println("Iniciando estágio 2\n");
            lancamento = 1;
        }

        while (lancamento == 1) {
            dado1 = 1 + rDado1.nextInt(6);
            dado2 = 1 + rDado2.nextInt(6);
            somaD = dado1 + dado2;

            System.out.println("Dado 1: " + dado1 + "\nDado 2: " + dado2 + "\nPonto: " + somaD);

            if (somaD == 7) {
                System.out.println("CRAPS! Você perdeu!");
            }else if(somaD == ponto){
                System.out.println("Parabéns, você ganhou!");
                lancamento = 0;
            }
        }










    }
}
