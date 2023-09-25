import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = Integer.parseInt(sc.nextLine());

        double maior = 0.0;
        int posicaoMaior = 0;
        double[] numeros = new double[n];
        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = Double.parseDouble(sc.nextLine());
            if(numeros[i] > maior){
                maior = numeros[i];
                posicaoMaior = i;
            }
        }
        System.out.println("\nMAIOR VALOR = " + maior);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicaoMaior);
        sc.close();
    }
}
