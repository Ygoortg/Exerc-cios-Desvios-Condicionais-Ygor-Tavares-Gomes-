import java.util.Scanner;

 public class PesoIdeal {
     public static void main (String[]args){
       Scanner sc = new Scanner(System.in);

       System.out.println("Digite sua altura em metro e centímentros:");
       float altura = sc.nextFloat();

       System.out.println("Digite seu peso em kilos e gramas:");
       float peso = sc.nextFloat();

       float imc = (peso/(altura*altura));

       if(imc < 18.5){
             System.out.println("Você está abaixo do peso, seu imc é de: " +imc);
       }else if (imc >= 18.5 && imc <= 24.9){
           System.out.println("Você esta com o peso normal, seu imc é de: " +imc);
       }else{
           System.out.println("Você está acima do peso ideal, seu imc é de: " +imc);
       }
       sc.close();
     }
}
