public class App {
    public static void main(String[] args) throws Exception {
        // Entrada
        int fisrtNumber = 18;
        int secondNumber = 25;

        // Processamento
        int sum = fisrtNumber + secondNumber;
        int rest = sum % 2;

        // Saida
        if (rest == 0) {
            System.out.printf("O número %d da soma é par!!!\n", sum);
        } else {
            System.out.printf("O número %d da soma é impar!!!\n", sum);
        }

        System.out.println("Eu sou inevitavel!!!");
    }

}
