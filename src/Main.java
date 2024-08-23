public class Main {
    public static void main(String[] args) {

        int userBalance = 300;
        int added = 1300;
        int bonus = 0;

        if (added > 1000) {
            bonus = (added / 100);
        } else {
            bonus = 0;
        }
        int summary;
        summary = userBalance + added + bonus;
        System.out.println(" Бонус: " + bonus);
        System.out.println(" Итоговая сумма на счету клиента: " + summary);
    }
}

