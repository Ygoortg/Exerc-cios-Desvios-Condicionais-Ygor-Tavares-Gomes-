import java.util.Scanner;
public class CalculoEscolhido {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a opção:");
        System.out.println("[M] média entre os números digitados");
        System.out.println("[S] diferença do maior pelo menor");
        System.out.println("[P] produto entre os números digitados ");
        System.out.println("[D] divisão do primeiro pelo segundo");
        String opcao = sc.nextLine().toUpperCase();

        System.out.println("Digite o primeiro número:");
        double num1 = sc.nextDouble();
        System.out.println("Digite o segundo número:");
        double num2 = sc.nextDouble();

        double calculo;
        double diferenca;

        switch (opcao){
            case "M":
            calculo = (num1 + num2)/2;
                System.out.println("Esse foi o resultado do calculo solicitado:" +calculo);
                break;
            case "S":
                if (num1 > num2) {
                    diferenca = num1 - num2;
                } else {
                    diferenca = num2 - num1;
                }
                System.out.println("Esse foi o resultado do calculo solicitado " + diferenca);
                break;
            case "P":
                calculo = (num1 * num2);
                System.out.println("Esse foi o resultado do calculo solicitado:" +calculo);
                break;
            case "D":
                calculo = (num1 / num2);
                System.out.println("Esse foi o resultado do calculo solicitado:" +calculo);
                break;
                default:
                System.out.println("Inválido");
        }
sc.close();
    }
}
