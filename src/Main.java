import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        double operand;
        char operation;

        while (true) {
            System.out.printf("Текущее значение: %.2f\nВведите операцию (+, -, *, /) или 'C' для сброса, 'S' для выхода: ", result);
            operation = scanner.next().charAt(0);

            if (operation == 'C') {
                result = 0;
                continue;
            } else if (operation == 'S') {
                break;
            }

            System.out.print("Введите операнд: ");
            operand = scanner.nextDouble();

            switch (operation) {
                case '+':
                    result += operand;
                    break;
                case '-':
                    result -= operand;
                    break;
                case '*':
                    result *= operand;
                    break;
                case '/':
                    if (operand != 0) {
                        result /= operand;
                    } else {
                        System.out.println("Ошибка: Деление на ноль!");
                    }
                    break;
                default:
                    System.out.println("Неподдерживаемая операция");
                    break;
            }
        }

        System.out.println("Программа завершена.");
        scanner.close();
    }
}