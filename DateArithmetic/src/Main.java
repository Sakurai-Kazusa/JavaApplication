import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // 現在時刻を取得する
        Date date = new Date();

        // 日時を指定した時間分変更する
        date = Add_Day(date, 5);

        System.out.println(date);
    }

    public static String displayDate(String inputDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Calendar calendar = Calendar.getInstance();
        try {
            Date d = sdf.parse(inputDate);
            calendar.setTime(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return sdf.format(calendar.getTime());
    }

    public static void echo(String str) {
        System.out.println(str);
    }

    public static Date Add_Day(Date date, int add_date) {

        // データ型をカレンダー型に変換する
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        // 時刻に日付を加算する
        calendar.add(Calendar.DAY_OF_MONTH, add_date);
        date = calendar.getTime();

        return date;
    }

}