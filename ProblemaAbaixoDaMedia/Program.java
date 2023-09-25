import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos elementos o vetor tera? ");
        int n = Integer.parseInt(sc.nextLine());

        double[] vetor = new double[n];
        double soma = 0;
        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = Double.parseDouble(sc.nextLine());
            soma += vetor[i];
        }
        double media = soma / vetor.length;
        System.out.printf("\nMEDIA DO VETOR = %.3f\n", media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for(int k = 0; k < vetor.length; k++){
            if(vetor[k] < media){
                System.out.printf("%.1f\n", vetor[k]);
            }
        }
        sc.close();
    }
}