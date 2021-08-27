import java.util.ArrayList;
import java.util.List;

public class YearRange {

    public int firstdivisor;
    public int seconddivisor;

    public void setRangetype(int i) {
    }


    public YearRange(int firstdivisor, int seconddivisor) {
        this.firstdivisor = firstdivisor;
        this.seconddivisor = seconddivisor;
    }


    public void setFirstdivisor(int divOne) {
        this.firstdivisor = divOne;
    }

    public void setSeconddivisor(int divTwo) {
        this.seconddivisor = divTwo;
    }

    public void showdivisibleYears() {
        List<Integer> range_limits = new ArrayList<>();
        int firstYear = 1314;
        int secondYear = 2014;
        for (int x = 0; x <= secondYear; x++) {
            int add_year = firstYear + x;
            range_limits.add(add_year);
            if (add_year == secondYear) {
                break;
            }
        }
        Years_divisibleby14_and_20(range_limits);
    }

    private void Years_divisibleby14_and_20(List<Integer> range_limits) {
        for (int x = 0; x < range_limits.size(); ++x) {
            if ((range_limits.get(x) % 14) + (range_limits.get(x) % 20) == 0) {
                System.out.println(range_limits.get(x));
            }
        }
    }


    public int getfirstdivisor() {
        return firstdivisor;
    }

    public int getSeconddivisor() {
        return seconddivisor;
    }

    //for olympic range
    public int getfirstolympicyear() {
        int firstolympicyear = 1500;
        return firstolympicyear;
    }

    public int getlastolympicyear() {
        int lastolympicyear = 1890;
        return lastolympicyear;
    }


    public int getolympicdivisor() {
        int olympicdivisor = 3;
        return olympicdivisor;
    }

    public void showolympicYears() {
        List<Integer> range_limits = new ArrayList<>();
        int firstYear = 1500;
        int lastYear = 1890;
        for (int x = 0; x <= lastYear; x++) {
            int add_year = firstYear + x;
            range_limits.add(add_year);
            if (add_year == lastYear) {
                break;
            }
        }
        Years_olympic(range_limits);
    }


    public void Years_olympic(List<Integer> olympicRange) {
        for (int x = 0; x < olympicRange.size(); ++x) {
            if ((olympicRange.get(x) % 3) == 0) {
                System.out.println(olympicRange.get(x));
            }
        }
    }

    //for leap year range
    public int getfirstleap() {
        int firstleap = 1100;
        return firstleap;
    }

    public int getlastleap() {
        int lastleap = 3150;
        return lastleap;

    }

    public void showleapYears() {
        List<Integer> range_leap = new ArrayList<>();
        int firstleap = 1100;
        int lastleap = 3150;
        for (int x = 4; x <= lastleap; x++) {
            int add_year = firstleap + x;
            range_leap.add(add_year);
            if (add_year == lastleap) {
                break;
            }
        }
        Years_leap(range_leap);
    }

    private void Years_leap(List<Integer> range_leap) {
        for (int x = 0; x < range_leap.size(); ++x) {
            if (((range_leap.get(x) % 4) & (range_leap.get(x) % 400))== 0) {
                System.out.println(range_leap.get(x));
            }
        }
    }
}