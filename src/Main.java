// Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
// Formatta la data ottenuta in FULL, MEDIUM e SHORT
// Stampa le varie versioni

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main{
    public static void main (String[] args){ 

    OffsetDateTime data1 = OffsetDateTime.parse("2002-03-01T13:00:00Z"); 
    System.out.println("data1: " + data1);  

    String dataLong = data1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
    String dataMedium = data1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
    String dataShort = data1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)); 
    System.out.println("dataLong: " + dataLong);
    System.out.println("dataMed: " + dataMedium);
    System.out.println("dataShort: " + dataShort); 
    } 
}