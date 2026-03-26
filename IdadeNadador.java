import java.util.Scanner;
public class IdadeNadador {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();

        if(idade < 4){
            System.out.println("Você ainda não pode nadar");
        } else if(idade >= 5 && idade <= 7){
            System.out.println("Você está na categoria infantilA");
        }else if(idade >= 8 && idade <= 10){
            System.out.println("Você está na categoria infantilB");
        }else if(idade >= 11 && idade <= 13) {
            System.out.println("Você está na categoria juvenilA");
        }else if(idade >= 14 && idade <= 17) {
            System.out.println("Você está na categoria juvenilB");
        }else{
            System.out.println("Você é Senior.");
        }
        sc.close();
    }
}
