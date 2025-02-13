public class add {
    public static void main(String[] args) {

        int a = 4;
        int b = 3;
        int c = 2;

        boolean triangulo = a + b > c || b + c > a || c + a > b;
        if (triangulo) {
            System.out.println("É um triângulo");
        } else {
            System.out.println("Não e um triângulo");
        }
    }
}
