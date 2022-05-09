package my.company.front.controller;

import io.swagger.v3.oas.annotations.Operation;
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
    @Operation(description = "Добавление девелопера")
    public List<Developer> addDeveloper(@RequestBody DeveloperDto dto) {
        return developerService.addDeveloper(dto);
    }

    @GetMapping
    @Operation(description = "Получение девепоперов")
    public List<Developer> getDevelopers(@RequestParam(required = false) String day) {
        return developerService.getDevelopers(day);
    }

    @GetMapping("/{id}")
    @Operation(description = "Получение девепопера по ид")
    public Developer getDeveloper(@PathVariable UUID id) {
        return developerService.getDeveloper(id);
    }

    @DeleteMapping("/{id}")
    @Operation(description = "Удаление девелопера")
    public List<Developer> removeDeveloper(@PathVariable UUID id) {
        return developerService.removeDeveloper(id);
    }
}
