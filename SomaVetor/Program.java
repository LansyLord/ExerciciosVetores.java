package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar? ");
        int n = Integer.parseInt(sc.nextLine());

        double[] numeros = new double[n];
        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = Double.parseDouble(sc.nextLine());
        }

        double soma = 0.0;
        System.out.print("\nVALORES =");
        for(int k = 0; k < numeros.length; k++){
            soma += numeros[k];
            System.out.print(" " + numeros[k]);
        }
        double media = soma / numeros.length;
        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);
        sc.close();
    }
}
