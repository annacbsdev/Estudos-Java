import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme preferido: ");
        String filme = leitura.nextLine();
        System.out.println(filme + " é um ótimo filme! arrasou");
    }
}
