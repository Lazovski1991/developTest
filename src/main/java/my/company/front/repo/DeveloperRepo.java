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
                .setId(UUID.fromString("f427b5a9-f053-431b-93c0-cc9124f02bbe"))
                .setFirstName("Петров")
                .setLastName("Петр")
                .setPatronymic("Петрович")
                .setAge(22)
                .setPosition("senior")
                .setStack(List.of(("java, spring")))
                .setDaysWorkList(List.of(DaysWeek.MONDAY, DaysWeek.THURSDAY))
                .setExperience(2));
        list.add(new Developer()
                .setId(UUID.fromString("caf2fbc8-76b3-421b-afbd-7ddf2e545abc"))
                .setFirstName("Иванов")
                .setLastName("Иван")
                .setPatronymic("Иванович")
                .setAge(25)
                .setPosition("junior")
                .setStack(List.of(("groovy, spring")))
                .setDaysWorkList(List.of(DaysWeek.TUESDAY, DaysWeek.WEDNESDAY))
                .setExperience(2));
        list.add(new Developer()
                .setId(UUID.fromString("42022fb6-389d-432c-8a65-07320af362b7"))
                .setFirstName("Сидоров")
                .setLastName("Семен")
                .setPatronymic("Семенович")
                .setAge(28)
                .setPosition("middle")
                .setStack(List.of(("java, spring")))
                .setDaysWorkList(List.of(DaysWeek.MONDAY, DaysWeek.FRIDAY))
                .setExperience(2));
        list.add(new Developer()
                .setId(UUID.fromString("f393d5ef-eac9-4014-b7e8-cd9217799285"))
                .setFirstName("Васильев")
                .setLastName("Василий")
                .setPatronymic("Васильевич")
                .setAge(24)
                .setPosition("middle")
                .setStack(List.of(("javascript, react")))
                .setDaysWorkList(List.of(DaysWeek.TUESDAY, DaysWeek.FRIDAY))
                .setExperience(2));
        list.add(new Developer()
                .setId(UUID.fromString("433c9b18-f9fc-4ab2-a783-63e34fdda14e"))
                .setFirstName("Качанов")
                .setLastName("Александр")
                .setPatronymic("Петрович")
                .setAge(32)
                .setPosition("junior")
                .setStack(List.of(("go, spring")))
                .setDaysWorkList(List.of(DaysWeek.WEDNESDAY, DaysWeek.THURSDAY))
                .setExperience(2));
        list.add(new Developer()
                .setId(UUID.fromString("7c1e69ee-c70d-40e2-be6f-224001d70c90"))
                .setFirstName("Сум")
                .setLastName("Семен")
                .setPatronymic("Петрович")
                .setAge(23)
                .setPosition("middle")
                .setStack(List.of(("kotlin, spring")))
                .setDaysWorkList(List.of(DaysWeek.MONDAY, DaysWeek.WEDNESDAY))
                .setExperience(5));
        list.add(new Developer()
                .setId(UUID.fromString("e6fd6e57-e9a8-4906-a093-2c9923870574"))
                .setFirstName("Рыжков")
                .setLastName("Павел")
                .setPatronymic("Васильевич")
                .setAge(26)
                .setPosition("senior")
                .setStack(List.of(("c++, unreal")))
                .setDaysWorkList(List.of(DaysWeek.WEDNESDAY, DaysWeek.FRIDAY))
                .setExperience(2));
        list.add(new Developer()
                .setId(UUID.fromString("f85d76e9-0657-4c43-8a8e-05103e18efe8"))
                .setFirstName("Капустин")
                .setLastName("Петр")
                .setPatronymic("Михайлович")
                .setAge(25)
                .setPosition("junior")
                .setStack(List.of(("java, spring")))
                .setDaysWorkList(List.of(DaysWeek.MONDAY, DaysWeek.THURSDAY))
                .setExperience(2));
        list.add(new Developer()
                .setId(UUID.fromString("459f0781-2032-4dab-8234-861f66c6a415"))
                .setFirstName("Александров")
                .setLastName("Василий")
                .setPatronymic("Сергеевич")
                .setAge(29)
                .setPosition("middle")
                .setStack(List.of(("javascript, angular")))
                .setDaysWorkList(List.of(DaysWeek.WEDNESDAY, DaysWeek.FRIDAY))
                .setExperience(6));
        list.add(new Developer()
                .setId(UUID.fromString("d519ace9-1ac2-48fb-9efa-5a132f0accba"))
                .setFirstName("Алик")
                .setLastName("Дмитрий")
                .setPatronymic("Михайлович")
                .setAge(55)
                .setPosition("boss")
                .setStack(List.of())
                .setDaysWorkList(List.of(DaysWeek.MONDAY, DaysWeek.THURSDAY))
                .setExperience(2));
        list.add(new Developer()
                .setId(UUID.fromString("5de4ba14-50cc-4ff3-b035-218ff6c4b094"))
                .setFirstName("Лука")
                .setLastName("Александр")
                .setPatronymic("Грыгорыч")
                .setAge(66)
                .setPosition("student")
                .setStack(List.of())
                .setDaysWorkList(List.of(DaysWeek.MONDAY))
                .setExperience(44));
        list.add(new Developer()
                .setId(UUID.fromString("3bc65868-b5c2-4b0f-9357-b6d1fbc3f881"))
                .setFirstName("Пу")
                .setLastName("Володя")
                .setPatronymic("Петрович")
                .setAge(44)
                .setPosition("junior")
                .setStack(List.of(("scala")))
                .setDaysWorkList(List.of(DaysWeek.TUESDAY))
                .setExperience(3));
        list.add(new Developer()
                .setId(UUID.fromString("47b6b1b3-33c2-4cb9-a7db-9fb42f0a9953"))
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
                .toList();
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
