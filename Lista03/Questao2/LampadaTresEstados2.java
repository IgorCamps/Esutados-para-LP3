//Questão 2
public class LampadaTresEstados2 {
    
    int Lampada = 100;

    void acende(){
        Lampada = 100;
    }

    void apaga(){
        Lampada = 0;
    }

    void mostraEstado(){
        if (Lampada==100) {
            System.out.println("Lâmpada acessa!!");
        }else{
            System.out.println("Lâmpada apagada!!");
        }
    }

    public static void main(String[] args) {
        LampadaTresEstados2 Lampada = new LampadaTresEstados2();
        
        Lampada.mostraEstado();
        Lampada.apaga();
        Lampada.mostraEstado();
        Lampada.acende();
        Lampada.mostraEstado();

    }
}