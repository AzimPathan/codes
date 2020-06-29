import java.util.*;

class GetDayFromGivenDate
{

	public static String findDay(int day, int month, int year) {

        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_MONTH,day);
        c.set(Calendar.MONTH,month-1);
        c.set(Calendar.YEAR,year);
        String res="";
        switch(c.getTime().getDay())
        {
            case 0:
                    res = "SUNDAY";
                    break;
            case 1:
                    res = "MONDAY";
                    break;
            case 2:
                    res = "TUESDAY";
                    break;
            case 3:
                    res = "WEDNESDAY";
                    break;
            case 4:
                    res = "THURSDAY";
                    break;
            case 5:
                    res = "FRIDAY";
                    break;
            case 6:
                    res = "SATURDAY";
                    break;
        }
        return res;
    }
    
    // Check leap year
    public static boolean isLeapYear(int year)
    {
        if(year % 4 == 0)
        {
            if(year % 100 == 0)
            {
                if(year % 400 == 0)
                    return true;
                else
                    return false;
            }
            else
                return false;
        }
        return false;
    }

	public static void main(String args[])
	{
        int day, month, year;
        System.out.print("Enter date in DD MM YYYY format : ");
        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();

        if(month < 1 || month > 12)
        {
            System.out.println("Invalid date!");
        }
        else if(day < 1 || day > 31)
        {
            System.out.println("Invalid date!");
        }
        else if(month == 2)
        {
            if(isLeapYear(year))
            {
                if(day > 29)
                    System.out.println("Invalid date!");
                else
                    System.out.println(findDay(day,month,year));
            }
            else if(day > 28)
                System.out.println("Invalid date!");
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11)
        {
            if(day > 30)
                System.out.println("Invalid date!");
            else
                System.out.println(findDay(day,month,year));
        }
        else
    		System.out.println(findDay(day,month,year));
	}
}