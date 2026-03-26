import java.util.Scanner;

 public class Calculadora {
     public static void main(String[]args){
         Scanner sc = new Scanner(System.in);

         System.out.println("Digite um numero para calcularmos:");
         float num1 = sc.nextFloat();

         System.out.print("Digite o operador (+, -, *, /): ");
         char operador = sc.next().charAt(0);

         System.out.println("Digite mais um numero para calcularmos:");
         float num2 = sc.nextFloat();


         if (operador == '+') {
             System.out.println("Resultado: " + (num1 + num2));
         }
         else if (operador == '-') {
             System.out.println("Resultado: " + (num1 - num2));
         }
         else if (operador == '*') {
             System.out.println("Resultado: " + (num1 * num2));
         }
         else if (operador == '/') {
             if (num2 != 0) {
                 System.out.println("Resultado: " + (num1 / num2));
             } else {
                 System.out.println("Erro: Divisão por zero!");
             }
         }
         else {
             System.out.println("Operador inválido!");
         }
      sc.close();
     }
}
