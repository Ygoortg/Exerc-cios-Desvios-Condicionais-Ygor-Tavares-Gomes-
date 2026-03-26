import java.util.Scanner;
public class Saudacao {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual horário você estuda:");
        System.out.println("[M] = Matutino");
        System.out.println("[V] = Vesperino");
        System.out.println("[N] = Noturno");
        String horario = sc.nextLine();

      if(horario.equalsIgnoreCase("M")){
          System.out.println("Bom dia");
      }else if(horario.equalsIgnoreCase("V")){
          System.out.println("Boa tarde");
      }else if(horario.equalsIgnoreCase("N")){
          System.out.println("Boa noite");
      }else{
          System.out.println("Escolha inválida.");
      }

    }
}
