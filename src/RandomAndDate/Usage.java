package RandomAndDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Usage {
	public static void main(String[] args) throws ParseException{
		Date date = new Date();
		String format = "dd/mm/yyyy HH:mm";
		SimpleDateFormat df = new SimpleDateFormat(format);
		RandomUsage rnd1=new RandomUsage();
		rnd1.CreateString();
		rnd1.print();
		date=df.parse("09/11/2016 15:12");
		System.out.println(date);
		
		Calendar instance = Calendar.getInstance();
		instance.setTime(new Date(System.currentTimeMillis())); 
		instance.add(Calendar.DAY_OF_MONTH, 3);
		instance.add(Calendar.MONTH, 1);
		instance.add(Calendar.YEAR, 3);
		Date newDate = instance.getTime(); 
		System.out.println(newDate);
}
}
