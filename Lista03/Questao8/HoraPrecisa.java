package Lista03.Questao8;

public class HoraPrecisa {
    
    int horas;
    int minutos;
    int segundos;
    int centesimos;

    void inicializaHora(int umaHora, int umMinuto, int umSegundos, int umCentesimo){
        if ((horaEValida(umaHora, umMinuto, umSegundos, umCentesimo))) {
            horas = umaHora;
            minutos = umMinuto;
            segundos = umSegundos;
            centesimos = umCentesimo;

        }else{
            horas = 0;
            minutos = 0;
        }
    }

    boolean horaEValida(int umaHora, int umMinuto, int umSegundos, int umCentesimo){
        if ( (umaHora >= 0) && (umaHora <= 24) && (umMinuto >= 0) && (umMinuto <=59) && (umSegundos >= 0) && (umSegundos <=59) && (umCentesimo >= 0) && (umCentesimo <=99)) {
            return true;
        }else{
            return false;
        }
    }

    void mostraHora(){
        System.out.println("São: " + horas + ":" + minutos + ":" + segundos + ":" + centesimos);
    }

    public static void main(String[] args) {
        HoraPrecisa hora = new HoraPrecisa();

        hora.inicializaHora(12,34, 37, 92);
        hora.mostraHora();
    }
}
