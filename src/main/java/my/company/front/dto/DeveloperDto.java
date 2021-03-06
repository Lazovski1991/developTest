package my.company.front.dto;

import lombok.Data;
import my.company.front.model.DaysWeek;

import java.util.List;

@Data
public class DeveloperDto {
    private String firstName;
    private String lastName;
    private String patronymic;
    private String position;
    private List<String> stack;
    private int age;
    private int experience;
    private List<DaysWeek> daysWorkList;
}
