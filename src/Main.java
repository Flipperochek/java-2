public class Main {
    public static void main(String[] args) {

        int count = 300; // сумма на счете
        int addCount = 1100; // сумма пополнения счета 

        int bonus = 0; // количество бонусных рублей
        if (addCount > 0) { // проверка, т.к сумма пополнения была положительной
            if (addCount > 1000) { // "более чем на 1000 рублей"
                bonus = addCount / 100;
            }
            count = count + bonus + addCount;
            System.out.println("На вашем счёте: " + count + " рублей. " + "Ваш бонус: " + bonus + " рублей.");
        } else {
            System.out.println("Сумма пополнения не может быть отрицательной или равна нулю!");
        }
    }
}
