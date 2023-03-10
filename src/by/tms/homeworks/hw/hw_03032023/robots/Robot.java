package by.tms.homeworks.hw.hw_03032023.robots;

import by.tms.homeworks.hw.hw_03032023.hands.IHand;
import by.tms.homeworks.hw.hw_03032023.head.IHead;
import by.tms.homeworks.hw.hw_03032023.legs.ILeg;
import by.tms.homeworks.hw.hw_03032023.robots.IRobot;

public class Robot implements IRobot {
    private IHead head;
    private IHand hand;
    private ILeg leg;

    public IHead getHead() {
        return head;
    }

    public void setHead(IHead head) {
        this.head = head;
    }

    public IHand getHand() {
        return hand;
    }

    public void setHand(IHand hand) {
        this.hand = hand;
    }

    public ILeg getLeg() {
        return leg;
    }

    public void setLeg(ILeg leg) {
        this.leg = leg;
    }

    public Robot(IHead head, IHand hand, ILeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    @Override
    public void action() {
        this.head.speak();
        this.hand.upHand();
        this.leg.step();
    }

    @Override
    public int getPrice() {
        return this.head.getPrice() + this.hand.getPrice() + this.leg.getPrice();
    }

    public void getMaxPriceRobotInfo() {
        System.out.printf("Самый дорогой робот имеет голову от %s,руки от %s,ноги от %s", head.getName(), hand.getName(), leg.getName());
    }
}
