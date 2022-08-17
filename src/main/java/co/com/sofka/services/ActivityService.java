package co.com.sofka.services;

import co.com.sofka.dto.ActivityDto;
import co.com.sofka.repository.ActivityRepository;
import co.com.sofka.utils.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ActivityService {

    @Autowired
    private ActivityRepository repo;

    public Flux<ActivityDto>getActivities(){
        return repo.findAll().map(AppUtils::entityToDto);
    }

    public Mono<ActivityDto> getActivity(String id){
        return repo.findById(id).map(AppUtils::entityToDto);
    }

    public Mono<ActivityDto> saveActivity(Mono<ActivityDto> activityDtoMono){
        return activityDtoMono.map(AppUtils::dtoToEntity)
                .flatMap(repo::insert)
                .map(AppUtils::entityToDto);
    }

    public Mono<ActivityDto> updateActivity(Mono<ActivityDto> activityDtoMono, String id){
        return repo.findById(id)
                .flatMap(p -> activityDtoMono.map(AppUtils::dtoToEntity)
                        .doOnNext(e->e.setId(id)))
                .flatMap(repo::save)
                .map(AppUtils::entityToDto);
    }

    public Mono<Void> deleteActivity(String id){
        return repo.deleteById(id);
    }
}
