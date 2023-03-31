public class Main {
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n =n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 12345;
        int sum = sumOfDigits(num);
        System.out.println("The sum of digits in " + num + " is " + sum);
    }
}
