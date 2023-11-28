package Lista03.Questao16;

public class DataAprimorado {


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

        if ((umMes == 1) || (umMes == 3) || (umMes == 5) || (umMes == 7) || (umMes == 8) || (umMes == 10) ||(umMes == 12)) {
            if ((umDia >= 1) && (umDia <= 31)) {
                retorno = true;
            }else{
                retorno = false;
            }
        }else if ((umMes == 4) || (umMes == 6) || (umMes == 9) || (umMes == 11)) {
            if ((umDia >= 1) && (umDia <= 30)) {
                retorno = true;
            }else{
                retorno = false;
            }
        }else if ((umMes == 2)) {

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

        return retorno;

    }

    void mostraData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    void mostraDiaDaSemana(int umDia, int umMes, int umAno) {
        if (dataEValida(umDia, umMes, umAno)) {
           int mult, res = 0;

           if(umDia <=7){
                mult = 7;
                res = mult - umDia;
           }
           else if(umDia >= 8 && umDia <= 14){
                mult = 14;
                res = mult - umDia;
           }
           else if(umDia>=15 && umDia <=21){
                mult = 21;
                res = mult - umDia;
           }else if(umDia>=22 && umDia <=28){
                mult = 28;
                res = mult - umDia;
           }else{
                if(umDia == 29){
                    mult = 35;
                    res = mult - umDia;
                }else if(umDia == 30){
                    mult = 35;
                    res = mult - umDia;
                }else{
                    mult = 35;
                    res = mult - umDia;
                }
           }    
                System.out.println(res);
                switch (res){
                    case 6:
                        System.out.println("Domingo");
                    break;
                    case 5:
                        System.out.println("Segunda-feira");
                    break;
                    case 4:
                        System.out.println("Terça-feira");
                    break;
                    case 3:
                        System.out.println("Quarta-feira");
                    break;
                    case 2:
                        System.out.println("Quinta-feira");
                    break;
                    case 1:
                        System.out.println("Sexta-feira");
                    break;
                    case 0:
                        System.out.println("Sábado");
                    break;
                }
           
        }else{
            System.out.println("Data inválida");
        }
    }
    public static void main(String[] args) {
        DataAprimorado data1 = new DataAprimorado();

        data1.inicializaData(31, 2, 129);
        data1.mostraData();
        data1.mostraDiaDaSemana(31, 2, 129);

    }
}
