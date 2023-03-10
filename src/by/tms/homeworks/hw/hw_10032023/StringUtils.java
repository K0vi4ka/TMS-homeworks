package by.tms.homeworks.hw.hw_10032023;

public class StringUtils {
    private StringUtils() {

    }

    public static char getLastChar(String str) {
        return (char) str.charAt(str.length() - 1);
    }

    public static String isStrEndToExclamation(String str) {
        return str.endsWith("!!!") ? "заканчивается" : "не заканчивается";
    }

    public static String isStrStartToText(String str) {
        return str.startsWith("Сиреневенький синхрофазатрон") ? "начинается" : "не начинается";
    }

    public static String isStrHaveSubstr(String processedString, String substr) {
        return processedString.indexOf(substr) != -1 ? "Строка " + processedString + " содержит строку " + substr : "Строка " + processedString + " не содержит строку " + substr;
    }

    public static String strToUpperCase(String str) {
        return str.toUpperCase();
    }

    public static String strToLowerCase(String str) {
        return str.toLowerCase();
    }

    public static StringBuilder solveTask(int num1, int num2, char sign) {
        float result = 0;
        switch (sign) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(num1);
        stringBuilder.append(sign);
        stringBuilder.append(num2);
        stringBuilder.append('=');
        stringBuilder.append(result);
        return stringBuilder;
    }

    public static StringBuilder changeChar(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        int charIndex = str.indexOf("=");
        stringBuilder.deleteCharAt(charIndex);
        stringBuilder.insert(charIndex, " равно ");
        return stringBuilder;
    }

    public static StringBuilder printMiddleChar(String str1, String str2) {
        StringBuilder stringBuilder = new StringBuilder(2);
        stringBuilder.append((char) str1.charAt(str1.length() - 1));
        stringBuilder.append((char) str2.charAt(0));
        return stringBuilder;
    }

    public static StringBuilder findPalidrom(String str) {
        str = str.replace(',', ' ');
        StringBuilder resultBuilder = new StringBuilder();
        for (String str1 : str.split(" ")) {
            if (str1.toLowerCase().equals(new StringBuilder(str1.toLowerCase()).reverse().toString())) {
                resultBuilder.append(str1 + " ");
            }
        }
        return resultBuilder;
    }

    public static void splitStr(String str) {
        String[] splitArr = str.split(" ");
        for (String str1 : splitArr) {
            System.out.println(str1);
        }
    }
}
