import java.util.Locale;
import java.util.Scanner;
public class CardapioLanchonete {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha qual o produto desejado");
        System.out.println("[100] cachorro quente R$ 10,00");
        System.out.println("[101] bauru simples   R$ 9,00");
        System.out.println("[102] bauru com ovo   R$ 8,00");
        System.out.println("[103] hamburguer      R$ 7,00");
        System.out.println("[104] cheesburguer    R$ 6,00");
        System.out.println("[105] refrigerante    R$ 5,00");
        String codigo = sc.nextLine();

        System.out.println("Digite quantos você quer");
        int quantidade = sc.nextInt();

        double calculo;

        switch (codigo) {
            case "100":
                calculo = (quantidade * 10);
                System.out.println("Cachorro quente: "+calculo);
                break;
            case "101":
                calculo = (quantidade * 9);
                System.out.println("Bauru simples: "+calculo);
                break;
            case "102":
                calculo = (quantidade * 8);
                System.out.println("Bauru com ovo: "+calculo);
                break;
            case "103":
                calculo = (quantidade * 7);
                System.out.println("Hamburguer: "+calculo);
                break;
            case "104":
                calculo = (quantidade * 6);
                System.out.println("Cheesburguer: "+calculo);
                break;
            case "105":
                calculo = (quantidade * 5);
                System.out.println("Refrigerante: "+calculo);
                break;

            default:
                System.out.println("Código inválido");
        }

        sc.close();
    }
}
