import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Date; 

public class DateUtil {
	//	String displayCalendar(int month, int year){}
	//	int getLastDayOfMonth(int month, int year){} 
	//	String toString(int month, int day, int year, String delimiter){} //prints the date as mm/dd/yyyy
	//	bool isLeapYear(int year){}

	private int month;
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	private int year;

	static String displayCalender(int month, int year)
	{
		String output = "";
		//String dayName = ("\n Sun Mon Tue Wed Thu Fri Sat");
		month = month -1;
		String months[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		int days[] ={31,28,21,30,31,30,31,31,30,31,30,31};

		if(month==1 && year%4==0)	days[month]= 29;

		GregorianCalendar gc = new GregorianCalendar(year,month,1);
		output += ("\t   " +months[month] + "  " +year);
		output += ("\n Sun  Mon  Tue  Wed  Thu  Fri  Sat \n");
		int x = gc.get(Calendar.DAY_OF_WEEK);
		x = x-1;
		//System.out.print(x);
		//System.out.println(days[month]);
		for(int i=0;i<x;i++)
		{
			output +=("     ");
		}
		for(int y =1;y<=days[month];y++)
		{
			output = String.format("%s%2d   ",output,y);
			if((x+y)%7==0)
				output += "\n";
		}	
		return output;
	}

	public boolean isLeapYear(int year)
	{
		boolean bLeapYear = false;
		bLeapYear = (year % 4 == 0);
		bLeapYear = bLeapYear && (year % 100 != 0);
		bLeapYear = bLeapYear || (year % 400 == 0);
		return bLeapYear;
	}

	public long CalcTwoDates( int year1, int month1 , int day1 , int  year2 , int month2, int day2)
	{

		GregorianCalendar gc1 = new GregorianCalendar(year1, month1, day1);
		GregorianCalendar gc2 = new GregorianCalendar(year2, month2, day2);
		long d1 = gc1.getTimeInMillis();
		long d2 = gc2.getTimeInMillis();

		long diff = d2-d1;
		long millisecondsPerDay = (24*60*60*1000);

		diff =diff/millisecondsPerDay;

		return diff;

	}
	public int DaysOfWeek(int y, int m, int d)
	{

		GregorianCalendar gc = new GregorianCalendar(y, m-1, d);
		int dayofweek =gc.get(Calendar.DAY_OF_WEEK);
		return dayofweek;
	}
	public String now ()
	{
		Date date = Calendar.getInstance().getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(date);
	}
	public String now ( String m)
	{
		//GregorianCalendar gc = new GregorianCalendar(y, m-1, d);
		Date date = Calendar.getInstance().getTime();
		SimpleDateFormat sdf = new SimpleDateFormat(m);
		
		return sdf.format(date);
	}

}


