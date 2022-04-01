package odev2.codes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Util {

    public static void datedPrint(String text) {
        DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        System.out.println(formattedDate.format(LocalDateTime.now()) + " : " + text);
    }

}
