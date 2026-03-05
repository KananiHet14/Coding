public class ArgPara {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;              // numbers <= 1 are not prime

        for (int i = 2; i * i <= n; i++) {    // check divisors up to sqrt(n)
            if (n % i == 0) return false;      // found a divisor, not prime
        }
        return true;                           // no divisor found, it's prime
    }

    public static void main(String[] args) {
        System.out.println(isPrime(7));        // true
        System.out.println(isPrime(10));       // false
        System.out.println(isPrime(1));        // false
    }
}