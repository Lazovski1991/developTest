package my.company.front.service;

import my.company.front.dto.DeveloperDto;
import my.company.front.model.DaysWeek;
import my.company.front.model.Developer;

import java.util.List;
import java.util.UUID;

public interface DeveloperService {
    List<Developer> addDeveloper(DeveloperDto developer);

    List<Developer> getDevelopers(String day);

    Developer getDeveloper(UUID id);

    List<Developer> removeDeveloper(UUID id);
}
