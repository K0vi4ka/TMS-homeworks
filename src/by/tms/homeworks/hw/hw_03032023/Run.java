package by.tms.homeworks.hw.hw_03032023;

import by.tms.homeworks.hw.hw_03032023.hands.SamsungHand;
import by.tms.homeworks.hw.hw_03032023.hands.SonyHand;
import by.tms.homeworks.hw.hw_03032023.hands.ToshibaHand;
import by.tms.homeworks.hw.hw_03032023.head.SamsungHead;
import by.tms.homeworks.hw.hw_03032023.head.SonyHead;
import by.tms.homeworks.hw.hw_03032023.head.ToshibaHead;
import by.tms.homeworks.hw.hw_03032023.legs.SamsungLeg;
import by.tms.homeworks.hw.hw_03032023.legs.SonyLeg;
import by.tms.homeworks.hw.hw_03032023.legs.ToshibaLeg;
import by.tms.homeworks.hw.hw_03032023.robots.Robot;

public class Run {
    public static void main(String[] args) {
        SonyHand sonyHand = new SonyHand(100);
        SonyHead sonyHead = new SonyHead(200);
        SonyLeg sonyLeg = new SonyLeg(150);

        SamsungHand samsungHand = new SamsungHand(200);
        SamsungHead samsungHead = new SamsungHead(300);
        SamsungLeg samsungLeg = new SamsungLeg(100);

        ToshibaHand toshibaHand = new ToshibaHand(250);
        ToshibaHead toshibaHead = new ToshibaHead(100);
        ToshibaLeg toshibaLeg = new ToshibaLeg(300);

        Robot robot1 = new Robot(samsungHead, sonyHand, toshibaLeg);
        Robot robot2 = new Robot(sonyHead, samsungHand, sonyLeg);
        Robot robot3 = new Robot(toshibaHead, toshibaHand, samsungLeg);

        Robot[] robots = {robot1, robot2, robot3};

        Robot maxPricerobot = robot1;

        for (Robot robot : robots) {
            robot.action();
            System.out.println("------------------------------------------");
            if (maxPricerobot.getPrice() < robot.getPrice()) {
                maxPricerobot = robot;
            }
        }

        maxPricerobot.getMaxPriceRobotInfo();

    }
}
