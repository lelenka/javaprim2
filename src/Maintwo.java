        public class Maintwo {
            public static void main(String[] args) {

                int userBalance = 100;
                int added = 1100;
                int bonus = 11;

                if (added > 1000)
                {
                    bonus = (added / 100);
                }
                else {
                    bonus = 0;}
                int summary;
                summary = userBalance + added + bonus;
                System.out.println (" Бонус: " + bonus);
                System.out.println (" Итоговая сумма на счету клиента: " + summary);
    }
}

