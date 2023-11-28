package Lista03.Questao15;

public class NovoData {

    int dia, mes, ano;

    void inicializaData(int umDia, int umMes, int umAno) {

        if ((dataEValida(umDia, umMes, umAno))) {
            dia = umDia;
            mes = umMes;
            ano = umAno;
        } else {
            dia = 0;
            mes = 0;
            ano = 0;
        }

    }

    boolean dataEValida(int umDia, int umMes, int umAno) {

        int res = umAno % 400;
        boolean retorno = true;

        if (umAno>1) {
            retorno = true;
        

        if ((umMes == 1) || (umMes == 3) || (umMes == 5) || (umMes == 7) || (umMes == 8) || (umMes == 10) ||(umMes == 12)) {
            if ((umDia >= 1) && (umDia <= 31)) {
                retorno = true;
            }else{
                retorno = false;
            }
        }
        
        else if ((umMes == 4) || (umMes == 6) || (umMes == 9) || (umMes == 11)) {
            if ((umDia >= 1) && (umDia <= 30)) {
                retorno = true;
            }else{
                retorno = false;
            }
        }
        
        else if (umMes == 2) {
            if (res == 0) {
                if (umDia >= 1 && umDia <= 29) {
                    retorno = true;
                }else{
                retorno = false;
            }
            } else{
                if (umDia >= 1 && umDia <= 28) {
                    retorno = true;
                }else{
                retorno = false;
            }
            }
        }else{
            retorno = false;
        }
        }else{
            retorno = false;
        }

        return retorno;

    }

    void mostraData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    public static void main(String[] args) {
        NovoData data1 = new NovoData();

        data1.inicializaData(28, 02, 2022);
        data1.mostraData();

    }
}
