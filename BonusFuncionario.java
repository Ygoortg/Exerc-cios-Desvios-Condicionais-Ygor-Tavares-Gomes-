import java.util.Scanner;

 public class BonusFuncionario{
     public static void main(String[]args){
     Scanner sc = new Scanner(System.in);

     System.out.println("Digite o valor do seu salário:");
     float salario = sc.nextFloat();

     System.out.println("Digite quantos anos você está na empresa?");
     int anos = sc.nextInt();

     float bonus20 = (salario*20)/100;
     float bonus10 = (salario*10)/100;
     float SalarioBonus = (bonus20 + salario);

     if(anos >= 5){
         System.out.println("Você recebeu um bônus de 20% por seus "+anos+" anos contribuidos a empresa, parabéns!!");
         System.out.println("O bônus com foi de: R$ %.2f \n" +bonus20);
         System.out.println("Total de: R$ %.2f" + SalarioBonus);
         }else{
         System.out.println("Você recebeu um bônus de 10% por seus "+anos+" anos contribuidos a empresa, parabéns!!");
         System.out.printf("O bônus com foi de: R$ %.2f \n",+bonus10);
         System.out.printf("Total de: R$ %.2f", +SalarioBonus);
         }
     sc.close();
     }
}
