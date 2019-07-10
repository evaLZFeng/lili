package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test2 {
	public static void main(String[] args) {
		String string="20181001 21:34:10:530";
		SimpleDateFormat format1 = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
    	SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	try {
			Date reTime = format1.parse(string);
			System.out.println(reTime);
			System.out.println(format2.format(reTime));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("今天是yyyy年MM月dd日 E kk点mm分ss秒SSSS毫秒");
		System.out.println(simpleDateFormat.format(date));
		/*String string=null;
		System.out.println(string);
		string=new String();
		System.out.println(System.identityHashCode(string));
		string=new String();
		System.out.println(System.identityHashCode(string));
		string=new String();
		System.out.println(System.identityHashCode(string));*/
	}
 
}
