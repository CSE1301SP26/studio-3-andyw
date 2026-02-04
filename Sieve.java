import java.util.Scanner;
public class Sieve {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the value n: ");
        int n = in.nextInt();
        boolean[] prime = new boolean[n+1];
        for (int i = 2; i <= n; i++){
            prime[i] = true;
        }
        for (int j = 2; j * j <= n; j++){
            if (prime[j]){
                for(int i = j * j; i <= n; i+=j){
                    prime[i] = false;
                }
            }
        }
        System.out.println("prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++){
            if (prime[i]){
                System.out.println(i);
            }
        }
    }
}
