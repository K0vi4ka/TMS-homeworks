package by.tms.homeworks.hw.hw_03032023;

import java.util.Date;

public class BankCardValidate {
    private String cardNumber;
    private String cardType;
    private boolean isHaveOwner;

    private Date date;

    private String cvvCode;

    public BankCardValidate(String cardNumber, String cardType, boolean isHaveOwner, Date date, String cvvCode) {
        this.cardNumber = cardNumber;
        this.cardType = cardType;
        this.isHaveOwner = isHaveOwner;
        this.date = date;
        this.cvvCode = cvvCode;
    }

    private boolean validCardNumber() {
        boolean cardLength = this.cardNumber.length() == 16 ? true : false;
        boolean isCardHaveLetter = true;
        String[] cardNumber = this.cardNumber.split("");
        for (String number : cardNumber) {
            try {
                Character.isDigit(Integer.parseInt(number));
            } catch (NumberFormatException e) {
                isCardHaveLetter = false;
                break;
            }

        }
        return cardLength && isCardHaveLetter ? true : false;
    }

    private boolean validCardType() {
        return this.cardNumber.length() > 8 ? true : false;
    }

    private boolean validCardDate() {
        Date date1 = new Date();
        return this.date.before(date1);
    }

    private boolean validCvv() {
        return this.cvvCode.length() == 3 ? true : false;
    }

    public void validCardData() {
        if (this.validCardDate() && this.validCardNumber() && this.validCardType() && this.validCvv()) {
            System.out.println("Карта действительная");
        } else {
            System.out.println("Карта не действительна");
        }
    }
}
