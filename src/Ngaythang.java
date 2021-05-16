
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import java.util.TimeZone;

public class Ngaythang {

    public static void main(String args[]) {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        Date date = calendar.getTime();
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
        int Ngay = calendar.get(Calendar.DATE);
        int Thang = calendar.get(Calendar.MONTH) + 1;
        int Nam = calendar.get(Calendar.YEAR);
        int Gio = calendar.get(Calendar.HOUR_OF_DAY);
        int Phut = calendar.get(Calendar.MINUTE);
        int Giay = calendar.get(Calendar.SECOND);
        int Thu = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("Hom nay la:: " + date);
        System.out.println("Gio:: " + Gio);
        System.out.println("Phut:: " + Phut);
        System.out.println("Giay:: " + Giay + ",");
        System.out.println("Thu: " +simpleDateformat.format(date));
        System.out.println("Ngay:: " + Ngay);
        System.out.println("Thang:: " + Thang);
        System.out.println("Nam: " + Nam);


    }
}
