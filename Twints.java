public class Twints {
    public static void main(String[] args) {
        int tempoIsMoney = 12;
        int ultimaPromotion = 3;
        float salaryus = 2500;

        if (tempoIsMoney > 5 || ultimaPromotion > 2) {
            salaryus += salaryus * 0.05f;
        }

        System.out.println(salaryus);
        
    }
}
