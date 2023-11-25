package Lista03;

public class ModeloLampada {

    boolean lampadaAcessa = true;
    float preco=0;


    void ValorLampada(){
        preco = 4.5F;
    }

    void MostrarValor(){
        System.out.println("O valor da lampada é: " + preco);
    }
    void acende(){
        lampadaAcessa = true;
    }

    void apaga(){
        lampadaAcessa = false;
    }

    void mostraEstado(){
        if (lampadaAcessa==true)
            System.out.println("Lâmpada acessa!!");
        else
            System.out.println("Lâmpada apagada!!");
    }

    boolean esLigada(){
        if(lampadaAcessa==true)
            return true;
        else
            return false;
        
    }
    public static void main(String[] args) {
        ModeloLampada Lamp = new ModeloLampada();
        
        Lamp.mostraEstado();
        Lamp.apaga();
        Lamp.mostraEstado();
        Lamp.acende();
        Lamp.mostraEstado();
        Lamp.ValorLampada();
        Lamp.MostrarValor();

        if(Lamp.esLigada())
            System.out.println(true);
        else   
            System.out.println(false);

    }
}