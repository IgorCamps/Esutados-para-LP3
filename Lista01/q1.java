public class q1{
    public static void main(String [] args){
        int i;
        double[] vetor =  {1,2,3,4,5};
        double medidos = 0, variacao = 0;
        for(i=0; i<5; i++){
            medidos += vetor[i];
        }

        medidos/=5;

        double []vetorDif = new double[5];

        for(i=0; i<5; i++){
            vetorDif[i] = (vetor[i] - medidos) * (vetor[i] - medidos);
            variacao += vetorDif[i];
        }

        variacao/=5;

        double result = Math.sqrt(variacao);

        System.out.println("Variacao: " + variacao + "\nMedia: " 
        + medidos + "\nDesvio: " + result);

        if (result > (medidos * 0.1)) {
            System.out.println("O multimetro esta com problemas");
        }else{
            System.out.print("O multimetro nao esta com problemas");
        }
}

}