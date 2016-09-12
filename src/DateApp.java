
public class DateApp {
	public static void main(String[] args)
	{
		DateUtil d = new DateUtil();
		
		d.setMonth(10);
		d.setYear(2016);
		
		System.out.println(d.displayCalender(d.getMonth(),d.getYear()));

	}
}
