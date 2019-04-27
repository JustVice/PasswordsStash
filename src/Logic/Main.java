package Logic;

import LogicV2.Run;
import LogicV2.Static;
import Objects.DateModule;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
//        Static.run = new Run();
//        Date date = new Date(2019, 2, 12);
//        System.out.println(date.standard_date_format());
//        System.out.println(date.getId());
        
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	LocalDateTime now = LocalDateTime.now();
	System.out.println(dtf.format(now)); //2016/11/16 12:08:43
        System.out.println(now.getDayOfYear());
        System.out.println(now.getMonthValue());
        
    }
}
