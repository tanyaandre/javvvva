public class BmiService {
    public float calculate(float weight, float height) {
        float result = height * height / 100 / 100;
        return weight / result;
    }
}
