import java.util.Scanner;

 public class PoderVotar {
     public static void main(String[]args){
         Scanner sc = new Scanner(System.in);

         System.out.print("Digite sua idade: ");
         int idade = sc.nextInt();
         sc.nextLine(); // Limpa o buffer do teclado

         System.out.print("Você é brasileiro? (sim/não): ");
         String respostaBrasileiro = sc.nextLine();

         System.out.print("Você sabe ler e escrever? (sim/não): ");
         String respostaAlfabetizado = sc.nextLine();

         // Convertendo as respostas em booleano para facilitar a lógica
         boolean nacionalidade = respostaBrasileiro.equalsIgnoreCase("sim");
         boolean alfabetizado = respostaAlfabetizado.equalsIgnoreCase("sim");

         if(!nacionalidade){
             System.out.println("Estrangeiros não podem votar no Brasil");
         }else{
         if (idade<16){
             System.out.println("Você não pode votar no brasil");
         } else if (idade >= 18 && idade <= 70 && alfabetizado){
             System.out.println("Seu voto é obrigatório!!");
         }else {
             System.out.println("Seu voto é facultativo!");
         }
         }
     sc.close();
     }
 }

