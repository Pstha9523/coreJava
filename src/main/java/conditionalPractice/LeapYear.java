package conditionalPractice;

public class LeapYear {
// making the year var private to encapsulate.
    private int year;

    public LeapYear(int y){
        this.year = y;

    }

    public boolean isLeap(){
        if(year % 4 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
       LeapYear leapYear2024 = new LeapYear(2024);
        System.out.println(leapYear2024.isLeap());

        LeapYear leapYear2025 = new LeapYear(2025);
        System.out.println(leapYear2025.isLeap());
    }


}
