import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = Integer.parseInt(sc.nextLine());

        int[] vetorA = new int[n];
        System.out.println("Digite os valores do vetor A: ");
        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = Integer.parseInt(sc.nextLine());
        }

        int[] vetorB = new int[n];
        System.out.println("Digite os valores do vetor B: ");
        for(int k = 0; k < vetorB.length; k++){
            vetorB[k] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("VETOR RESLTANTE: ");
        int[] vetorC = new int[n];
        for(int j = 0; j < vetorC.length; j++){
            vetorC[j] = vetorA[j] + vetorB[j];
            System.out.println(vetorC[j]);
        }
        sc.close();
    }
}
