public class Countdown {
    public static void main(String[] args) {
        countdown(5);
    }

    private static void countdown(int i) {
        System.out.println(i);

        if (i <= 1) {
            return;
        }
        countdown(i-1);
    }
}
