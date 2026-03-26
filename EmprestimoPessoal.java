import java.util.Scanner;
public class EmprestimoPessoal{
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = sc.next();

        System.out.println("Digite seu sálario:");
        float salario = sc.nextFloat();

        System.out.println("Qual o valor desejado?");
        float ValorDesejado = sc.nextFloat();

        System.out.println("Em quantas vezes deseja pagar?");
        int PrestacaoDesejada = sc.nextInt();

        double Porcentagem = 0.30;
        float ValorParcelas = ValorDesejado / PrestacaoDesejada;
        double PorcentagemSalario = salario * Porcentagem;

        if(PorcentagemSalario >= ValorParcelas){
            System.out.println("Você pode pegar o emprestimo no valor de: R$ %.2f" +ValorDesejado);
        }
        else{
            System.out.println("Suas parcelas ficam acima de 30%, emprestimo negado");
        }
        sc.close();
    }
}
