import java.util.Scanner;

public class SistemaDeAprovacao {
    public static void main(String[] args) {
        //Declaração das variáveis
        Scanner scan = new Scanner(System.in);
        double notaProva, notaTrabalho, media;

        // Entrada das notas
        System.out.print("Digite a nota da prova: ");
        notaProva = scan.nextDouble();

        System.out.print("Digite a nota do trabalho: ");
        notaTrabalho = scan.nextDouble();

        //Calculo da média
        media =  (notaProva + notaTrabalho)/ 2;

        //Processamento das notas e a média e a Saída dependendo da condição atendida.
        if (notaProva >= 6 && notaTrabalho == 5) {
            System.out.println("Aprovado");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }

    }
}
