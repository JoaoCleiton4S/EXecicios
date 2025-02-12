public class Maiorde {
    public static void main(String[] args) throws Exception {

        int idadepermitida = 18;
        int suaidade = 16;

        int sum = suaidade;

        if (suaidade >= idadepermitida) {
            System.out.printf("você tem %d, pode entrar!!!", sum);
        } else {
            System.out.printf("você tem %d, volte com um resposavel!!!", sum);
        }
    }
}