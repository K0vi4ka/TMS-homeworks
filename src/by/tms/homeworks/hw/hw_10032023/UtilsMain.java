package by.tms.homeworks.hw.hw_10032023;

public class UtilsMain {
    public static void main(String[] args) {
        System.out.println(StringUtils.getLastChar("some text"));
        System.out.println(StringUtils.isStrEndToExclamation("some text!!!"));
        System.out.println(StringUtils.isStrStartToText("Сиреневенький синхрофазатрон текст текст текст"));
        System.out.println(StringUtils.isStrHaveSubstr("some str", "ome"));
        System.out.println(StringUtils.strToUpperCase("to upper case"));
        System.out.println(StringUtils.strToLowerCase("TO LOWER CASE"));
        System.out.println(StringUtils.solveTask(1, 2, '+'));
        System.out.println(StringUtils.changeChar("3+1=10"));
        System.out.println(StringUtils.printMiddleChar("good", "day"));
        System.out.println(StringUtils.findPalidrom("Око за око, зуб за зуб"));
        StringUtils.splitStr("some str to split");
    }
}
