public class LeapYears {
    public static boolean isLeapYear (int number){
        boolean isALeapYear = false;

        if ((number % 4 == 0) && (number % 100 !=0) ||(number % 400 == 0)) {
            isALeapYear = true;
            }
        return isALeapYear;
    }


}
