package by.tms.homeworks.hw.hw_03032023;

import java.util.Date;

public class CardValidMain {
    public static void main(String[] args) {
        BankCardValidate card1 = new BankCardValidate("4444444444444444", "платежная карта", true, new Date(1212121212121L), "432");
        card1.validCardData();
        BankCardValidate card2 = new BankCardValidate("444", "платежная карта", true, new Date(1212121212121L), "432");
        card2.validCardData();
    }
}
