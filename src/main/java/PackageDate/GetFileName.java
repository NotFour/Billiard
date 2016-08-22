package PackageDate;

import java.util.Date;

public class GetFileName {
    public static String getFileName() {
        Date data1 = new Date();
        return "D://MyTraining/" + String.valueOf(data1.getDate()) + "_" + String.valueOf(data1.getMonth()) + ".txt";
    }
}
