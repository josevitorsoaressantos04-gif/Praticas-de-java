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
