public class Main {
    public static void main(String[] args) {
        double account = 200; // начальная сумма счета
        double amount = 400; // сумма пополнения счета
        if (amount > 1000) {
            int bonus = (int) (amount / 100); // расчет кол-ва бонусов
            int result = (int) (account + amount + bonus); // итоговая сумма на счете
            System.out.println("Бонусов начислено: " + bonus); // вывод количества бонусов
            System.out.println("Итого на счете: " + result); // итоговая сумма на счете
        } else {
            int bonus = (int) (0); // расчет кол-ва бонусов
            int result = (int) (account + amount + bonus); // итоговая сумма на счете
            System.out.println("Бонусов не начислено"); // вывод отсутствия бонусов
            System.out.println("Итого на счете " + result); // вывод итоговой суммы на счете
        }
    }
}