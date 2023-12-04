package Lista04.Questao2;
import Lista04.Questao1.Data;

public class Contato {
    private String nome;
    private String email;
    private String telefone;
    private Data DataNascimento;
    private Data dataAtual;

    public void inicializarContato(){
        nome = " ";
        email = " ";
        telefone = " ";
        DataNascimento = new Data();
        DataNascimento.inicilizaData(); 
        dataAtual = new Data();   
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;        
    }

    public void imprimirContato(){
        System.out.println("Nome: " + nome + "\nE-mail: "+email + "\nTelefone: "+ telefone + "\nData de nascimento: ");
        DataNascimento.imprimirData();
    }

    public int calcularIdade(int dia, int mes, int ano){

        int idade;

        dataAtual.setData(3,12,2023);

        DataNascimento.setData(dia, mes, ano);

        idade = dataAtual.getAno() - DataNascimento.getAno();

        return idade;
        
    }

    public static void main(String[] args) {
        Contato contato1 = new Contato();
        
        contato1.inicializarContato();

        contato1.imprimirContato();        

        if (contato1.calcularIdade(21,06,2002) >= 18) {
            System.out.println("Maior de idade!");
        }else{
            System.out.println("Menor de idade!");
        }

        contato1.setNome("Igor Campos");
        contato1.setTelefone("(73) 98857-2196");
        contato1.setEmail("igoruser07@gmail.com");
        
        contato1.imprimirContato(); 
    }
}
