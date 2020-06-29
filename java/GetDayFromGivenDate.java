import java.util.*;

class GetDayFromGivenDate
{

	public static String findDay(int month, int day, int year) {

        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_MONTH,day);
        c.set(Calendar.MONTH,month-1);
        c.set(Calendar.YEAR,year);
        System.out.println(c.getTime());
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

	public static void main(String args[])
	{
		System.out.println(findDay(8,5,2015));
	}
}