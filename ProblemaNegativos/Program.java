import java.util.Scanner;

public class Program {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = Integer.parseInt(sc.nextLine());

        int[] numeros = new int[n];
        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for(int k = 0; k < numeros.length; k++){
            if(numeros[k] < 0){
                System.out.println(numeros[k]);
            }
        }
    }
}