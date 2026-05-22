import java.util.Scanner;

public class Desconto{
    public static void main(String[] args) {

        //declarar variável
        Scanner scan = new Scanner(System.in);

        double desconto, preco, valorTotal;

        //Entrada
        System.out.print("Qual o valor do produto?");
        preco = scan.nextDouble();

        System.out.print("Quantos porcento de desconto?");
        desconto = scan.nextDouble();

        // sistema primeiro converte a várivel desconto para porcentagem
        // depois converte para um número decimal ou inteiro dependendo do valor
        // e depois realiza o calculo do preço - desconto

        valorTotal = preco - (preco * (desconto/100));

        //Saída
        System.out.printf("O valor total com desconto é: %.2f", valorTotal);
    }
}
