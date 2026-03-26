import java.util.Scanner;

public class OrdemCrescente {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um número:");
        float num1 = sc.nextFloat();

        System.out.println("Digite o segundo número:");
        float num2 = sc.nextFloat();

        if(num1 == num2){
           System.out.print("Esses números são iguais: " +num2+ " , " +num1);
        }else if(num1 < num2){
            System.out.print("Essa é a ordem dos números digitados em ordem descrecente: " +num2+ " , " +num1);
        } else{
            System.out.println("Essa é a ordem dos números digitados em ordem decrescente: " +num1+ " , " +num2);
        }
sc.close();
    }
}
