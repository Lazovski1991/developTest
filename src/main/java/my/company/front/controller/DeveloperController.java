package my.company.front.controller;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import my.company.front.dto.DeveloperDto;
import my.company.front.model.Developer;
import my.company.front.service.DeveloperService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/developer")
public class DeveloperController {
    private final DeveloperService developerService;

    @PostMapping
    @ApiOperation("Добавление девелопера")
    public List<Developer> addDeveloper(@RequestBody DeveloperDto dto) {
        return developerService.addDeveloper(dto);
    }

    @GetMapping
    @ApiOperation("Получение девепоперов")
    public List<Developer> getDevelopers(@RequestParam(required = false) String day) {
        return developerService.getDevelopers(day);
    }

    @GetMapping("/{id}")
    @ApiOperation("Получение девепопера по ид")
    public Developer getDeveloper(@PathVariable UUID id) {
        return developerService.getDeveloper(id);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("Удаление девелопера")
    public List<Developer> removeDeveloper(@PathVariable UUID id) {
        return developerService.removeDeveloper(id);
    }
}
