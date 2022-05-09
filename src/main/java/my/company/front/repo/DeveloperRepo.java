package my.company.front.repo;

import my.company.front.exception.DeveloperException;
import my.company.front.model.DaysWeek;
import my.company.front.model.Developer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class DeveloperRepo {
    private static final List<Developer> list = new ArrayList<>();
    static {
        list.add(new Developer()
                .setId(UUID.randomUUID())
                .setFirstName("Петров")
                .setLastName("Петр")
                .setPatronymic("Петрович")
                .setAge(22)
                .setPosition("senior")
                .setStack(List.of(("java, spring")))
                .setDaysWorkList(List.of(DaysWeek.MONDAY, DaysWeek.THURSDAY))
                .setExperience(2));
        list.add(new Developer()
                .setId(UUID.randomUUID())
                .setFirstName("Иванов")
                .setLastName("Иван")
                .setPatronymic("Иванович")
                .setAge(25)
                .setPosition("junior")
                .setStack(List.of(("groovy, spring")))
                .setDaysWorkList(List.of(DaysWeek.TUESDAY, DaysWeek.WEDNESDAY))
                .setExperience(2));
        list.add(new Developer()
                .setId(UUID.randomUUID())
                .setFirstName("Сидоров")
                .setLastName("Семен")
                .setPatronymic("Семенович")
                .setAge(28)
                .setPosition("middle")
                .setStack(List.of(("java, spring")))
                .setDaysWorkList(List.of(DaysWeek.MONDAY, DaysWeek.FRIDAY))
                .setExperience(2));
        list.add(new Developer()
                .setId(UUID.randomUUID())
                .setFirstName("Васильев")
                .setLastName("Василий")
                .setPatronymic("Васильевич")
                .setAge(24)
                .setPosition("middle")
                .setStack(List.of(("javascript, react")))
                .setDaysWorkList(List.of(DaysWeek.TUESDAY, DaysWeek.FRIDAY))
                .setExperience(2));
        list.add(new Developer()
                .setId(UUID.randomUUID())
                .setFirstName("Качанов")
                .setLastName("Александр")
                .setPatronymic("Петрович")
                .setAge(32)
                .setPosition("junior")
                .setStack(List.of(("go, spring")))
                .setDaysWorkList(List.of(DaysWeek.WEDNESDAY, DaysWeek.THURSDAY))
                .setExperience(2));
        list.add(new Developer()
                .setId(UUID.randomUUID())
                .setFirstName("Сум")
                .setLastName("Семен")
                .setPatronymic("Петрович")
                .setAge(23)
                .setPosition("middle")
                .setStack(List.of(("kotlin, spring")))
                .setDaysWorkList(List.of(DaysWeek.MONDAY, DaysWeek.WEDNESDAY))
                .setExperience(5));
        list.add(new Developer()
                .setId(UUID.randomUUID())
                .setFirstName("Рыжков")
                .setLastName("Павел")
                .setPatronymic("Васильевич")
                .setAge(26)
                .setPosition("senior")
                .setStack(List.of(("c++, unreal")))
                .setDaysWorkList(List.of(DaysWeek.WEDNESDAY, DaysWeek.FRIDAY))
                .setExperience(2));
        list.add(new Developer()
                .setId(UUID.randomUUID())
                .setFirstName("Капустин")
                .setLastName("Петр")
                .setPatronymic("Михайлович")
                .setAge(25)
                .setPosition("junior")
                .setStack(List.of(("java, spring")))
                .setDaysWorkList(List.of(DaysWeek.MONDAY, DaysWeek.THURSDAY))
                .setExperience(2));
        list.add(new Developer()
                .setId(UUID.randomUUID())
                .setFirstName("Александров")
                .setLastName("Василий")
                .setPatronymic("Сергеевич")
                .setAge(29)
                .setPosition("middle")
                .setStack(List.of(("javascript, angular")))
                .setDaysWorkList(List.of(DaysWeek.WEDNESDAY, DaysWeek.FRIDAY))
                .setExperience(6));
        list.add(new Developer()
                .setId(UUID.randomUUID())
                .setFirstName("Алик")
                .setLastName("Семен")
                .setPatronymic("Михайлович")
                .setAge(55)
                .setPosition("boss")
                .setStack(List.of())
                .setDaysWorkList(List.of(DaysWeek.MONDAY, DaysWeek.THURSDAY))
                .setExperience(2));
        list.add(new Developer()
                .setId(UUID.randomUUID())
                .setFirstName("Лука")
                .setLastName("Александр")
                .setPatronymic("Грыгорыч")
                .setAge(66)
                .setPosition("student")
                .setStack(List.of())
                .setDaysWorkList(List.of(DaysWeek.MONDAY))
                .setExperience(44));
        list.add(new Developer()
                .setId(UUID.randomUUID())
                .setFirstName("Пу")
                .setLastName("Володя")
                .setPatronymic("Петрович")
                .setAge(44)
                .setPosition("junior")
                .setStack(List.of(("scala")))
                .setDaysWorkList(List.of(DaysWeek.TUESDAY))
                .setExperience(3));
        list.add(new Developer()
                .setId(UUID.randomUUID())
                .setFirstName("Синий")
                .setLastName("Александр")
                .setPatronymic("Владимирович")
                .setAge(27)
                .setPosition("middle")
                .setStack(List.of(("java, spring")))
                .setDaysWorkList(List.of(DaysWeek.WEDNESDAY, DaysWeek.THURSDAY))
                .setExperience(4));


    }

    public List<Developer> addDeveloper(Developer developer) {
        list.add(developer);
        return list;
    }

    public List<Developer> getDevelopers() {
        return list;
    }

    public List<Developer> getDevelopersDays(DaysWeek daysWeek) {
        return list.stream()
                .filter(dev -> dev.getDaysWorkList().contains(daysWeek))
                .collect(Collectors.toList());
    }

    public Developer getDeveloperById(UUID uuid) {
        return list
                .stream()
                .filter(developer -> developer.getId().equals(uuid))
                .findFirst()
                .orElseThrow(() -> new DeveloperException("user not found"));
    }

    public List<Developer> deleteDeveloperById(UUID uuid) {
        Developer developer = getDeveloperById(uuid);
        list.remove(developer);
        return list;
    }
}
