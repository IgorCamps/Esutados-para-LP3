package Lista05;

public class Time{
    private int horas;
    private int minutos;
    private int segundos;


    public Time(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public boolean isAm(int horas){
        if(horas < 12){
            return true;
        }else{
            return false;
        }
    }

    public int cron(Time outraHora){
        if(horas < outraHora.horas && minutos < outraHora.minutos && segundos < outraHora.segundos){
            int qtdSecs;

            qtdSecs = (horas - outraHora.horas) * 3600;
            qtdSecs += (minutos - outraHora.minutos) * 60;
            qtdSecs += (segundos - outraHora.segundos);

            return qtdSecs;

        }else{
            int qtdSecs = 0;
            return qtdSecs;
        }
    }

    public static void main(String[] args) {
        Time horaEnviada = new Time(18,25,26);

        Time outraHora  = new Time(20, 30, 10);

        int res = horaEnviada.cron(outraHora);

        System.out.println(res);

    }
}