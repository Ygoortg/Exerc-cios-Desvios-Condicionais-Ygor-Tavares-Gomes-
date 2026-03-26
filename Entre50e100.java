import java.util.Scanner;

 public class Entre50e100 {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

         System.out.println("Digite algum número:");
         int num1 = sc.nextInt();

         if(num1 >= 50 && num1 <=100){
             System.out.println("O número está no intervalo determinado!!");
         }else{
             System.out.println("O número está fora do intervalo!!");
         }
         sc.close();
     }
}
