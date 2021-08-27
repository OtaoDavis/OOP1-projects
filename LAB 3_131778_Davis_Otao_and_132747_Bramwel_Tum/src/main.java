import java.time.Year;

public class main {
    public static void main(String args[]){


        //Get all years divisible by 14 and 20
        YearRange myFirstRange = new YearRange(1314,2014);
        myFirstRange.setRangetype(1);
        myFirstRange.setFirstdivisor(14);
        myFirstRange.setSeconddivisor(20);

        //the leap year range
        YearRange mySecondRange = new YearRange(1100,3150);
        mySecondRange.setRangetype(2);


        //Olympic years range
        YearRange myThirdRange= new YearRange(1500,1890);
        myThirdRange.setRangetype(3);

        System.out.println("\nList of all years divisible by  "+myFirstRange.getfirstdivisor()+
                "and" +myFirstRange.getSeconddivisor());
        myFirstRange.showdivisibleYears();

        System.out.println("\nList of all leap years between   "+mySecondRange.getfirstleap()+
                "and" +mySecondRange.getlastleap());
        mySecondRange.showleapYears();

        System.out.println("\nList of all olympic years between  "+myThirdRange.getfirstolympicyear()+
                "and" +myThirdRange.getlastolympicyear());
        myThirdRange.showolympicYears();

        System.out.println("Developed by;\n\t\t~~131778 Davis Otao and 132747 Bramwel Tum~~");


    }
}