package my.company.front.model;

import lombok.Getter;
import my.company.front.exception.DeveloperException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public enum DaysWeek {
    MONDAY("понедельник"),
    TUESDAY("вторник"),
    WEDNESDAY("среда"),
    THURSDAY("четверг"),
    FRIDAY("пятница");

    private String value;

    DaysWeek(String value) {
        this.value = value;
    }

    public static DaysWeek getDay(String value) {
        return Arrays.stream(DaysWeek.values())
                .filter(dayValue -> dayValue.getValue().equalsIgnoreCase(value))
                .findFirst()
                .orElseThrow(() -> new DeveloperException("this days not exist"));
    }

    public static List<DaysWeek> convertList(List<String> days) {
        return days
                .stream()
                .map(DaysWeek::getDay)
                .collect(Collectors.toList());
    }
}
