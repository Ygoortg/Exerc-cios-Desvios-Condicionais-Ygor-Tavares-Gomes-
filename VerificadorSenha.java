import java.util.Scanner;

 public class VerificadorSenha {
     public static void main(String[]args){
         Scanner sc = new Scanner(System.in);

         System.out.println("Crie uma senha:(não pode conter espaços)");
         String SenhaCriada = sc.next();

         System.out.println("Digite a senha criada:");
         String ConfirmeSenha = sc.next();

         if(SenhaCriada .equals(ConfirmeSenha)){
             System.out.println("Acesso liberado!");
         }else{
             System.out.println("Acesso negado!");
         }
         sc.close();
     }
}
