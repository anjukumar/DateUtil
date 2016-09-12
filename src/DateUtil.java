import java.util.Calendar;
import java.util.GregorianCalendar;

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
		String dayName = ("\n Sun Mon Tue Wed Thu Fri Sat");
		String months[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Dec"};
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
}


