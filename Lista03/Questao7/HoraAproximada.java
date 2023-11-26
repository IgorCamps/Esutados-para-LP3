package Lista03.Questao7;

public class HoraAproximada {
    int horas;
    int minutos;

    void inicializaHora(int umaHora, int umMinuto){
        if ((horaEValida(umaHora, umMinuto))) {
            horas = umaHora;
            minutos = umMinuto;
        }else{
            horas = 0;
            minutos = 0;
        }
    }

    boolean horaEValida(int umaHora, int umMinuto){
        if ( (umaHora >= 0) && (umaHora <= 24) && (umMinuto >= 0) && (umMinuto <=59)) {
            return true;
        }else{
            return false;
        }
    }

    void mostraHora(){
        System.out.println("São: " + horas + ":" + minutos);
    }

    public static void main(String[] args) {
        HoraAproximada hora = new HoraAproximada();

        hora.inicializaHora(12,34);
        hora.mostraHora();
    }
}
