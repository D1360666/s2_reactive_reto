package co.com.sofka.repository;

import co.com.sofka.model.Activity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends ReactiveMongoRepository<Activity, String> {

}
