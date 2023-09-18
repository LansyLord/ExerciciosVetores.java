import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas? ");
        int n = Integer.parseInt(sc.nextLine());
        Pessoa[] vetor = new Pessoa[n];
        double somaAlturas = 0;
        int contMenos16 = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = Integer.parseInt(sc.nextLine());
            System.out.print("Altura: ");
            double altura = Double.parseDouble(sc.nextLine());
            somaAlturas += altura;
            vetor[i] = new Pessoa(nome, idade, altura);

            if(vetor[i].getIdade() <  16){
                contMenos16++;
            }
        }
        double mediaAlturas = somaAlturas / vetor.length;
        System.out.printf("\nAltura média: %.2f\n", mediaAlturas);
        double porcentagem = (contMenos16 * 100)/vetor.length;
        System.out.println("Pessoas com menos de 16 anos: "+ porcentagem + "%");
        for(int k = 0; k < vetor.length; k++){
            if(vetor[k].getIdade() < 16){
                System.out.println(vetor[k].getNome());
            }
        }
        sc.close();
    }
}
