import java.util.Scanner;

public class Sememoria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite aqui a média");
        float first = teclado.nextFloat();
        System.out.println("Digite aqui a frequêcia");
        float second = teclado.nextFloat() / 100;
        teclado.close();

        if (first >= 6 && second >= 0.75) {
            System.out.println("parabéns, aprovado");
        } else {
            if (first < 6) {
                System.out.println("lamento, reprovado por nota insuficiente");
            } else {
                System.out.println("lamento, reprovado por frequência insuficiente");
            }
        }
    }
}