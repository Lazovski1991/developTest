package my.company.front.service;

import lombok.RequiredArgsConstructor;
import my.company.front.dto.DeveloperDto;
import my.company.front.model.DaysWeek;
import my.company.front.model.Developer;
import my.company.front.repo.DeveloperRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DeveloperServiceImpl implements DeveloperService {
    private final DeveloperRepo repo;

    @Override
    public List<Developer> addDeveloper(DeveloperDto developerDto) {
        Developer developer = new Developer()
                .setId(UUID.randomUUID())
                .setAge(developerDto.getAge())
                .setExperience(developerDto.getExperience())
                .setFirstName(developerDto.getFirstName())
                .setLastName(developerDto.getLastName())
                .setPatronymic(developerDto.getPatronymic())
                .setStack(developerDto.getStack())
                .setPosition(developerDto.getPosition())
                .setDaysWorkList(developerDto.getDaysWorkList());

        return repo.addDeveloper(developer);
    }

    @Override
    public List<Developer> getDevelopers(String day) {
        return day == null ? repo.getDevelopers() : repo.getDevelopersDays(DaysWeek.getDay(day));
    }

    @Override
    public Developer getDeveloper(UUID id) {
        return repo.getDeveloperById(id);
    }

    @Override
    public List<Developer> removeDeveloper(UUID id) {
        return repo.deleteDeveloperById(id);
    }
}
