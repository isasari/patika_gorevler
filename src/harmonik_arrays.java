public class Main {
    public static void main(String[] args) {
        double sum = 0, harm;
        double list[] = {5, 10, 15};
        for (int i = 0; i < list.length; i++) {
            sum += 1 / list[i];
        }
        harm = list.length / sum;
        System.out.println(harm);

    }
}
