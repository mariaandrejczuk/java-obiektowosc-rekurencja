//N-ty element ciągu Fibonacciego rekurencyjnie i iteracyjnie:
public class Fibonacci{
    // metoda zwraca n-ty element ciągu Fibonacciego;
    // wersja rekurencyjna;
    public static int fibonacciR(int n) {
        if (n < 2) return n; // jeśli n<2 zwracamy n (dla zera 0 dla jedynki 1)
        return fibonacciR(n - 1) + fibonacciR(n - 2); // jeśli nie to zwracamy sumę elementu poprzedniego i jeszcze wcześniejszego
    }
    // metoda zwraca n-ty element ciągu Fibonacciego;
    // wersja iteracyjna;
    public static int fibonacciP(int n) {
        int A = 0; // zmienne pomocnicze - element poprzedni B i  wcześniejszy A;
        int B = 1;
        int wynik = 0; // zmienna, pod którą podstawimy obliczoną wartość;
        if (n < 2) return n; // jeśli n<2 zwracamy n (dla zera 0, dla jedynki 1);
        // jeśli nie, to liczymy n=ty element ciagu;
        for (int i = 2; i <= n; i++) {
            wynik = A + B; // pod wynik podstawiamy sumę poprzednich elementów;
            A = B; // modyfikujemy zmienne przechowujące;
            B = wynik;  // dwie ostatnie wartości;
        }
        return wynik; // zwracamy wynik
    }
}