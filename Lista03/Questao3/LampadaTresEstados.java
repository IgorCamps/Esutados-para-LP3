//Questão 3
public class LampadaTresEstados {

    String Lampada = "Acessa";

    void acende(){
        Lampada = "Acessa";
    }

    void apaga(){
        Lampada = "Apagada";
    }

    void meia_luz(){
        Lampada = "Meia-Luz";
    }

    void mostraEstado(){
        if (Lampada=="Acessa") {
            System.out.println("Lâmpada acessa!!");
        }else if(Lampada=="Apagada"){
            System.out.println("Lâmpada apagada!!");
        }else{
            System.out.println("No estado Meia-Luz");
        }
    }

    public static void main(String[] args) {
        LampadaTresEstados Lampada = new LampadaTresEstados();
        
        Lampada.mostraEstado();
        Lampada.apaga();
        Lampada.mostraEstado();
        Lampada.acende();
        Lampada.mostraEstado();
        Lampada.meia_luz();
        Lampada.mostraEstado();

    }
}