import java.util.Scanner;

public class NumberSumTest {
    public static void main(String[] args) {
        int number;
        int sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj swoją liczbę: ");
        number = scan.nextInt();
        System.out.printf("Twoja liczba to %d. Suma jej cyfr to: %d .", number,  NumberSum.numberSum(number, sum));
    }
}
