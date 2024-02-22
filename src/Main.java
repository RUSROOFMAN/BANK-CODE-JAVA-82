public class Main {
    public static void main(String[] args) {
        System.out.println("Введите сумму пополнения: ");
        int amounte = 1100;                                                 // Сумма внесения
        System.out.println("Cумма пополнения:" + amounte);
        int cashAccount = 100;                                              // Баланс денежного счёта
        int amountOfMoney = (amounte + cashAccount);                        // Сумма денег внесенныхна аккаунт
        int percent;
        if (amounte > -1000) {
            percent = 1;
        } else {
            percent = 0;
        }
        int bonus = (amounte / 100 * percent);                               // Cумма бонуса от внесённой  суммы
        {
            int sum = (amounte + cashAccount + bonus);                       // Сумма средств с бонусом
            System.out.println("Сумма успешно внесена!");                    // Сообщение об успешном пополнении счёта
            System.out.println("Сумма счёта без бонусов:" + amountOfMoney);  // Сумма счёта без бонусов
            System.out.println("Баланс счёта с учётом бонусов:" + sum);      // Сумма счёта с бонусами

        }
    }
}
