import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double a = sc.nextDouble();
        System.out.print("Введите второе число: ");
        double b = sc.nextDouble();

        System.out.println("Сумма: " + (a + b));
        System.out.println("Разность: " + (a - b));
        System.out.println("Произведение: " + (a * b));
        if (b != 0) {
            System.out.println("Деление: " + (a / b));
        } else {
            System.out.println("Деление на ноль невозможно!");
        }
    }
}
