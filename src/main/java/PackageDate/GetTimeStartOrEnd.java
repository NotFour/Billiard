package PackageDate;

import java.util.Date;

public class GetTimeStartOrEnd {
    public static String getTime() {
        Date date1 = new Date();
        return String.valueOf(date1.getHours()) + ":" + String.valueOf(date1.getMinutes());
    }
}
