import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = Integer.parseInt(sc.nextLine());

        int paresCont = 0;
        int[] numeros = new int[n];
        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = Integer.parseInt(sc.nextLine());
            if(numeros[i] % 2 == 0){
                paresCont++;
            }
        }

        int[] pares = new int[paresCont];
        int paresIndex = 0;

        for(int k = 0; k < numeros.length; k++){
            if(numeros[k] % 2 == 0){
                pares[paresIndex] = numeros[k];
                paresIndex++;
            }
        }

        System.out.println("\nNUMEROS PARES: ");
        for(int j = 0; j < pares.length; j++){
            System.out.print(pares[j] + "  ");
        }

        System.out.println("\n\nQUANTIDADE DE PARES = " + paresCont);
    }
}
