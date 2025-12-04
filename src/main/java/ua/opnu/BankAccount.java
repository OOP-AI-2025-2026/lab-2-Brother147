package ua.opnu;

public class BankAccount {
    String name;
    double balance;
    double transactionFee;

    void deposit(double amount) {
        // Вносить можно только сумму > 0
        if (amount <= 0) {
            return;
        }
        balance = balance + amount;
    }

    double getBalance() {
        return this.balance;
    }

    boolean withdraw(double amount) {
        // Снимать можно только сумму > 0
        if (amount <= 0) {
            return false;
        }

        double total = amount + transactionFee;
        if (balance >= total) {
            balance -= total;
            return true;
        } else {
            // Денег не хватает — ничего не меняем
            return false;
        }
    }

    boolean transfer(BankAccount receiver, double amount) {
        // Проверка аргументов
        if (receiver == null || amount <= 0) {
            return false;
        }

        double total = amount + transactionFee;
        if (balance >= total) {
            balance -= total;
            receiver.balance += amount;
            return true;
        } else {
            // Недостаточно средств — без изменений
            return false;
        }
    }
}
