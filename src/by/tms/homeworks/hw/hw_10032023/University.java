package by.tms.homeworks.hw.hw_10032023;

public class University {
    private int universityNumber;
    private int studentCount;
    private Season season;

    public University(int universityNumber, int studentCount,Season season) {
        this.universityNumber = universityNumber;
        this.studentCount = studentCount;
        this.season = season;
    }

    private String getUniversityState() {
        if(this.season == Season.SUMMER) {
            return "отдыхаем";
        }
        return "учимся";
    }

    @Override
    public String toString() {
        return "Школа №"+this.universityNumber +
                ", учащихся "+ this.studentCount+
                ", сейчас мы "+ this.getUniversityState();
    }
}
