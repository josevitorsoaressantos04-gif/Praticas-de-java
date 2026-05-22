import java.util.Scanner;


public class Soma{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

         String n1;

         String n2;

        System.out.print("Digite o valor de n1: ");
        n1 = scan.nextLine();

        System.out.print("Digite o valor de n2: ");
        n2 = scan.nextLine();

        System.out.println("O total é: "+  n1 + n2);

    }
}
