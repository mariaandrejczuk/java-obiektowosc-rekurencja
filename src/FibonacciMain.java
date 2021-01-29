import java.util.Scanner;

public class FibonacciMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj element ciągu Fibonacciego, który chcesz obliczyć: ");
        // pobieramy od użytkownika liczbę
        int n = scanner.nextInt();

        // wyświetlamy na ekranie obliczony element

        Fibonacci fibonacci = new Fibonacci();
            long fibR, fibI = n;
            System.out.println(n + "-ty element ciągu Fibonacciego (rekurencja) wynosi: " + fibonacci.fibonacciR(n));
            System.out.println(n + "-ty element ciągu Fibonacciego (iteracja) wynosi: " + fibonacci.fibonacciP(n));
        }
}
