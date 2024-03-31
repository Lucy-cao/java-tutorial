package defaultmethods;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public interface TimeClient {
    void setTime(int hour, int minute, int second);

    void setDate(int day, int month, int year);

    void setDateAndTime(int day, int month, int year, int hour, int minute, int second);

    LocalDateTime getLocalDateTime();

    static ZoneId getZoneId(String zoneString) {
        try {
            return ZoneId.of(zoneString);
        } catch (DateTimeException e) {
            System.err.println("无效时区字符");
            return ZoneId.systemDefault();
        }
    }

    default ZonedDateTime getZonedDateTime(String zoneString) {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        ZoneId z = getZoneId(zoneString);
        return ZonedDateTime.of(getLocalDateTime(), z);
    }
}
