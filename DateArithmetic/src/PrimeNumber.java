import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public static void main(String[] args) {
        int numberOfPrimes = 10;
        List<Integer> primes = PrimeNumber.generatePrimes(numberOfPrimes);
        for (int ii = 0; ii < primes.size(); ii++) {
            System.out.println(ii + 1 + ":" + primes.get(ii));
        }
    }

    // public -> 他のクラスからも呼び出せる
    // static -> クラス名.メソッド名の形で呼び出せる
    // List<Integer> -> 整数のリストをreturnで返す
    // generatePrimes -> method名
    // int n -> 整数をinputで取る

    public static List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        int count = 0;
        int number = 2;

        while (count < n) {
            if (isPrime(number)) {
                primes.add(number);
                count ++;
            }
            number ++;
        }
        return primes;
    }

    public static int getPrime(int nth) {
        int count = 0;
        int number = 2;

        while (count < nth) {
            if (isPrime(number)) {
                count ++;
            }
            number ++;
        }

        return number - 1;
    }

    public static boolean isPrime(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("入力した数は正でなければなりません。");
        }
        // 1は素数ではない
        if (number == 1) {
            return false;
        }
        for (int ii = 2; ii < number; ii++) {
            if (number % ii == 0) {
                return false;
            }
        }
        return true;
    }
}