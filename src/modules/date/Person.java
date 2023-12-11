package modules.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.lang.Integer.parseInt;


public class Person {
    private final String name;
    private final GregorianCalendar bdate;

    public Person(String name, String d) throws ParseException, NumberFormatException {
        this.name = name;
        //alternative DateFormat
        //DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        //df.parse(d);
        //df.format
        String[] parts = d.split("\\.");
        if (parts.length == 3) {
            int year, month, date;
            year = parseInt(parts[2]);
            month = parseInt(parts[1]) - 1;
            date = parseInt(parts[0]);
            this.bdate = new GregorianCalendar(year, month, date);
        } else {
            throw new ParseException("Failed to extract date", parts.length + 1);
        }
    }

    @Override
    public String toString() {
        int year = this.bdate.get(Calendar.YEAR);
        int month = this.bdate.get(Calendar.MONTH) + 1;
        int day = this.bdate.get(Calendar.DAY_OF_MONTH);
        return String.format("Name: %s Birthdate: %d.%d.%d", this.name, day, month, year);
    }
}
