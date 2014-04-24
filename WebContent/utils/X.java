package utils;

import java.util.Calendar;

public final class X {
	public static void log(Object o){
		Calendar dt = Calendar.getInstance();
		System.out.println(dt.getTime().toString() + ": " + 
				((o == null) ? "null" : o.toString()));
	}
}
