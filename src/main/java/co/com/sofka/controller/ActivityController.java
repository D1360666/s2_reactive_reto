package co.com.sofka.controller;

import co.com.sofka.dto.ActivityDto;
import co.com.sofka.services.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/activities")
public class ActivityController {

    @Autowired
    private ActivityService service;

    @GetMapping
    public Flux<ActivityDto>getActivities(){
        return service.getActivities();
    }

    @GetMapping("/{id}")
    public Mono<ActivityDto> getActivity(@PathVariable String id){
        return service.getActivity(id);
    }

    @PostMapping
    public Mono<ActivityDto> saveActivity(@RequestBody Mono<ActivityDto> activityDtoMono){
        return service.saveActivity(activityDtoMono);
    }

    @PutMapping("/update/{id}")
    public Mono<ActivityDto> saveActivity(@RequestBody Mono<ActivityDto> activityDtoMono, @PathVariable String id){
        return service.saveActivity(activityDtoMono);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<Void> deleteActivity(@PathVariable String id){
        return service.deleteActivity(id);
    }



}
