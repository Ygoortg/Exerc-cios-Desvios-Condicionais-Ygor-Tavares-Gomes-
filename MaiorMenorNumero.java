import java.util.Scanner;

public class MaiorMenorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Digite seu primeiro número:");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo número:");
        num2 = sc.nextInt();

        int diferenca;

        if (num1 == num2) {
            System.out.println("Os números são iguais");
        } else {
            if (num1 > num2) {
                diferenca = num1 - num2;
            } else {
                diferenca = num2 - num1;
            }
            System.out.println("Os números são diferentes, a diferença entre eles é de: " + diferenca);
        }
        sc.close();
    }
}