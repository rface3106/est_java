package Hr0604;

public class ForEach1 {
    public static void main(String[] args) {
        int[] scores = {1, 30, 20, 80, 15, 20, 30, 22};
        int sum = 0;
        for (int i : scores) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println(sum / scores.length);
    }
}
