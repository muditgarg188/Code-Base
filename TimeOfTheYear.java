package testPackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeOfTheYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long seconds = 68169600;
		Date date = new Date();
		date.setTime(seconds*1000);
		SimpleDateFormat sf = new SimpleDateFormat("dd-MMM-yyyy");
		System.out.print(sf.format(date).toString().toUpperCase());
		sf = new SimpleDateFormat("EEEE");
		System.out.print(" "+sf.format(date));
	}

}
