package thanksgiving;

import java.util.*;

/**
 * This Java applications gives the exact date when which_number, day_of_week, 
 * month and year are inputed. 
 * 
 * Input is formated  "which_number day_of_week month year [enter]". 
 * Example Input:  1 1 1 2018 [enter]
 * 
 *  - Where which_number is either 1 => 1st, 2 => 2nd, 3 => 3rd...
 *  - day_of_week is 0 => Sunday, 1 => Monday, 2 => Tuesday...
 *  - month is 1 => January, 2 => February, 3 = >March...
 *  - year is some 4-digit positive integer
 *
 * @creator DeAndre Sellers
 * @created 02018.11.22
 * @deasells
 */

public class Thanksgiving {

    public static void main(String[] args) {

        Calendar c = new GregorianCalendar();
        Scanner stdin = new Scanner(System.in);
        
        int nthTime = stdin.nextInt();
        int dayOfWeek = stdin.nextInt();
        int month = stdin.nextInt();
        int year = stdin.nextInt();
        String[] months = {
            "January", "February", "March", "April", "May",
            "June", "July", "August", "September", "October",
            "November", "December"};
        String[] days = {
            "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday"};
        String[] cardinals = {
            "1st ", "2nd ", "3rd ", "4th ", "5th " };

        c.set(c.YEAR, year);
        c.set(c.MONTH, (month - 1));
        c.set(c.DAY_OF_WEEK, (dayOfWeek + 1));
        c.set(c.DAY_OF_WEEK_IN_MONTH, nthTime);

        if ((c.get(c.MONTH) + 1) != month) {
            System.out.println("There are not " + nthTime + " " 
                    + days[dayOfWeek] + "s in " + months[month - 1] 
                    + " of " + year + ".");
        } else {
            System.out.println("The " + cardinals[nthTime - 1] 
                    + days[dayOfWeek] + " of " + months[month - 1] 
                    + " in " + year + " is " + month  + "/" 
                    + c.get(c.DAY_OF_MONTH) + "/" + year + ".");
        }
    }

}