import java.util.Scanner;

public class Comissao{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double totalVendas, pcComissao,pagamento;
        pcComissao = 5 ;// porcentagem da comissao

        System.out.print("Digite qual foi o total de venda esse mês:");
        totalVendas = scan.nextDouble();

        pagamento = totalVendas * (pcComissao/100);

        System.out.printf("Sua comissão é de: R$ %.2f", pagamento);
    }
}
