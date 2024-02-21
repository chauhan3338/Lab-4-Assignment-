public class SumOfAll {
    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 40;
        int sum = smos(n1, n2);
        System.out.println("Sum of multiples of seven between " + n1 + " and " + n2 + ": " + sum);
    }

    public static int smos(int n1, int n2) {
        if (n1 > n2) {
            return 0;
        } else {
            int sum = (n1 % 7 == 0) ? n1 : 0;
            return sum + smos(n1 + 1, n2);
        }
    }
}
