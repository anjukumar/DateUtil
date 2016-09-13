
public class DateApp {
	public static void main(String[] args)
	{
		DateUtil d = new DateUtil();

				
		d.setMonth(10);
		d.setYear(2016);
		
		System.out.println(d.CalcTwoDates(2016, 10, 1, 2016, 12, 2));
		System.out.println(d.displayCalender(d.getMonth(),d.getYear()));
		System.out.println(d.DaysOfWeek(2016, 10, 1));
		System.out.println(d.now());
		System.out.println("Enter format : " +d.now("yyyy-MMM-dd"));

	}
}
