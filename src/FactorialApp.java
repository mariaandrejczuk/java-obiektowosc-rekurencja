import java.util.Scanner;

public class FactorialApp {
    public static void main(String[] args) {
        //pętla

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("n: ");
            int n = scanner.nextInt();

            //n =  5 --> 1 * 2 * 3 * 4 * 5 lub 5 * 4 * 3 * 2 * 1
            //pętla
            long factorials = n;  //max do 20, powyżej long nie działa
            for (int i = n - 1; i >= 1; i--) {   //bedziemy zmniejszac o jeden
                factorials *= i;
            }
            System.out.println("Factorials (" + n + ") = " + factorials);

            //rekurencja
            Math math = new Math();
            factorials = math.factorials(n);
            System.out.println("Factorials("+n+")");

        }
    }
}
