package Lista03.Questao7;

public class Data {
    int dia, mes, ano;

    void inicializaData(int umDia, int umMes, int umAno){
        
        if ((dataEValida(umDia, umMes))) {
            dia = umDia;
            mes = umMes;
            ano = umAno;
        }else{
            dia = 0;
            mes = 0;
            ano = 0;
        }
        
    }

    boolean dataEValida(int umDia, int umMes){
        if ((umDia >=1) && (umDia <= 31) && (umMes >=1) && (umMes<=12))  {
            return true;
        }else{
            return false;
        }
    }

    void mostraData(){
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    public static void main(String[] args) {
        Data data1 = new Data();

        
        data1.inicializaData(21,06,2002);
        data1.mostraData();

    }
}
