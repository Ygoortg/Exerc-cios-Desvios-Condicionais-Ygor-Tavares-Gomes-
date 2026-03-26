import java.sql.SQLOutput;
import java.util.Scanner;

 public class MaiorMenorEntre3 {
     public static void main(String[]args){
         Scanner sc = new Scanner(System.in);

         System.out.println("Digite o primeiro número:");
         int num1 = sc.nextInt();

         System.out.println("Digite o segundo número:");
         int num2 = sc.nextInt();

         System.out.println("Digite o terceiro número:");
         int num3 = sc.nextInt();

         if (num1 > num2 && num1 > num3){
             System.out.println("Esse é o maior número entre eles: " +num1);
         } else if (num1 == num2 && num1 == num3 && num2 == num3){
             System.out.println("Os números são iguais");
         }else{
             if(num2 > num3){
                 System.out.println("Este é o maior número: " +num2);
             }else{
                 System.out.println("O maior número é: " +num3);
             }
         }
         sc.close();
     }
}
