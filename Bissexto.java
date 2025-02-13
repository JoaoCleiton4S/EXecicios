import java.util.Scanner;

public class Bissexto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite aqui o ano");
        float ano = teclado.nextFloat();
        teclado.close();

        if (ano % 4 == 0 && ano % 100 == 0 || ano % 400 == 0) {
            System.out.println("ESSE ANO É BISSEXTO!!!");
        } else {
            System.out.println("NÃO É UM ANO BISSEXTO!!!");
        }

    }
}
