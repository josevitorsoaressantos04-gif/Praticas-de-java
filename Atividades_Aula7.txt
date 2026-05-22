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
import java.util.Scanner;

public class VerificadorRisco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = scan.nextInt();

        System.out.print("Possui doença crônica(true/false)? ");
        Boolean doencaC = scan.nextBoolean();
        scan.nextLine();

        System.out.print("Você é fumante(s/n)? ");
        String pFumante = scan.nextLine().toLowerCase();

        if(idade >= 60 || (doencaC  && pFumante.equals("s")))  {
            System.out.println("Paciente de alto risco");
        }else if(idade >= 40 && (doencaC ||pFumante.equals("s"))) {
            System.out.println("Paciente de médio risco");
        }else{
            System.out.println("Paciente de baixo risco");
        }

    }
}
import java.util.Scanner;

public class VerificadorIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade;

        System.out.print("Digite a sua idade: ");
        idade = scan.nextInt();
        if(idade >= 18){
            System.out.println("Você é maior de idade");
        }else{
            System.out.println("Você é menor de idade");
        }
    }
}
