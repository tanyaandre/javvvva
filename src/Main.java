public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 59;
        float height = 168;
        float bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}