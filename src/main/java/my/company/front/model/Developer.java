package my.company.front.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.UUID;

@Data
@Accessors(chain = true)
public class Developer {
    private UUID id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String position;
    private List<String> stack;
    private int age;
    private int experience;
    private List<DaysWeek> daysWorkList;
}
