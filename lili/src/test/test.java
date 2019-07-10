package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
	public static void main(String[] args) {
		 Date date=new Date();
		 System.out.println(date);
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	     System.out.println(sdf.format(date));
	     sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	     System.out.println(sdf.format(date));
	     sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
	     System.out.println(sdf.format(date));
	     
	     String string = "2016-10-24 21:59:06:111";
	     SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	     try {
			System.out.println(sdf2.parse(string));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	     String date2 = "2015-12-7T16:00:00.000Z"; 
	     date2 = date2.replace("Z", " UTC");//注意是空格+UTC
	     SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");//注意格式化的表达式
	     try {
			Date d = format1.parse(date2 );
			SimpleDateFormat format2 = new SimpleDateFormat("yyyyMMdd");
			String string2 = format2.format(d);
			System.out.println(string2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     String covertDateStrFormat = covertDateStrFormat("2015-12-7T16:00:00.000Z", "yyyy-MM-dd'T'HH:mm:ss.SSS Z", "yyyyMMdd");
	     System.out.println(covertDateStrFormat);
	     
	     
	     
	}
	public static  String covertDateStrFormat(String dateStr, String srcFormat, String descFormat) {
        SimpleDateFormat format_src = new SimpleDateFormat(srcFormat);
        SimpleDateFormat format_desc = new SimpleDateFormat(descFormat);
        try {
            Date date = format_src.parse(dateStr);
            dateStr = format_desc.format(date);
        } catch (ParseException e) {
        }
        return dateStr;
    }
 
}
