package Lista04.Questao1;

public class Data{
    private int dia;
    private int mes;
    private int ano;

    public void inicilizaData(){
        dia = 1;
        mes = 1;
        ano = 2023;
    }

    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAno(){
        return ano;
    }
    
    public boolean verificarData(int dia, int mes, int ano){
        boolean res = true;

        if(dia >=1 && dia <=31){
            this.dia = dia;
            if(mes >=1 && mes <= 12){
                this.mes = mes;
            }
            if(ano >=1 && ano <=10000){
                this.ano = ano;
                    res = true;
            }
        }
        else{
            res = false;
        }
        return res;
    }

    public void setData(int dia, int mes, int ano){
        if(verificarData(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }else{
            dia = 1;
            mes = 1;
            ano = 2023;
        }
    } 

    public void imprimirData(){
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    public void imprimirDataExtenso(){
        switch(mes){
            case 1: System.out.println(dia + " de janeiro de " + ano);
            break;
            case 2: System.out.println(dia + " de fevereiro de " + ano);
            break;
            case 3: System.out.println(dia + " de marco de " + ano);
            break;
            case 4: System.out.println(dia + " de abril de " + ano);
            break;
            case 5: System.out.println(dia + " de maio de " + ano);
            break;
            case 6: System.out.println(dia + " de junho de " + ano);
            break;
            case 7: System.out.println(dia + " de julho de " + ano);
            break;
            case 8: System.out.println(dia + " de agosto de " + ano);
            break;
            case 9: System.out.println(dia + " de setembro de " + ano);
            break;
            case 10: System.out.println(dia + " de outubro de " + ano);
            break;
            case 11: System.out.println(dia + " de novembro de " + ano);
            break;
            case 12: System.out.println(dia + " de dezembro de " + ano);
            break;
        }
    }

    public static void main(String[] args) {
        Data data1 = new Data();

        data1.inicilizaData();
        data1.imprimirData();
        data1.imprimirDataExtenso();

    }
}