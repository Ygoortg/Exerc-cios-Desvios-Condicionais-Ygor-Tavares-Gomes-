import java.util.Scanner;

 public class DescontoInss {
     public static void main(String[]args){
         Scanner sc = new Scanner(System.in);

         System.out.println("Digite seu sálario:");
         double salario = sc.nextDouble();

         double porcento20 = salario-(salario * 0.20);
         double porcento25 = salario-(salario * 0.25);
         double porcento30 = salario-(salario * 0.30);

         if (salario <= 600){
             System.out.println("Você está isento de pagar o INSS!");
         } else if (salario > 600 && salario <= 1200){
             System.out.println("Você paga o valor de 20% do seu salario, o total fica: " +porcento20);
         } else if (salario > 1200 && salario<= 2000){
             System.out.println("Você paga o valor de 25% do seu salario, o total fica: " +porcento25);
         }else{
             System.out.println("Você paga o valor de 30% do seu salario, o total fica: " +porcento30);
         }
         sc.close();
     }
}
