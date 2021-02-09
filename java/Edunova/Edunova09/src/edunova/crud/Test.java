package edunova.crud;

import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class Test {
	
	public static void main(String[] args) {
		//https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
		SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		Date datum;
		try {
			//datum = df.parse(JOptionPane.showInputDialog("Unesi datum"));
			//System.out.println(datum);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
		gc.set(Calendar.DAY_OF_MONTH, 0);
		gc.set(Calendar.MONTH, 0); //siječanj počinje s indexom 0
		gc.set(Calendar.YEAR,2021);
		gc.set(Calendar.HOUR, 19);
		
		//datum=new Date(gc.getTimeInMillis());
		datum= gc.getTime();
		System.out.println(df.format(datum));
		
	}

}