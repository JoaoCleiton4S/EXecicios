public class Notas {
    public static void main(String[] args) {
        // Entrada
        int nota = 90;

        // Processamento
        if (nota >= 90) {
            System.out.println("A");
        } else if (nota >= 80) {
            System.out.println("B");
        } else if (nota >= 70) {
            System.out.println("C");
        } else if (nota >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

}
