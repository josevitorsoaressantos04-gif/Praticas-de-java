import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        // declarar as váriaveis
        Scanner scan = new Scanner(System.in);

        double nt1, nt2, nt3, nt4, nt5;
        double media;

        //entrada
        //Dar valor as váriaveis
        System.out.print("Digite a primeira nota do aluno: ");
         nt1 = scan.nextDouble();

        System.out.print("Digite a segunda nota do aluno: ");
        nt2 = scan.nextDouble();

        System.out.print("Digite a terceira nota do aluno: ");
        nt3 = scan.nextDouble();

        System.out.print("Digite a quarta nota do aluno: ");
        nt4 = scan.nextDouble();

        System.out.print("Digite a quinta nota do aluno: ");
        nt5 = scan.nextDouble();

        //Cálculo da média
        media = (nt1 + nt2 + nt3 + nt4 + nt5)/5;

        System.out.printf("A média do aluno é: %.2f ", media);

    }
}
