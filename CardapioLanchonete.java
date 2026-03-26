import java.util.Locale;
import java.util.Scanner;
public class CardapioLanchonete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double calculo = 0;
        int quantidade;
        int codigo;
        String continuar;

        do {
            System.out.println("Escolha qual o produto desejado");
            System.out.println("[100] cachorro quente R$ 10,00");
            System.out.println("[101] bauru simples   R$ 9,00");
            System.out.println("[102] bauru com ovo   R$ 8,00");
            System.out.println("[103] hamburguer      R$ 7,00");
            System.out.println("[104] cheesburguer    R$ 6,00");
            System.out.println("[105] refrigerante    R$ 5,00");
            codigo = sc.nextInt();

            System.out.println("Digite quantos você quer");
            quantidade = sc.nextInt();
            sc.nextLine();

            switch (codigo) {
                case 100:
                    calculo += (quantidade * 10);
                    break;
                case 101:
                    calculo += (quantidade * 9);
                    break;
                case 102:
                    calculo += (quantidade * 8);
                    break;
                case 103:
                    calculo += (quantidade * 7);
                    break;
                case 104:
                    calculo += (quantidade * 6);
                    break;
                case 105:
                    calculo += (quantidade * 5);
                    break;
                default:
                    System.out.println("Código inválido");

            }
            System.out.println("Quer pedir algo a mais? (s/n)");
            continuar = sc.nextLine();

        }while (continuar.equalsIgnoreCase("s"));
                System.out.println("Total do pedido ficou em: " + calculo);


            sc.close();

    }
}
