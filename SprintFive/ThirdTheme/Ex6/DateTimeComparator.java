package SprintFive.ThirdTheme.Ex6;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class DateTimeComparator implements Comparator<DateTime> {

    @Override
    public int compare(DateTime dt1, DateTime dt2) {
        int year = Integer.compare(dt1.year, dt2.year);
        int month = Integer.compare(dt1.month, dt2.month);
        int day = Integer.compare(dt1.day, dt2.day);
        int hours = Integer.compare(dt1.hours, dt2.hours);
        int minutes = Integer.compare(dt1.minutes, dt2.minutes);
        int seconds = Integer.compare(dt1.seconds, dt2.seconds);

        List<Integer> comp = new ArrayList<>();
        comp = List.of(year, month, day, hours, minutes, seconds);

        for (int c : comp) {
            if (c != 0) {
                return c;
            }
        }
        return 0;
    }
}