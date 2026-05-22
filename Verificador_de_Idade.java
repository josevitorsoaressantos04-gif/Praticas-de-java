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
