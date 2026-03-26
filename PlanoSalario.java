import java.util.Scanner;
public class PlanoSalario {
 public static void main(String[]args){
     Scanner sc = new Scanner(System.in);

     System.out.println("Digite seu plano:[A], [B] e [C]");
     String plano = sc.nextLine().toUpperCase();

     System.out.println("Qual o seu sálario?");
     double salario = sc.nextDouble();

     double salarionovo = salario*0.10;

    switch (plano){
        case "A":
            salarionovo = salario + (salario * 0.10);
            System.out.printf("Seu salário novo é: "+salarionovo);
        break;
        case "B":
            salarionovo = salario + (salario * 0.15);
            System.out.printf("Seu salário novo é: "+salarionovo);
            break;
        case "C":
            salarionovo = salario + (salario * 0.20);
            System.out.printf("Seu salário novo é: "+salarionovo);
            break;

        default:
            System.out.println("Inválido");
    }
sc.close();
    }
 }

