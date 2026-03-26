import java.util.Scanner;

public class SiglasTi_SwitchCase {
  public static void main (String[]args){
      Scanner sc = new Scanner(System.in);

      System.out.println("[1] - API");
      System.out.println("[2] - SQL");
      System.out.println("[3] - HTML");
      System.out.println("[4] - CSS");

      System.out.println("Digite o código");
      int sigla = sc.nextInt();

      switch(sigla){
          case 1:
              System.out.println("API = Application Programming Interface, usada para ligar back com front");
              break;
          case 2:
              System.out.println("SQl = Structured Query Language, linguagem usada em banco");
              break;
          case 3:
              System.out.println("HTML = Hyper Text Marcup Language, linguagem de marcação, estrutura de um site");
              break;
          case 4:
              System.out.println("CSS = Cascading Style Sheets, usada para estilizar sites");
              break;
          default://default = na falta de ...
              System.out.println("Código errado!");
      }
      sc.close();
  }
}
