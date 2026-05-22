import java.util.Scanner;

public class Lancheria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int codigo, opcao;
        int qntd = 0;
        String produto = "", categoria = "";
        double valorUn = 0, valorTotal = 0, desc = 0, valorOrg = 0;


        System.out.println("""
                            === Menu ===
                Código      Produto             Preço Unitário
                
                1           Hamburguer          18,00 R$
                2           Cheesburguer        20,00 R$
                3           Batata Frita        12,00 R$
                4           Regrigerante         8,00 R$
                5           Suco Natural        10,00 R$
                6           Milkshake           15,00 R$
                7           Salada              16,00 R$
                
                """);
        System.out.print("Digite o código do produto desejado: ");
        codigo = scan.nextInt();
        switch (codigo) {
            case 1:
                produto = "Hamburguer";
                val  = true;
                valorUn = 18.0;

                break;

            case 2:
                produto = "Cheesburguer ";

                valorUn = 20.0;

                break;

            case 3:
                produto = "Batata Frita ";

                valorUn = 12.0;


                break;

            case 4:
                produto = "Regrigerante ";
                valorUn = 8.0;

                break;

            case 5:
                produto = "Suco Natural";

                valorUn = 10.0;

                break;

            case 6:
                produto = "  Milkshake";

                valorUn = 15.0;

                break;

            case 7:
                produto = "Salada";

                valorUn = 16.0;

                break;
            default:
                System.out.println("Código invalido");
        }
        if(codigo <= 0 || codigo >=8) {
        }else{
            System.out.print("Digite a quantidade que deseja: ");
            qntd = scan.nextInt();

            System.out.println("""
                    Categoria Cliente
                    
                    1 - Estudante
                    2 - Idoso
                    3 - Cliente comum
                    
                    Digite o código da categoria que você se encaixa:
                    """);
            opcao = scan.nextInt();


            switch (opcao) {
                case 1:
                    categoria = "Estudante";
                    valorOrg = valorUn * qntd;
                    desc = valorOrg * 0.10;
                    valorTotal = valorOrg - desc;
                    break;

                case 2:
                    categoria = "Idoso";
                    valorOrg = valorUn * qntd;
                    desc = valorOrg * 0.20;
                    valorTotal = valorOrg - desc;
                    break;

                case 3:
                    categoria = "Cliente comum";
                    valorOrg = valorUn * qntd;
                    valorTotal = valorOrg;
                    break;
                default:
                    System.out.print("Categoria inválida");
            }

            double conversor = ((valorTotal - valorOrg) / (valorOrg)) * 100;
            System.out.printf("""
                              === Conta ===
                    
                    Produto: %s         Quantidade: %d
                    
                    Categoria: %s
                    
                    Descont:%.0f%%
                    
                    Valor total: %.2f
                    """, produto, qntd, categoria, conversor, valorTotal);

        }
        scan.close();
    }
}
