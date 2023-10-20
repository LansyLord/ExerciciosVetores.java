import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qantos valores vai ter cada vetor? ");
        int n = Integer.parseInt(sc.nextLine());

        int[] a = new int[n];
        int[] b = new int[n];
        int[] vetorResultante = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for(int i = 0; i < a.length; i++){
            a[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Digite os valores do vetor B:");
        for(int k = 0; k < b.length; k++){
            b[k] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("VETOR RESULTANTE:");
        for(int j = 0; j < a.length; j++){
            vetorResultante[j] = a[j] + b[j];
            System.out.println(vetorResultante[j]);
        }
        sc.close();
    }
}
