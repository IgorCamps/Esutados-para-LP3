//Questão 5 b

public class ContaBancariaSimplificadaB {
    
    String nomeCorrentista;
    float saldo;
    boolean contaEspecial = false;

    public void abreConta(String nome, float deposito, boolean especial){
        nomeCorrentista = nome;
        
        if(deposito>=0)
            saldo = deposito;
        else
            saldo = 0.0f;
        
        contaEspecial = especial;
    }

    void abreContaSimples(String nome){
        nomeCorrentista = nome;
        saldo = 0.00f;
        contaEspecial = false;
    }

    void deposita(float valor){
        saldo = saldo + valor;
    }

    void retira(float valor){
        if (contaEspecial == false) {
            if(valor <= saldo)
                saldo = saldo - valor;
        }else{
            saldo = saldo - valor;
        }
    }

    void mostraDados(){
        System.out.println("Nome do correntista: " + nomeCorrentista);
        System.err.println("Saldo: " + saldo);
        if (contaEspecial) {
            System.out.println("A conta é especial");
        }else{
            System.out.println("A conta é comum");
        }
    }

    public static void main(String[] args) {
        
        ContaBancariaSimplificadaB Conta = new ContaBancariaSimplificadaB();
        
        
        Conta.abreConta("Igor", 1459f, true);

        Conta.mostraDados();

        Conta.deposita(890f);
        Conta.retira(90f);

        System.out.println("Extrato da conta após deposito e retirada");
        Conta.mostraDados();
        
    }
}
