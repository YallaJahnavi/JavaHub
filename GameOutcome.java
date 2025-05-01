import java.util.Scanner;

public class GameOutcome {
    private static final int MOD = 998244353;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int N = sc.nextInt(); // Size of the array
            int half = N / 2;

            long totalDistributions = combination(N, half);

            long avaWins = 0, benWins = 0, draw = 0;

            for (int mask = 0; mask < (1 << N); mask++) {
                if (Integer.bitCount(mask) != half) continue;

                boolean avaHasMax = false;
                boolean benHasMax = false;

                for (int i = 0; i < N; i++) {
                    if ((mask & (1 << i)) != 0 && i == N - 1) {
                        avaHasMax = true;
                    } else if ((mask & (1 << i)) == 0 && i == N - 1) {
                        benHasMax = true;
                    }
                }

                if (avaHasMax) {
                    avaWins++;
                } else if (benHasMax) {
                    benWins++;
                } else {
                    draw++;
                }
            }

            System.out.printf("%d %d %d%n", avaWins % MOD, benWins % MOD, draw % MOD);
        }
    }

    private static long combination(int n, int r) {
        long result = factorial(n);
        result = result * modInverse(factorial(r), MOD) % MOD;
        result = result * modInverse(factorial(n - r), MOD) % MOD;
        return result;
    }

    private static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i % MOD;
        }
        return result;
    }

    private static long modInverse(long a, int mod) {
        return power(a, mod - 2, mod);
    }

    private static long power(long base, long exp, int mod) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) result = result * base % mod;
            base = base * base % mod;
            exp >>= 1;
        }
        return result;
    }
}
