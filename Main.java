public class Main {
    public static void main(String[] args) {
        double[] balances = {15000.50, -420.00, 0.0, -2500.85, 7300.00};

        System.out.println("--- Список должников (счета с отрицательным балансом) ---");

        for (int i = 0; i < balances.length; i++) {
            if (balances[i] < 0) 
                System.out.printf("Счет №%d | Сумма долга: %.2f руб.%n", (i + 1), balances[i]);
            }
        }

        System.out.println("\nМодуль успешно инициализирован в Git!");
    }
}
